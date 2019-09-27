# 快速开始

目标是让未接触过 Delicacy 开发工具的人迅速启动项目，开发功能。

## 环境配置

### 项目启动需要

* [Sencha Cmd](https://www.sencha.com/products/extjs/cmd-download/)；
* [Apache Ant](https://ant.apache.org/)；
* [Tomcat](http://tomcat.apache.org/)；
* 本基础项目包。

### 代码生成需要曹总的代码生成器

## 项目包解释

### DelicacyCommonLib

存放依赖的文件夹，其中的关键是 Delicacy.jar，为框架的基础工具类。

### exterp

前端项目，使用 ExtJS 框架。

### ProjectDB

后台代码，存放对单表操作的代码，原则上不允许手写，全部由代码生成器的 Table DAO 功能生成。

### ProjectService

存放其余后台代码。

### build.xml

ant 项目文件，按各自需求自行修改。

### war

在项目包目录调用 ```ant javac``` 命令编译生成的后台项目包，编辑 ```$CATALINA_BASE/conf/server.xml``` 以启动该项目包。见如下示意：

```xml
<Host name="localhost" appBase="webapps" unpackWARs="true" autoDeploy="true">
    <Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs" prefix="localhost_access_log" suffix=".txt" pattern="%h %l %u %t &quot;%r&quot; %s %b" />
    <Context path="" docBase="C:\projects\baseproject-master\baseproject-master\war\" />
</Host>
```

### baseDB-init-mysql.sql

包含三个启动该项目需要的表格和数据，用来管理项目的实际功能、下拉框数据渲染目录，这里不多解释。

### sampleData.sql

生成用例数据。

### 项目启动

1. 在 ```ProjectService/src/connection.properties``` 中配置数据库；
2. 在 ```$CATALINA_HOME``` 或 ```$CATALINA_BASE``` 的 ```/conf/server.xml``` 中编辑 war 文件夹目录；
3. ```ant javac``` 编译文件到 /war 文件夹；
4. ```startup``` 启动后台文件；
5. ```cd exterp; sencha app watch``` 启动前端项目；
6. 默认到 localhost:1841 访问项目；

### 代码生成用例

sampleData.sql 包含当前内容所需数据，例子为一个订单管理系统。包含 products、orders、order_products、system_users 几个表。

#### 订单管理

需求如下：

1. 列表查看，字段除了 orders 还要包涵 order_status_detailed 订单详细状态，该字段根据一个订单内的产品服务状态动态生成；
2. 

