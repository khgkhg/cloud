# cloud
it about springboot project 
该项目是最近工作需要搭建的一个springboot项目:
a.springboot2+mybatis+mysql+maven
b.数据库连接使用druid连接池
c.支持跨域，用于前后分离
d.springboot多环境配置，devtools热部署方式
e.默认logback日志管理，日志按等级，按天,按大小进行切割
f.集成mybatis-generator插件代码自动生成
g.集成pagehelper分页插件
h.集成assembly自动化打包插件,分离配置文件，lib包依赖,jar文件和生成zip压缩文件
i.springboot默认配置好事务和aop
项目demo包里有现成代码例子，跑起来需要mysql数据库支持
1、数据库sid:test
2、表usertemp
CREATE TABLE `usertemp` (
  `id` varchar(24) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 
即可。
刚接触springboot,接触不深，希望互相交流，相互学习
