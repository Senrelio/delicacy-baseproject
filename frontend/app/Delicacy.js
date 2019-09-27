
Ext.define('Delicacy', {

    requires: [
        'Ext.Ajax',
        'Ext.data.*',
        'Ext.menu.*',
        'StringBuilder'
    ],
    statics: {
        /***
        	默认服务器，我们会在Application类中做个判断，如果访问的IP地址
        	是127.0.0.1/localhost我们会认为是开发环境，否则认为是测试/正式环境
        */
        _DEFAULT_SERVER_URL: '/DelicacyServlet',
        _DEFAULT_JSONP_URL: 'http://127.0.0.1:9080/DelicacyServlet',
        _DEFAULT_FETCH_URL: 'http://127.0.0.1:9080/DelicacyServlet',
        _DEFAULT_FILE_SERVER_URL: '/FileUpload',
        _DEFAULT_FILE_JSONP_URL: 'http://127.0.0.1:9080/FileUpload',
        _DEFAULT_MAX_FILE_SIZE: 10,
        _ENV_DEVELOPMENT: true,
        _SYSTEM_MENU_DATA: 'system_menu_data',
        _SYSTEM_DOMAIN_DATA: 'ERPDOMAINDATA',
        _DOMAINVALUESERVICENAME: 'EP_DomainValueProcess',
        _SYSTEMDATAINIT: 'EP_SystemInitProcess',
        _DOMAINVALUEINITED: false,
        _CALLBACK_FUNCTIONS: [],
        _KEYVALUE: {},
        PRIVILEGE_COOKIE:'FUNCTIONLIST',
        _PROCESS_IDS:'processIds',
        // 跟流程相关的常量
        ACTIVITY_SERIAL_NO: "activitySerialNo",
        ACTIVITY_ID: "activityId",
        ACTIVITY_ATTENTION_ID: "systemProcessAttentionId",
        ACTIVITY_TYPE: "activityType",
        EMPLOYEE_ID: "employeeId",
        BUSINESS_NAME: "backViewName",
        ACTIVITY_STATUS: "status",
        ACTIVITY_START: "start",
        ACTIVITY_END: "end",
        ACTIVITY_APPROVAL: "approval",
        ACTIVITY_PROCESSOR: "processor",
        ACTIVITY_ATTENTION: "attention",
        DETAIL_ACTIVITY: "detailSystemProcessActivity",
        DETAIL_LINK: "detailSystemProcessLink",
        ICON_SIZE: 64,
        ARROW_SIZE: 8,
        ICON_APPROVAL_NORMAL: "auditor_normal.png",
        ICON_APPROVAL_ACTIVE: "auditor_active.png",
        ICON_PROCESS_NORMAL: "operator_normal.png",
        ICON_PROCESS_ACTIVE: "operator_active.png",
        ICON_ATTENTION_NORMAL: "insider_normal.png",
        ICON_ATTENTION_ACTIVE: "insider_active.png",
        NODETYPE_START: 0,
        NODETYPE_END: 1,
        NODETYPE_APPROVAL: 2,
        NODETYPE_PROCESSOR: 3,
        NODETYPE_ATTENTION: 4,
        LINK_TYPE_SOLID: 1,
        LINK_TYPE_DASHED: 2,
        APPROVAL_NODE: 'approvalnode',
        APPROVAL_LINK: 'approvallink',
        ICON_START: "start.png",
        ICON_END: "stop.png",
        ICON_PROFIX: "images/",

        /**
         * 改变节点相关连接线的位置
         */
        changeNodeLinkSprites: function(sprites, nodeId, x, y) {
            var spriteArr = [],
                me = this,
                sLen = sprites.length,
                i;
            for (i = 0; i < sLen; i++) {
                var sprite = sprites[i];
                if (Delicacy.isApprovalLink(sprite)) {
                    var attr = sprite.attr;
                    var fromNode = attr.fromNode;
                    var toNode = attr.toNode;
                    if (!Delicacy.isNullOrUndefined(fromNode)) {
                        if (fromNode === nodeId) {
                            var xy = Delicacy.getLinkSuitableXy(x, y, attr.endX, attr.endY);
                            sprite.setAttributes({
                                startX: xy['x'],
                                startY: xy['y']
                            });
                            continue;
                        }
                    }
                    if (!Delicacy.isNullOrUndefined(toNode)) {
                        if (toNode === nodeId) {
                            var xy = Delicacy.getLinkSuitableXy(x, y, attr.startX, attr.startY);
                            sprite.setAttributes({
                                endX: xy['x'],
                                endY: xy['y']
                            });
                        }
                    }
                }
            }
        },

        changeDrawWH: function(draw, surface, x, y, neeAddDrawWH, offsetXY) {
            var surfaceWidth = draw.getWidth(),
                surfaceHeight = draw.getHeight(),
                drawContainer = draw.ownerCt,
                drawH = drawContainer.getHeight(),
                drawW = drawContainer.getWidth(),
                drawScrollX = drawContainer.getScrollX(),
                drawScrollY = drawContainer.getScrollY(),
                dx = x - drawScrollX,
                dy = y - drawScrollY,
                dwx = surfaceWidth - drawW,
                dwy = surfaceHeight - drawH,
                addSzie = 50,
                offsetXY;
            if (Delicacy.isNullOrUndefined(neeAddDrawWH)) {
                neeAddDrawWH = false;
            }
            if (Delicacy.isNullOrUndefined(offsetXY)) {
                offsetXY = 20;
            }
            if (neeAddDrawWH) {
                if ((x + offsetXY) > surfaceWidth) {
                    draw.setWidth(surfaceWidth + addSzie);
                    dwx += addSzie;
                }
                if ((y + offsetXY) > surfaceHeight) {
                    draw.setHeight(surfaceHeight + addSzie);
                    dwy += addSzie;
                }
            }
            //        	console.info( x + ' | ' + y + ' | ' + dx  + ' | ' + dy + ' | ' + drawW + ' | ' + drawH + ' | ' + drawScrollX + '|' + drawScrollY)
            if (dx < offsetXY) {
                if (drawScrollX > addSzie) {
                    drawContainer.setScrollX(drawScrollX - addSzie);
                } else {
                    drawContainer.setScrollX(0);
                }
            }
            if (dy < offsetXY) {
                if (drawScrollY > addSzie) {
                    drawContainer.setScrollY(drawScrollY - addSzie);
                } else {
                    drawContainer.setScrollY(0);
                }
            }
            if ((dx + offsetXY) >= drawW) {
                if ((dwx - drawScrollX) >= addSzie) {
                    //        			console.info('x + add = ' + (dwx - drawScrollX));
                    drawContainer.setScrollX(drawScrollX + addSzie);
                } else {
                    //        			console.info('x = ' + dwx);
                    drawContainer.setScrollX(dwx);
                }
            }
            if ((dy + offsetXY) >= drawH) {
                if ((dwy - drawScrollY) >= addSzie) {
                    //        			console.info('y + add = ' + (drawScrollY + addSzie));
                    drawContainer.setScrollY(drawScrollY + addSzie);
                } else {
                    //        			console.info('y = ' + dwy);
                    drawContainer.setScrollY(dwy);
                }
            }
        },

        /**
         * 判断2个点相对Y轴的角度是否在范围
         * rangeXyType: 1、相对Y轴角范围(处理知会节点连接) 2、相对X轴角度范围(处理审批\处理节点连接) 默认Y
         */
        inNodeAngleRange: function(x1, y1, x2, y2, rangeAngle, rangeXyType) {
            if (Delicacy.isNullOrUndefined(rangeXyType)) {
                rangeXyType = 1;
            }
            var inRange = false;
            var dx = x2 - x1,
                dy = y2 - y1,
                sin = Math.sin,
                x = x1,
                y = y1;
            if (rangeXyType === 1) {
                if (dy === 0) {
                    return inRange;
                }
                if (dx === 0) {
                    if (dy > Delicacy.ICON_SIZE) {
                        inRange = true;
                    }
                } else {
                    var alpha = Math.atan2(dy, dx),
                        abs = Math.abs,
                        PI = Math.PI,
                        angle = alpha * 360 / (2 * PI),
                        absAngle = abs(angle);
                    if (absAngle >= (90 - rangeAngle) && absAngle <= (90 + rangeAngle)) {
                        inRange = true;
                    }
                }
            } else if (rangeXyType === 2) {
                if (dx === 0) {
                    return inRange;
                }
                if (dy === 0) {
                    if (dx > Delicacy.ICON_SIZE) {
                        inRange = true;
                    }
                } else {
                    var alpha = Math.atan2(dy, dx),
                        abs = Math.abs,
                        PI = Math.PI,
                        angle = alpha * 360 / (2 * PI),
                        absAngle = abs(angle);
                    if (absAngle <= rangeAngle || rangeAngle >= (180 - absAngle)) {
                        inRange = true;
                    }
                }
            }
            return inRange;
        },

        /**
         * 计算连接线与点的合适连接坐标
         */
        getLinkSuitableXy: function(x1, y1, x2, y2) {
            var dx = x2 - x1,
                dy = y2 - y1,
                ml = Delicacy.ICON_SIZE / 2,
                sin = Math.sin,
                x = x1,
                y = y1;
            if (dx === 0 || dy === 0) {
                if (dx === 0 && dy === 0) {

                } else {
                    if (dx === 0) {
                        if (y2 > y1) {
                            y += ml + 16;
                        } else {
                            y -= ml;
                        }
                    }
                    if (dy === 0) {
                        if (x2 > x1) {
                            x += ml;
                        } else {
                            x -= ml;
                        }
                    }
                }
            } else {
                var alpha = Math.atan2(dy, dx),
                    abs = Math.abs,
                    PI = Math.PI,
                    angle = alpha * 360 / (2 * PI),
                    absAngle = abs(angle);
                if (absAngle >= 45 && absAngle <= 135) {
                    if (y2 > y1) {
                        // 链接线与点之间有节点名称 多加点距离
                        if (angle >= 45 && angle <= 135) {
                            y += ml + 16;
                        } else {
                            y += ml;
                        }
                    } else {
                        y -= ml;
                    }
                } else {
                    if (x2 > x1) {
                        x += ml;
                    } else {
                        x -= ml;
                    }
                }
            }
            return {
                'x': x,
                'y': y
            };
        },

        getLineDash: function(linkType, lineDashNumber) {
            var lineDNum = 0;
            if (linkType === Delicacy.LINK_TYPE_DASHED) {
                if (Delicacy.isNullOrUndefined(lineDashNumber)) {
                    lineDNum = 4;
                } else {
                    lineDNum = lineDashNumber;
                }
            }
            return [lineDNum];
        },

        isApprovalNode: function(sprite) {
            var flag = false,
                type;
            if (typeof sprite === 'string') {
                type = sprite;
            } else {
                type = sprite.type;
            }
            if (Delicacy.APPROVAL_NODE === type) {
                flag = true;
            }
            return flag;
        },

        isApprovalLink: function(sprite) {
            var flag = false,
                type;
            if (typeof sprite === 'string') {
                type = sprite;
            } else {
                type = sprite.type;
            }
            if (Delicacy.APPROVAL_LINK === type) {
                flag = true;
            }
            return flag;
        },

        getNextConnectPoint: function(node1, node2) {
            if (Delicacy.isNullOrUndefined(node2)) {
                return {
                    x: node1.X + Delicacy.ICON_SIZE,
                    y: node1.Y + Delicacy.ICON_SIZE / 2
                };
            } else {
                var px1 = node1.X,
                    py1 = node1.Y;
                var px2 = px1 + Delicacy.ICON_SIZE,
                    py2 = py1 + Delicacy.ICON_SIZE;
                var pcx1 = (px1 + px2) / 2,
                    pcy1 = (py1 + py2) / 2;
                var nx1 = node2.X,
                    ny1 = node2.Y;
                var nx2 = nx1 + Delicacy.ICON_SIZE,
                    ny2 = ny1 + Delicacy.ICON_SIZE;
                var ncx1 = (nx1 + nx2) / 2,
                    ncy1 = (ny1 + ny2) / 2;
                var dx1 = Math.abs(nx1 - pcx1);
                var dy1 = Math.abs(ny1 - pcy1);
                var miny1 = pcy1 - dx1;
                var maxy1 = pcy1 + dx1;
                var minx1 = pcx1 - dy1;
                var maxx1 = pcx1 + dy1;
                if (nx1 > px2 && ny1 >= miny1 && ny1 <= maxy1) {
                    return {
                        x: px2,
                        y: pcy1
                    };
                } else if (px1 > nx2 && ny1 >= miny1 && ny1 <= maxy1) {
                    return {
                        x: px1,
                        y: pcy1
                    };
                } else if (ny1 > py2 && nx1 >= minx1 && nx1 <= maxx1) {
                    return {
                        x: pcx1,
                        y: py2
                    };
                } else {
                    return {
                        x: pcx1,
                        y: py1
                    };
                }
            }
        },

        getPreviousConnectPoint: function(node1, node2) {
            if (Delicacy.isNullOrUndefined(node2)) {
                return {
                    x: node1.X,
                    y: node1.Y + Delicacy.ICON_SIZE / 2
                };
            } else {
                var px1 = node1.X,
                    py1 = node1.Y;
                var px2 = px1 + Delicacy.ICON_SIZE,
                    py2 = py1 + Delicacy.ICON_SIZE;
                var pcx1 = (px1 + px2) / 2,
                    pcy1 = (py1 + py2) / 2;
                var nx1 = node2.X,
                    ny1 = node2.Y;
                var nx2 = nx1 + Delicacy.ICON_SIZE,
                    ny2 = ny1 + Delicacy.ICON_SIZE;
                var ncx1 = (nx1 + nx2) / 2,
                    ncy1 = (ny1 + ny2) / 2;
                var dx1 = Math.abs(nx1 - pcx1);
                var dy1 = Math.abs(ny1 - pcy1);
                var miny1 = pcy1 - dx1;
                var maxy1 = pcy1 + dx1;
                var minx1 = pcx1 - dy1;
                var maxx1 = pcx1 + dy1;
                if (nx1 > px2 && ny1 >= miny1 && ny1 <= maxy1) {
                    return {
                        x: px2 + Delicacy.ARROW_SIZE,
                        y: pcy1
                    };
                } else if (px1 > nx2 && ny1 >= miny1 && ny1 <= maxy1) {
                    return {
                        x: px1 - Delicacy.ARROW_SIZE,
                        y: pcy1
                    };
                } else if (ny1 > py2 && nx1 >= minx1 && nx1 <= maxx1) {
                    return {
                        x: pcx1,
                        y: py2 + Delicacy.ARROW_SIZE
                    };
                } else {
                    return {
                        x: pcx1,
                        y: py1 - Delicacy.ARROW_SIZE
                    };
                }
            }
        },

        getIconPath: function(nodeType, active) {
            var p = '';
            if (active === "true") {
                switch (nodeType) {
                    case Delicacy.NODETYPE_START:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_START;
                        break;
                    case Delicacy.NODETYPE_END:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_END;
                        break;
                    case Delicacy.NODETYPE_APPROVAL:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_APPROVAL_ACTIVE;
                        break;
                    case Delicacy.NODETYPE_PROCESSOR:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_PROCESS_ACTIVE;
                        break;
                    case Delicacy.NODETYPE_ATTENTION:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_ATTENTION_ACTIVE;
                        break;
                    default:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_APPROVAL_ACTIVE;
                        break;
                }
            } else {
                switch (nodeType) {
                    case Delicacy.NODETYPE_START:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_START;
                        break;
                    case Delicacy.NODETYPE_END:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_END;
                        break;
                    case Delicacy.NODETYPE_APPROVAL:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_APPROVAL_NORMAL;
                        break;
                    case Delicacy.NODETYPE_PROCESSOR:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_PROCESS_NORMAL;
                        break;
                    case Delicacy.NODETYPE_ATTENTION:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_ATTENTION_NORMAL;
                        break;
                    default:
                        p = Delicacy.ICON_PROFIX + Delicacy.ICON_APPROVAL_NORMAL;
                        break;
                }
            }
            return p;
        },

        // 根据下拉数据选项的名字和编码获取显示数据，用于表格单元的数据转换显示
        getLabelByValue: function(keyName, val) {
            var res = '';
            var obj = Delicacy._KEYVALUE[keyName];
            if (Delicacy.isNullOrEmpty(obj))
                return res;
            var arr = obj.data;
            if (Delicacy.isNullOrEmpty(arr))
                return res;
            for (var i = 0; i < arr.length; i++) {
                if (arr[i].value == val) {
                    res = arr[i].label;
                    break;
                }
            }
            return res;
        },

        // 根据父级编码获取下拉数据，比如根据省编码获得市的下拉数据
        getOptionsByParent: function(keyName, parentId, isNumber) {
            if ((typeof parentId) !== 'string') {
                parentId = '' + parentId;
            }
            var res = [];
            var obj = Delicacy._KEYVALUE[keyName];
            if (Delicacy.isNullOrEmpty(obj))
                return res;
            var arr = obj.data;
            if (Delicacy.isNullOrEmpty(arr))
                return res;
            for (var i = 0; i < arr.length; i++) {
                if (parentId == arr[i].parent) {
                    if (!isNumber)
                        res.push({
                            id: arr[i].value,
                            label: arr[i].label
                        });
                    else {
                        var num = Number(arr[i].value);
                        if (isNaN(num))
                            res.push({
                                id: arr[i].value,
                                label: arr[i].label
                            });
                        else
                            res.push({
                                id: num,
                                label: arr[i].label
                            });
                    }
                }
            }
            return res;
        },
        // 获取某一下拉的个数
        getOptionsCount: function(keyName) {
            var obj = Delicacy._KEYVALUE[keyName];
            if (Delicacy.isNullOrEmpty(obj))
                return 0;
            var arr = obj.data;
            if (Delicacy.isNullOrEmpty(arr)) return 0;
            else return arr.length;
        },

        // 根据下拉数据的名字获取下拉数据
        getOptionsByName: function(keyName, isNumber) {
            var res = [];
            var obj = Delicacy._KEYVALUE[keyName];
            if (Delicacy.isNullOrEmpty(obj))
                return res;
            var arr = obj.data;
            if (Delicacy.isNullOrEmpty(arr))
                return res;
            /*
            if (!isNumber)
            	return arr;
            */
            for (var i = 0; i < arr.length; i++) {
                var o = arr[i];
                var num = Number(o.value);
                if (isNaN(num))
                    res.push({
                        id: o.value,
                        label: o.label
                    });
                else
                    res.push({
                        id: num,
                        label: o.label
                    });
            }
            return res;
        },
        // 根据创建某一下拉框的Store
        generateOptionStore: function(keyName, isNumber) {
            var arr = Delicacy.getOptionsByName(keyName, isNumber);
            arr = arr.sort(Delicacy.compareFunction);
            var res = new Ext.data.Store({
                fields: [
                    'id',
                    'label'
                ],
                data: arr
            });
            return res;
        },
        // 根据数据创建Model
        createModel: function(data) {
            var m = Ext.create('Ext.data.Model');
            m.set(data);
            return m;
        },
        // 一般的Grid getData返回的数据都是Ext.util.Collection类型
        // 这个函数就是从Collection中把数据转换成Array
        getDataFromCollection: function(cols) {
            var res = new Array();
            cols.each(function(e) {
                res.push(e.getData());
            });
            return res;
        },

        isDataFound: function(dataToFind, cols, findName, targetName) {
            if (Delicacy.isNullOrUndefined(cols)) return false;
            if (cols.length === 0) return false;
            for (var i = 0; i < cols.length; i++) {
                if (cols[i][targetName] === dataToFind[findName]) return true;
            }
            return false;
        },

        findData: function(dataToFind, cols, compareFunction) {
            if (Delicacy.isNullOrEmpty(cols)) return false;
            for (var i = 0; i < cols.length; i++) {
                if (compareFunction(dataToFind, cols[i])) return true;
            }
            return false;
        },

        compareFunction: function(a, b) {

            return a.id - b.id;
        },
        // 这个函数用于创建依赖于别的字段的下拉值
        generateOptionStoreByParent: function(keyName, parent, isNumber) {
            var arr = Delicacy.getOptionsByParent(keyName, parent, isNumber);
            arr = arr.sort(Delicacy.compareFunction);
            var res = new Ext.data.Store({
                fields: [
                    'id',
                    'label'
                ],
                data: arr
            });
            return res;
        },

        genaretDropdownValues: function(arr) {
            var keyValueMap = Delicacy._KEYVALUE;
            for (var i = 0; i < arr.length; i++) {
                var obj = arr[i];
                var tableName = obj.tableName;
                if (keyValueMap[tableName] === undefined) {
                    keyValueMap[tableName] = {};
                    keyValueMap[tableName].status = 0;
                    keyValueMap[tableName].data = [];
                    keyValueMap[tableName].lastUpdateTime = new Date();
                } else {
                    if (keyValueMap[tableName].status !== 0) {
                        keyValueMap[tableName].status = 0;
                        keyValueMap[tableName].data = [];
                        keyValueMap[tableName].lastUpdateTime = new Date();
                    }
                }
                var noption = {
                    value: obj.keyColumn,
                    label: obj.valueColumn
                };
                if (obj.conditionColumn)
                    noption.parent = obj.conditionColumn;
                keyValueMap[tableName].data.push(noption);
            }
            for (var opt in keyValueMap) {
                if (keyValueMap.hasOwnProperty(opt)) {
                    keyValueMap[opt].status = 1;
                }
            }

        },
        /*
         * 当我们用自己的跨域服务调用的时候，那些临时生成的函数，需要定时清楚
         * 下面这些函数就是用来解决这个问题的，生成临时函数的时候
         * 通过addCallbackFunction加到一个数组中
         */
        addCallbackFunction: function(funcName) {
            Delicacy._CALLBACK_FUNCTIONS.push({
                functionName: funcName,
                status: 0
            });
        },
        // 当回调函数完成时，调用下面这个方法改变回调函数的状态
        changeCallbackFunctionToComplete: function(funcName) {

            for (var i = 0; i < Delicacy._CALLBACK_FUNCTIONS.length; i++) {
                if (Delicacy._CALLBACK_FUNCTIONS[i].functionName === funcName) {
                    Delicacy._CALLBACK_FUNCTIONS[i].status = 1;
                    break;
                }
            }
        },
        // 清除那些临时生成的回调函数
        removeCompletedCallbacks: function() {
            //console.log('start to clear ...');
            var normalList = new Array();
            var removeList = new Array();
            for (var i = 0; i < Delicacy._CALLBACK_FUNCTIONS.length; i++) {
                if (Delicacy._CALLBACK_FUNCTIONS[i].status === 0)
                    normalList.push(Delicacy._CALLBACK_FUNCTIONS[i]);
                else
                    removeList.push(Delicacy._CALLBACK_FUNCTIONS[i]);
            }
            Delicacy._CALLBACK_FUNCTIONS = normalList;
            for (var i = 0; i < removeList.length; i++) {
                delete window[removeList[i].functionName];
                var ele = document.getElementById(removeList[i].functionName);
                if (ele) {
                    document.head.removeChild(ele);
                }

            }
        },
        /*
         * 当使用我们自己的JSONP方法调用时需要一个定时器，定期清除那些临时生成的函数
         */
        startToRunClear: function() {

            setInterval(Delicacy.removeCompletedCallbacks, 1000 * 60);
        },
        
        /*
         * 从树形Store中获取选中的节点到一个数组中，
         * 对于树形数据源来讲，我们需要获取用户选中的节点
         * 并将结果保存到一个数组当中，下面这个函数就用来
         * 遍历树形Store,并将选中的节点放到结果数组中
         */
        getDataFromTreeRoot: function(root, resultArray, names) {
            var childNodes = root.childNodes;
            if (Delicacy.isNullOrEmpty(childNodes)) return;
            childNodes.forEach(function(cn) {
                Delicacy.getDataFromTreeNode(cn, resultArray, names);
            });
        },

        getDataFromTreeNode: function(node, resultArray, names) {
            var childNodes = node.childNodes;
            var data = node.data;
            if (data.checked) {
                if (!names)
                    resultArray.push(data);
                else
                    resultArray.push(Delicacy.getDataFromSource(data, names));
            }

            if (Delicacy.isNullOrEmpty(childNodes)) return;
            childNodes.forEach(function(cn) {
                Delicacy.getDataFromTreeNode(cn, resultArray, names);
            });
        },
        /*
         * 从后台服务返回的树是没有根节点的
         * 该函数创建一个根节点，并把从后台返回
         * 树形数据放入子节点数组
         */
        generateTreeDataFromResponse: function(resp, isChecked,hasIcon) {
            var rootNode = {
                text: '所有',
                id: '0',
                expanded: true,
                leaf: false,
                children: Delicacy.processTreeData(resp, isChecked,hasIcon)
            };
            return rootNode;
        },

        /**
         * 处理从后台返回的树结构数据，从后台生成的树形结构数据是将原生数据
         * 放在了attr对象中，该函数就将attr中的数据拷贝到treeNode中，同时将
         * attr对象删除，如果树需要每行数据前面有一个checkbox，也是在这里添加
         * checked属性
         */
        processTreeData: function(resp, isChecked,hasIcon) {
            for (var i = 0; i < resp.length; i++) {
                var node = resp[i];
                Delicacy.processTreeNode(node, isChecked,hasIcon);
            }
            return resp;
        },
        /**
         * 递归函数，用于处理每个树节点
         */
        processTreeNode: function(treeNode, isChecked,hasIcon) {
        	if(Delicacy.isNullOrEmpty(hasIcon)){
        		hasIcon = true;
        	}
            if (treeNode.attr) {
                var nodeAttr = treeNode.attr;
                if(!Delicacy.isNullOrEmpty(nodeAttr.className)){
					treeNode.iconCls = nodeAttr.className;
				}
                // 处理每个返回数据
                Delicacy.processEveryData(nodeAttr);
                Ext.apply(treeNode, nodeAttr);
                if (isChecked) {
                    if (Delicacy.isNullOrEmpty(treeNode.checked))
                        treeNode.checked = false;
                }else{
                	delete treeNode['checked'];
                }
                treeNode.expanded = true;
                delete treeNode['attr'];
            }
            if(!hasIcon){
            	delete treeNode['icon'];
            	delete treeNode['iconCls'];
            }
            if (Delicacy.isNullOrEmpty(treeNode.children)) {
                treeNode.leaf = true;
                return;
            }
            treeNode.leaf = false;
            var children = treeNode.children;
            for (var i = 0; i < children.length; i++) {
                var child = children[i];
                Delicacy.processTreeNode(child, isChecked,hasIcon);
            }
        },
        /*
         * 打印出每个函数的参数，主要用于调试程序用
         */
        printArguments: function(args) {
            var arr = Array.from(args);
            if (Delicacy.isNullOrEmpty(arr)) return;
            arr.forEach(function(e) {
                console.log(e);
            });
            console.log('-----------------------------');
        },
        /*
         * 判断某个对象是否为空/未定义/字符串或者数组为空
         */
        isNullOrEmpty: function(o) {
            if (o === null || o === undefined || o.length === 0) return true;
            else false;
        },
        /*
         * 初始化下拉数据，在应用程序初始化的时候调用
         */
        domainValueInit: function() {
        	// debugger;
            // 但凡是程序曾经使用都会把下拉数据保存在本地存储当中
            var sdata = window.localStorage.getItem(Delicacy._SYSTEM_DOMAIN_DATA);
            if (!Delicacy.isNullOrEmpty(sdata)) {
                var startTime = Date.now();
                console.log('compressed length : ' + sdata.length);
                var uncompressed = LZString.decompress(sdata);
                if(uncompressed){
					var endTime = Date.now();
					console.log('original   length : ' + uncompressed.length + ' time used : ' + (endTime - startTime) + 'ms');
					var dataArray = JSON.parse(uncompressed);
					Delicacy._KEYVALUE = dataArray;
					return;
				}
            }
            if (Delicacy._DOMAINVALUEINITED) return;
            Delicacy._DOMAINVALUEINITED = true;
            Delicacy.callOperation(Delicacy._DOMAINVALUESERVICENAME, 'find', {
                loadOnStartup: true
            }, Delicacy.domainValueInitCallback);
        },
        /*
         * 装载下拉数据服务的回调函数
         */
        domainValueInitCallback: function(data) {
        	// debugger;
            var resultSet = data.ResultSet;
            if (!resultSet) return;
            var dataArray = resultSet.Result;
            if (Delicacy.isNullOrEmpty(dataArray)) return;
            Delicacy.genaretDropdownValues(dataArray);
			Delicacy.saveKeyValueToStorage();
        },
		
		saveKeyValueToStorage: function(){
			var stringDataArray = JSON.stringify(Delicacy._KEYVALUE);
			console.log('original   length : ' + stringDataArray.length);
            var compressed = LZString.compress(stringDataArray);
            console.log('compressed length : ' + compressed.length);
            window.localStorage.setItem(Delicacy._SYSTEM_DOMAIN_DATA, compressed);
		},
		
		/*
         * 启动后台装载下拉数据，下拉数据会保存在本地存储
         * 为了保证下拉数据的最新状态，需要启动一个后台进程
         * 后台装载最新的下拉数据，这样既不影响程序的正常执行
         * 又能保证下拉数据的有效性
         */
        loadDropdownBackend: function() {
            var domainworker = new Worker('clientworker.js');
            domainworker.onmessage = function(event) {
                var data = event.data;
                for (var i in data) {
                    Delicacy._KEYVALUE[i] = data[i];
                }
				Delicacy.saveKeyValueToStorage();
            };
        },
        /*
         * 正常的通过XMLHTTPRequest对象来调用后台服务的方法
         */
        callAjax: function(operationName, subaction, params, callback, options) {
            if (Delicacy.isNullOrEmpty(subaction)) {
                subaction = 'find';
            }
            var sendData = {
                action: operationName,
                subaction: subaction
            };
            if (Delicacy.isNullOrEmpty(params)) {
                params = {};
            }
            sendData.content = encodeURIComponent(JSON.stringify(params));
            Ext.Ajax.request({
                url: Delicacy._DEFAULT_SERVER_URL,
                method: 'POST',
                params: sendData,
                success: function(response, opts) {
                    //console.log(response);
                    var responseContent = '';
                    if (!Delicacy.isNullOrEmpty(response.responseText))
                        responseContent = response.responseText;
                    else
                        responseContent = response.responseJson;
                    var json = Delicacy.extractResponseData(responseContent, options, false);
                    var jsonpp = Delicacy.processResponseData(json);
                    if (callback) callback(jsonpp, options, opts);
                },

                failure: function(response, opts) {
                    console.log('server-side failure with status code ' + response.status);
                }
            });
        },
        /*
         * 通过JSONP的方式跨域调用后台服务
         * 一般来讲用于测试开发环境后台服务调用
         */
        callJsonp: function(operationName, subaction, params, callback, options) {
            if (Delicacy.isNullOrEmpty(subaction)) {
                subaction = 'find';
            }
            var sendData = {
                action: operationName,
                subaction: subaction
            };
            if (Delicacy.isNullOrEmpty(params)) {
                params = {};
            }
            sendData.content = encodeURIComponent(JSON.stringify(params));
            if (sendData.content.length > 5000) {
                sendData.content = LZString.compressToUTF16(sendData.content);
                sendData.lzzip = 'y';
            }
            Ext.data.JsonP.request({
                url: Delicacy._DEFAULT_JSONP_URL,
                method: 'POST',
                params: sendData,
                success: function(response, opts) {
                    debugger;
                    var json = Delicacy.extractResponseData(response, options, true);
                    var jsonpp = Delicacy.processResponseData(json);
                    if (callback) callback(jsonpp, options, opts);
                },

                failure: function(response, opts) {
                    console.log('server-side failure with status code ' + response.status);
                }
            });
        },
        /*
           測試用POST請求發送
         */
        // callPostRequest: function(operationName, params, callback, options){
        //     if (Delicacy.isNullOrEmpty(params)){params = {};}
        //     var sendData = {
        //         action: operationName,
        //         subaction: 'find'
        //     };
        //     sendData.content = encodeURIComponent(JSON.stringify(params));
        //     Ext.Ajax.request({
        //         url: Delicacy._DEFAULT_JSONP_URL,
        //         method: 'POST',
        //         params: sendData,
        //         success: function(response, opts) {
        //             console.log("success");
        //         },
        //
        //         failure: function(response, opts) {
        //             console.log("failed");
        //         }
        //     })
        //
        // },
        /*
         * 我们自己写的跨域JSONP服务调用的方法，不依赖于任何第三方的库
         * 该函数会生成一个临时的回调函数
         * 该回调函数会在执行完毕后，自动清除
         */
        callJsonpOperation: function(operationName, subaction, data, callback, options) {
            var me = Delicacy.isNullOrEmpty(window) ? self : window;
            if (Delicacy.isNullOrEmpty(subaction)) {
                subaction = 'find';
            }
            var callbackName = 'delicacy' + Math.round(Math.random() * 1000000) + Date.now();
            Delicacy.addCallbackFunction(callbackName);
            me[callbackName] = function(resp) {
				// debugger;
                var jsonName;
                if (resp.indexOf("&&&") > 0) {
                    var ress = resp.split("&&&");
                    jsonName = ress[0];
                    resp = ress[1];
                }

                var jsono = Delicacy.extractResponseData(resp, options, true);
                var jsonpp = Delicacy.processResponseData(jsono);
                if (callback) callback(jsonpp, options);
                Delicacy.changeCallbackFunctionToComplete(jsonName);
            };
            if (Delicacy.isNullOrEmpty(data)) {
                data = {};
            }
            var sb = Ext.create('StringBuilder');
            sb.append(Delicacy._DEFAULT_JSONP_URL);
            sb.append('?callback=');
            sb.append(callbackName);
            sb.append('&action=');
            sb.append(operationName);
            sb.append('&fromExtjs=');
            sb.append('true');
            sb.append('&subaction=');
            sb.append(subaction);
            sb.append('&content=');
            // debugger;
            sb.append(encodeURIComponent(JSON.stringify(data)));
            var url = sb.toString();
            Delicacy.loadScript(url, callbackName);

        },

        getResponseData: function(resp) {
            var res = [];
            var rs = resp.ResultSet;
            if (!rs) return res;
            var r = rs.Result;
            if (!r) return res;
            return r;
        },

        getResponseStatus: function(resp) {
            var res = [];
            var rs = resp.ResultSet;
            if (!rs) return res;
            var r = rs.status;
            if (!r) return res;
            return r;
        },

        getResponseErrorMsg: function(resp) {
            var res = [];
            var rs = resp.ResultSet;
            if (!rs) return res;
            var r = rs.errors;
            if (!r) return res;
            return r;
        },

        /*
         * 装载javascript脚本，如果在网页环境下，是在header下面增加脚本
         * 如果是后台进程，则通过importScripts函数完成
         */
        loadScript: function(url, callbackName) {
            if (!Delicacy.isNullOrUndefined(window)) {
                var script = document.createElement('script');
                script.id = callbackName;
                script.type = 'text/javascript';
                script.src = url;
                document.head.appendChild(script);
            } else {
                importScripts(url);
            }
        },
        /*
         * 生成右键菜单
         */
        generateContextMenu: function(grid, record, source, menuItemEdit, menuItemDelete, menuItemView, rowIdx) {
            var menu = Ext.create('Ext.menu.Menu', {
                width: 100,
                margin: '0 0 10 0',
                floating: true,
                source: grid,
                selectedData: record,
                sourceControl: source,
                rowIndex: rowIdx,
                items: [{
                    text: '编辑',
                    iconCls: 'x-fa fa-edit green',
                    handler: menuItemEdit
                }, {
                    text: '删除',
                    iconCls: 'x-fa fa-remove red',
                    handler: menuItemDelete
                }, {
                    text: '属性',
                    iconCls: 'x-fa fa-eye yellow',
                    handler: menuItemView
                }]
            });
            return menu;
        },

        generateContextAddMenu: function(grid, record, source, menuItemNew, rowIdx, title) {
            var menu = Ext.create('Ext.menu.Menu', {
                width: 100,
                margin: '0 0 10 0',
                floating: true,
                source: grid,
                selectedData: record,
                sourceControl: source,
                rowIndex: rowIdx,
                items: [{
                    text: title ? title : '新建',
                    iconCls: 'x-fa fa-plus-circle green',
                    handler: menuItemNew
                }]
            });
            return menu;
        },

        callOperation: function(operationName, subaction, params, callback, options) {
            // debugger;
            if (Delicacy._ENV_DEVELOPMENT)
                return Delicacy.callFetch(operationName, subaction, params, callback, options);
            else
                return Delicacy.callAjax(operationName, subaction, params, callback, options);
        },

        callFetch: function(operationName, subaction, params, callback, options) {
            // debugger;
            if (Delicacy.isNullOrEmpty(subaction)) {
                subaction = 'find';
            }
            var sb = new StringBuilder();
            sb.append('action=');
            sb.append(operationName);
            sb.append('&subaction=');
            sb.append(subaction);

            if (Delicacy.isNullOrEmpty(params)) {
                params = {};
            }

            sb.append('&content=');
            sb.append(encodeURIComponent(JSON.stringify(params)));

            fetch(Delicacy._DEFAULT_FETCH_URL, {
                method: 'POST',
                mode: 'cors', // no-cors, *cors, same-origin
                cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
                credentials: 'same-origin', // include, *same-origin, omit
                headers: {
                    'Content-Type': 'text/plain; charset=UTF-8'
                },
                redirect: 'follow', // manual, *follow, error
                referrer: 'no-referrer', // no-referrer, *client
                body: sb.toString()
            }).then(function(response) {
                // debugger;
                return response.json();
            }).then(function(jsonData) {
                // debugger;
                const json = Delicacy.extractResponseData(jsonData, options, false);
                const jsonpp = Delicacy.processResponseData(json);
                if (callback) callback(jsonpp, options);
            }).catch(error => console.error('Error:', error));
        },

        getProxy: function(options) {
            return Delicacy._ENV_DEVELOPMENT ? Ext.create('proxy.DelicacyJsonp', options) :
                Ext.create('proxy.DelicacyAjax', options);
        },

        generateDropdownStore: function(queryName, params) {
            if (Delicacy.isNullOrEmpty(params)) params = {};
            return new Ext.data.Store({

                proxy: Delicacy.getProxy({
                    extraParams: {
                        action: queryName,
                        subaction: 'find',
                        content: encodeURIComponent(JSON.stringify(params))
                    }
                })
            });
        },

        processResponseData: function(data) {
            var res = data['ResultSet'];
            if (!res) return data;
            var da = res['Result'];
            if (da) {
                for (var i = 0; i < da.length; i++) {
                    Delicacy.processEveryData(da[i]);
                }
            }
            return data;
        },
        /*
         * 处理每个数据，主要是针对日期型的数据进行转换
         */
        processEveryData: function(record) {
            for (var prop in record) {
                var val = record[prop];
                if (!(typeof(val) === 'string')) continue;
                if (val.length < 18) continue;
                if (val.substr(0, 8) !== '__DATE__') continue;
                var s = val.substring(8);
                var d = new Date();
                d.setTime(Number(s));
                d.setTime(d.getTime() - d.getTimezoneOffset() * 60000);
                record[prop] = d;
            }
            return record;
        },

        /*
         * 解析从后台返回的数据，主要是针对日期型的数据进行处理
         */
        parseValueFromService: function(val) {
            if (!(typeof(val) === 'string'))
                return val;
            if (val.length >= 18 && val.substr(0, 8) === '__DATE__') {
                var s = val.substring(8);
                var d = new Date();
                d.setTime(Number(s));
                d.setTime(d.getTime() - d.getTimezoneOffset() * 60000);
                return d.toISOString();
            } else
                return val;
        },

        /**
         * 处理从后台返回的数据
         *
         */
        extractResponseData: function(data, options, uridecode) {
            if (typeof(data) === 'string') {
                var res = data;
                if (uridecode === undefined || (!Delicacy.isNullOrUndefined(uridecode) && uridecode))
                    res = decodeURIComponent(data);
                var s = new StringBuilder();
                for (var i = 0; i < res.length; i++) {
                    if (res[i] === '\n' || res[i] === '\\' || res[i] === '\r' || res[i] === '+')
                        continue;
                    s.append(res[i]);
                }
                var json = JSON.parse(s.toString());
                if (json.ResultSet && json.ResultSet.totalResultsAvailable !== 0) {
                    return json;
                }
                if (json.ResultSet && options && options.totalCount && json.ResultSet.totalResultsAvailable === 0) {
                    json.ResultSet.totalResultsAvailable = options.totalCount;
                }
                return json;
            } else {
                return data;
            }
        },
        /*
         * 判断一个值是否为空或者未定义
         */
        isNullOrUndefined: function(val) {
            if (val === undefined || val === null) return true;
            return false;
        },

        generateStringFromModels: function(ma, fn) {
            var sb = new StringBuilder();
            var count = 0;
            for (; count < ma.length; count++) {
                if (count > 0) sb.append(',');
                sb.append(ma[count].getData()[fn]);
            }
            return sb.toString();
        },

        findTopLevelPanel: function(cmp) {
            var parentCmp = cmp.ownerCt;
            while (parentCmp && !parentCmp.isTopLevel) {
                parentCmp = parentCmp.ownerCt;
            }
            return parentCmp;
        },



        /*
         * 查找指定的组件
         */
        lookupDockedReference: function(view, ref) {
            if (Delicacy.isNullOrEmpty(view)) return null;
            var dockedItems = view.getDockedItems();
            if (Delicacy.isNullOrEmpty(dockedItems)) return null;
            var res = null;
            for (var i = 0; i < dockedItems.length; i++) {
                var item = Delicacy.lookupReference(dockedItems[i], ref);
                if (!Delicacy.isNullOrEmpty(item)) {
                    res = item;
                    break;
                }
            }
            return res;
        },
        /*
         * 递归地查找该面板的某一个组件
         */
        lookupReference: function(view, ref) {
            if (Delicacy.isNullOrEmpty(view)) return null;
            if (view.reference == ref) return view;
            var items = view.items;
            if (Delicacy.isNullOrEmpty(items)) return null;
            if (items instanceof Array) {
                for (var i = 0; i < items.length; i++) {
                    var res = Delicacy.lookupReference(items[i], ref);
                    if (!Delicacy.isNullOrEmpty(res)) return res;
                }
            } else {
                var res = Delicacy.lookupReference(items, ref);
                if (!Delicacy.isNullOrEmpty(res)) return res;
            }
            return null;
        },
        /*
         * 从src拷贝数据到dest
         */
        apply: function(dest, src, emptyValue) {
            for (var i in src) {
                var val = src[i];
                if (!emptyValue && Delicacy.isNullOrEmpty(val)) continue;
                dest[i] = val;
            }
        },

        getDataFromSource: function(src, names) {
            var dest = {};
            for (var i = 0; i < names.length; i++) {
                var val = src[names[i]];
                if (Delicacy.isNullOrEmpty(val)) continue;
                dest[names[i]] = val;
            }
            return dest;
        },

        /**
         * 打印
         */
        print: function(html) {
            var printFrame = document.getElementById('__printFrame');
            if (Delicacy.isNullOrEmpty(printFrame)) {
                printFrame = document.createElement('iframe');
                printFrame.id = '__printFrame';
                printFrame.style = 'width: 0px; height: 0px; border-style: none;';
                document.body.appendChild(printFrame);
            }
            var w = printFrame.contentWindow;
            var b = w.document.body;
            b.innerHTML = html;
            printFrame.focus();
            w.print();
        },

        getTreeStore: function(callOperation,isChecked) {
            if (Delicacy.isNullOrEmpty(callOperation)) {
                return null;
            };
            if(Delicacy.isNullOrEmpty(isChecked)){
            	isChecked = false;
            }
            store = Ext.create('Ext.data.TreeStore', {
                fields: ['id', 'text'],
                root: {
                    text: '所有',
                    expanded: true
                },
                load: function() {
                    var me = this,
                        options = {
                            source: this
                        };
                    var params = {};
                    Delicacy.callOperation(callOperation, 'find', params, me.callbackProcess, options);
                },

                callbackProcess: function(resp, options) {
                    var rootNode = Delicacy.generateTreeDataFromResponse(resp, isChecked,false);
                    options.source.setRoot(rootNode);
                }
            })
            return store;
        },

        //根据gird传递的records返回数组
        getDataFromGridRecords: function(records, names) {
            if (Delicacy.isNullOrEmpty(records)) {
                return null;
            }
            var resultArray = new Array();
            records.forEach(function(record) {
                var data = record.data;
                if (!Delicacy.isNullOrEmpty(data)) {
                    if (!names)
                        resultArray.push(data);
                    else
                        resultArray.push(Delicacy.getDataFromSource(data, names));
                }
            });
            return resultArray;
        },

        //获取组织机构代码
        getOrganizationId: function() {
            var organizationId = 1;
            return organizationId;
        },
        
        //从本地存储获取拥有的功能权限
        getPrivilegeString: function(){
        	var privilege = window.localStorage.getItem(Delicacy.PRIVILEGE_COOKIE);
        	return privilege == null ? "" : privilege;
        },
        
        //检索员工是否拥有该权限
        checkNoHavePermission: function(funcionCode){
        	//目前统一都是false
        	var noHavePermission = false;
        	debugger;
    		var privilege = this.getPrivilegeString();
    		if (!this.isNullOrEmpty(privilege)) {
    			var privilegeArr = privilege.split(",");
    			Ext.each(privilegeArr,function(code){
    				if(funcionCode === code){
    					noHavePermission = false;
    					return noHavePermission;
    				}
    			});
    		}
    		return noHavePermission;
        },
        
        //获取登录用户的基础信息
        getUserInfo: function(){
        	var userInfo = {
    			employeeNo:'JA884003',
    			employeeName:'罗小飞',
    			departmentId:5
        	}
        	return userInfo;
        },

        systemDataInit: function() {
            Delicacy.callOperation(Delicacy._SYSTEMDATAINIT, 'find', {
                optType: 'onSystemInit'
            }, Delicacy.systemDataInitCallback);
        },

        systemDataInitCallback: function(resp) {
            var status = Delicacy.getResponseStatus(resp);
            if(status >= 0){
                var data = Delicacy.getResponseData(resp);
                if(!Delicacy.isNullOrEmpty(data)){
                    Ext.forEach(data,function(record){
                        var key = record.key;
                        var value = record.value;
                        if(!Delicacy.isNullOrEmpty(key) && key === 'processId'){
                            window.localStorage.setItem(Delicacy._PROCESS_IDS, value);
                        }
                    });
                }
            }
        },
    }
});