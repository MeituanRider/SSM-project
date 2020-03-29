#新手SSM练习项目-人力资源管理平台

1 项目所需技术
* 开发工具 IDEA/Eclipse等使用
* 框架基础 SSM框架
* 前端了解 Bootstrap，jquery，jsp的技术
* 项目管理 MAVEN
* 基本的 JAVA基础 JavaWeb基础

个人觉得这个项目很适合小白练习与训练

2 数据库表格需求
tbl_emp表，tbl_dept表
表格已打包至项目db中

3 SSM项目搭建与启动
(1)打开pom.xml查看需要导入的包(ps:
强烈建议导入<resources>
      <resource>
        <directory>src/main/java</directory>
        <includes>
          <include>**/*.xml</include>
        </includes>
      </resource>
    </resources>，以防止mapper扫描问题出错，我个人就在这儿出错很久)
	
(2)配置 Spring SpringMVC mybatis-config.xml容器:
详情请见resources/applicationContex.xml springmvc-config.xml mybatis-config.xml
(3)配置 web.xml文件
详情请见WEB-INF/web.xml
(4)写好上述配置文件后，可以在controller目录下新建TestController.java文件和WEB-INF/jsp/test.jsp，启动容器测试是否成功。

4 实体类构建
由于本项目只涉及两个表，且字段不多
个人建议不要使用代码生成器 生成dao mapper文件，且该项目
存在联表查询，若使用逆向工程代码生成器，将要重写mapper文件
这会阻碍同学们的学习兴趣(不了解逆向工程代码生成器的也不需要了解
个人觉得在实际开发项目中用处不大)

5 Mapper(Dao)层的构建
(1) 由于本项目工作量较少
项目的增删改查我同时使用了注解以及mapper.xml的方式来
构建，若同学有兴趣可以完全使用注解或完全使用mapper的方式
对本项目进行重构
(2) 测试注解与mapper的增删改查
详情请见test/EmployeeMapperTest DepartmentMapperTest

6 server层的构建
本项目工作量较少 server就没重写接口，而是将接口与实现类
一同完成，同学们可以将server与serverImpl分开来写，亲自感受分层后
代码的优雅

7 controller层的构建
controller层与前端jsp界面直接对应
所以个人建议更具前端jsp需求来重写controller

8 webapp前端jsp页面个人是仿写静态文件中html，这里大家不需要
前后端分离，等将该项目吃透后，建议学习并上手SpringBoot+Vue
SpringBoot是其他框架的进一步优化，有了SSM基础，可以傻瓜式上手
各大公司可能在以后，更多的会使用 SpringBoot或者自己内部的而框架
但是SSM就目前位置依旧是个不错的学习上手框架

##最后
最后，将本次项目的代码上传到我的github当中，
如果觉得对你有帮助别忘了在我的github上随手点个star，THX！
2020.3.29

