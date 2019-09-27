# 功能管理、下拉选项、数据映射

CREATE TABLE main_functions
(
    function_id       int AUTO_INCREMENT COMMENT '功能ID',
    function_name     varchar(765)                 NULL COMMENT '功能名称',
    parent_id         int                          NULL COMMENT '父级功能ID',
    function_code     varchar(765)                 NULL COMMENT '功能代码',
    applied_system_id int                          NULL COMMENT '被引用系统ID',
    function_type     int                          NULL COMMENT '功能类型 1.菜单 2.按钮 3.数据',
    privilege_type    int                          NULL COMMENT '数据权限类型',
    flag_enabled      tinyint(1) DEFAULT 1         NULL COMMENT '是否可用',
    leaf              tinyint                      NULL COMMENT '叶片节点',
    flag_mobile       tinyint(1) DEFAULT 0         NULL COMMENT '是否移动端功能',
    icon              varchar(765)                 NULL COMMENT '图标',
    style_name        varchar(765)                 NULL COMMENT '样式',
    class_name        varchar(765)                 NULL COMMENT '类名称',
    icon_color        varchar(765)                 NULL COMMENT '图标颜色',
    margin_top        decimal(18, 2)               NULL COMMENT 'margin_top',
    margin_bottom     decimal(18, 2)               NULL COMMENT 'margin_bottom',
    execute_name      varchar(765)                 NULL COMMENT '执行程序名称',
    memo              varchar(765)                 NULL COMMENT '备忘',
    seq_no            int                          NULL COMMENT '序号',
    organization_id   int                          NULL COMMENT '所属组织代码',
    application_id    int(11) UNSIGNED ZEROFILL    NULL,
    enabled           tinyint(1) UNSIGNED ZEROFILL NULL,
    is_mobile         tinyint(1) UNSIGNED ZEROFILL NULL,
    remark            varchar(50)                  NULL,
    CONSTRAINT main_functions_function_id_uindex
        UNIQUE (function_id)
)
    COMMENT '功能表';

ALTER TABLE main_functions
    ADD PRIMARY KEY (function_id);


INSERT INTO main_functions (function_id, function_name, parent_id, function_code, applied_system_id, function_type, privilege_type, flag_enabled, leaf, flag_mobile, icon, style_name, class_name, icon_color, margin_top, margin_bottom, execute_name, memo, seq_no, organization_id, application_id, enabled, is_mobile, remark) VALUES (null, '系统管理', 0, 'SM-10000-000', 1, 1, null, 1, 0, null, 'system_management.png', null, 'my-icon-class', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO main_functions (function_id, function_name, parent_id, function_code, applied_system_id, function_type, privilege_type, flag_enabled, leaf, flag_mobile, icon, style_name, class_name, icon_color, margin_top, margin_bottom, execute_name, memo, seq_no, organization_id, application_id, enabled, is_mobile, remark) VALUES (null, '功能管理', 1, 'SM-11000-000', 1, 1, null, 1, 1, null, 'sm_function_management.png', null, 'my-icon-class', null, null, null, 'erp.sysmanage.mainfunction.view.MainFunctionPanel', null, null, null, null, null, null, null);


CREATE TABLE column_domains
(
    select_id            varchar(765)                 NULL,
    table_name           varchar(765)                 NULL,
    key_column           varchar(765)                 NULL,
    value_column         varchar(765)                 NULL,
    condition_column     varchar(765)                 NULL,
    additional_condition varchar(2295)                NULL,
    load_on_startup      tinyint(1)                   NULL,
    is_basic_data        tinyint(1) UNSIGNED ZEROFILL NULL,
    application_id       int UNSIGNED ZEROFILL        NULL,
    organization_id      int                          NULL
)
    COMMENT '下拉配置表';

INSERT INTO column_domains (select_id, table_name, key_column, value_column, condition_column, additional_condition, load_on_startup, is_basic_data, application_id, organization_id) VALUES ('functionTypes', 'system_dictionary', 'dic_type_value_id', 'dic_type_value', null, 'dic_type_id = 44', 1, 1, 1, null);
INSERT INTO column_domains (select_id, table_name, key_column, value_column, condition_column, additional_condition, load_on_startup, is_basic_data, application_id, organization_id) VALUES ('main_functions', 'main_functions', 'function_id', 'function_name', null, null, 1, 1, 1, null);


CREATE TABLE system_dictionary
(
    dictionary_id     int          NULL,
    dic_type_id       int          NULL,
    dic_type_name     varchar(765) NULL,
    dic_type_value_id int          NULL,
    dic_type_value    varchar(765) NULL,
    dic_is_enable     tinyint      NULL,
    parent_id         int          NULL,
    management_type   int          NULL,
    organization_id   int          NULL,
    CONSTRAINT system_dictionary_dictionary_id_uindex
        UNIQUE (dictionary_id)
);

INSERT INTO system_dictionary (dictionary_id, dic_type_id, dic_type_name, dic_type_value_id, dic_type_value, dic_is_enable, parent_id, management_type, organization_id) VALUES (177, 44, '功能类型', 1, '菜单', null, 0, 2, null);
INSERT INTO system_dictionary (dictionary_id, dic_type_id, dic_type_name, dic_type_value_id, dic_type_value, dic_is_enable, parent_id, management_type, organization_id) VALUES (178, 44, '功能类型', 2, '按钮', null, 0, 2, null);
INSERT INTO system_dictionary (dictionary_id, dic_type_id, dic_type_name, dic_type_value_id, dic_type_value, dic_is_enable, parent_id, management_type, organization_id) VALUES (179, 44, '功能类型', 3, '数据', null, 0, 2, null);
