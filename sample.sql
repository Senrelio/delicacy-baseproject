# 示范功能用的数据

CREATE TABLE system_users
(
    user_id     int AUTO_INCREMENT COMMENT '用户ID' PRIMARY KEY,
    username    varchar(25)              NOT NULL COMMENT '用户名',
    password    varchar(25)              NOT NULL COMMENT '密码',
    department  varchar(25) DEFAULT NULL NULL COMMENT '部门',
    flag_active tinyint(1)  DEFAULT 1    NOT NULL COMMENT '是否为活跃用户'
)
    COMMENT '系统用户表';

CREATE UNIQUE INDEX system_users_user_id_uindex
    ON system_users (user_id);
CREATE UNIQUE INDEX system_users_username_uindex
    ON system_users (username);


INSERT INTO system_users (user_id, username, password, department, flag_active)
VALUES (NULL, 'root', 'root', NULL, 1),
       (NULL, 'song', 'song', 'IT', 1),
       (NULL, 'wang', 'wang', 'Finance', 1);


CREATE TABLE products
(
    product_id   int AUTO_INCREMENT COMMENT '产品ID' PRIMARY KEY,
    product_code varchar(25) NOT NULL COMMENT '产品代码',
    name         varchar(50) NOT NULL COMMENT '产品名',
    type         int         NULL COMMENT '品类 1.空调 2.冰箱 3.烤箱'
)
    COMMENT '产品表';

CREATE UNIQUE INDEX products_product_code_uindex
    ON products (product_code);

CREATE UNIQUE INDEX products_product_id_uindex
    ON products (product_id);

INSERT INTO products (product_id, product_code, name, type)
VALUES (NULL, 'AUX001', '001型空调', 1),
       (NULL, 'Midea001', '001型冰箱', 2),
       (NULL, 'Panasonic001', '001型蒸烤箱', 3);


CREATE TABLE orders
(
    order_id         int AUTO_INCREMENT COMMENT '订单数据库ID' PRIMARY KEY,
    order_code       varchar(25)   NOT NULL COMMENT '订单号',
    customer_mobile  varchar(16)   NOT NULL COMMENT '客户手机号',
    customer_name    varchar(16)   NOT NULL COMMENT '客户姓名',
    customer_address varchar(50)   NULL COMMENT '客户地址',
    date_created     datetime      NULL COMMENT '创建时间',
    order_status     int DEFAULT 0 NOT NULL COMMENT '订单状态 0.待接单 1.待派单 2.进行中 3.搁置 4.取消 5.完成'
)
    COMMENT '订单表';

CREATE UNIQUE INDEX orders_order_code_uindex
    ON orders (order_code);

CREATE UNIQUE INDEX orders_order_id_uindex
    ON orders (order_id);

INSERT INTO orders (order_code, customer_mobile, customer_name, customer_address, date_created)
VALUES ('SZ20190808180216', '13962339722', '宋凡臻', NULL, current_timestamp),
       ('SZ20190808180243', '17462332342', '老王', NULL, current_timestamp),
       ('SZ20190808180278', '1192329722', '张大锤', NULL, current_timestamp),
       ('SZ20190808180292', '13392382742', '李建国', NULL, current_timestamp);

CREATE TABLE order_products
(
    order_products_id int AUTO_INCREMENT COMMENT '订单-<产品表ID' PRIMARY KEY,
    order_id          int     NOT NULL COMMENT '订单ID',
    product_id        int     NOT NULL COMMENT '产品ID',
    service_status    TINYINT NOT NULL COMMENT '订单产品服务状态 0.待派单 1.服务中 2.悬挂待处理 3.完成 4.取消'
)
    COMMENT '订单-<产品 表';

CREATE UNIQUE INDEX order_products_order_products_id_uindex
    ON order_products (order_products_id);

INSERT INTO order_products (order_id, product_id, service_status)
VALUES (1, 1, 1),
       (1, 2, 3),
       (1, 3, 3),
       (2, 1, 0),
       (2, 2, 0),
       (3, 3, 0),
       (3, 2, 1),
       (4, 2, 1),
       (4, 1, 1);

alter table order_products
    add constraint order_products___orderfk
        foreign key (order_id) references orders (order_id);

alter table order_products
    add constraint order_products___productfk
        foreign key (product_id) references products (product_id);