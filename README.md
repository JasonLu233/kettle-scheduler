# kettle-scheduler

forked from -> https://github.com/zhaxiaodong9860/kettle-scheduler

项目介绍
Kettle调度监控平台（以下简称KS）是一个自主开发的javaweb程序，专门用来调度和监控由kettle客户端创建的job和transformation。KS整体的框架是由spring+sprin gmvc +beetlsql整合而成，通过调用kettle的API来执行转换和作业，并且使用quartz框架完成调度工作。

此版本基于kettle-8.3.0.0-371版本的API开发的，目前可以基本可以支持所有的组件，包括大数据组件（hbase、hive、hdfs等）。



部署
基础环境
操作系统：linux
预装软件：jdk1.8、mysql、tomcat、kettle8.3
将源码中kettle-scheduler.sql导入mysql数据库。

