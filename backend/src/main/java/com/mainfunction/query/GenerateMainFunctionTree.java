package com.mainfunction.query;

import delicacy.common.BaseHelpUtils;
import delicacy.common.BaseTreeNode;
import delicacy.common.GenericProcessor;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import fix.db.bean.BaseMainFunction;
import fix.db.dao.MainFunction;

import javax.servlet.http.HttpServletRequest;
import java.io.StringReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateMainFunctionTree implements GenericProcessor {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public String execute(String contidions, HttpServletRequest request) throws Exception {
        System.out.println("========== the conditions are ==========" + contidions);
        // 获取组织代码
        int organizationId = 1;
        if (organizationId <= 0) {
            throw new SQLException("获取组织编码失败");
        }
        JSON parser = new JSON(new StringReader(contidions));
        Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
        params.put("organizationId", organizationId);
        String caller = (String) params.get("caller");
        // if (caller == null || !caller.equals("userListView")) {
        // params.put("userId", request.getSession().getAttribute("userId"));
        // }
        System.out.println(params);
        // System.out.println("======================================
        // GenerateMainFunctionTree/execute/params is: " + params);
        List<BaseTreeNode> roots = generateTree(params);
        return BaseTreeNode.toJSON(roots);
    }

    public static List<BaseTreeNode> generateTree(Map<String, Object> params) throws Exception {
        // System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^ params are" +
        // params.toString());
        int organizationId = BaseHelpUtils.getIntValue(params, "organizationId");
        int userId = BaseHelpUtils.getIntValue(params, "userId");
        String caller = BaseHelpUtils.getStringValue(params, "caller");
        MainFunction dao = new MainFunction();
//        QueryDummyMainFunction dao = new QueryDummyMainFunction();
//        ConditionDummyMainFunction condition = new ConditionDummyMainFunction();
        List<BaseMainFunction> main_functions = null;
        switch (caller) {
        case "noVerify":
            main_functions = dao.conditionalLoad();
            break;
        default:
            main_functions = dao.conditionalLoad();
//            condition.setUserId(userId);
//            if (params.containsKey("functionType")) {
//                condition.setFunctionType(BaseHelpUtils.getIntValue(params, "functionType"));
//            }
//            main_functions = dao.execute(condition.getKeyValues(), condition).getCollections();
            break;
        }

        if (main_functions.isEmpty() || main_functions == null)
            return new java.util.ArrayList<>();
        Map<Integer, List<BaseMainFunction>> data = generateParentNodes(main_functions);
        List<BaseTreeNode> roots = generateRoot(data, 0);
        for (BaseTreeNode n : roots) {
            generateNode(n, data);
        }
        return roots;
    }

    public static Map<Integer, List<BaseMainFunction>> generateParentNodes(List<BaseMainFunction> ll) {
        Map<Integer, List<BaseMainFunction>> parentNodes = new HashMap<>();
        for (BaseMainFunction l : ll) {
            Integer parentId = l.getParentId();
            if (!BaseHelpUtils.isNullOrEmpty(l.getIcon())) {
                l.setIcon("classic/resources/images/menu-icons/" + l.getIcon());
            }
            List<BaseMainFunction> children = parentNodes.get(parentId);
            if (children == null) {
                children = new ArrayList<>();
                parentNodes.put(parentId, children);
            }
            children.add(l);
        }
        return parentNodes;
    }

    public static List<BaseTreeNode> generateRoot(Map<Integer, List<BaseMainFunction>> main_functions,
            Integer parentId) {
        List<BaseTreeNode> roots = new ArrayList<>();
        for (BaseMainFunction bd : main_functions.get(parentId)) {
            BaseTreeNode n = new BaseTreeNode();
            n.setId(bd.getFunctionId());
            n.setTitle(bd.getFunctionName());
            n.setAttr(bd);
            roots.add(n);
        }
        return roots;
    }

    public static void generateNode(BaseTreeNode parent, Map<Integer, List<BaseMainFunction>> main_functions) {
        List<BaseTreeNode> children = new ArrayList<>();
        List<BaseMainFunction> childList = main_functions.get(parent.getId());
        if (childList == null || childList.isEmpty())
            return;
        for (BaseMainFunction bd : childList) {
            BaseTreeNode n = new BaseTreeNode();
            n.setId(bd.getFunctionId());
            n.setTitle(bd.getFunctionName());
            n.setAttr(bd);
            children.add(n);
        }
        if (!children.isEmpty()) {
            parent.setChildren(children);
            for (BaseTreeNode n : children) {
                generateNode(n, main_functions);
            }
        }
    }

}
