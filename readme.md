   ###SpringBoot的项目实战学习笔记
   #####SpringBoot的版本是1.5.10.RELEASE,全部基于Spring4.X的java配置.java版本是1.8,Maven的版本是3.3.9
 <br/>
<h6>第一章基本使用篇</h6>
 1. 热部署的配置使用和原理的了解.devtools
 2. Markdown的语法和基本使用,以及编写接口文档.引用的使用.粗体和斜体的使用.**,可以嵌入Html标签.
    <http://www.lixingblog.com>
 3. 采用Tomcat的独立部署和FastJson来解析Json数据,打包的方式为war包,部署项目到Linux平台.
 4. SpringBoot启动类的分析.查看源代码,和日志分析.
    <br/>
    4.1 使用的是AnnotationConfigApplicationContext实例化Spring容器
    <br/>
 5. 异常处理.404,500,401.对应的页面放在static的目录下才可以的.
   <br/>添加链接的方式.
 6. 添加Listener,Filter,来监听Web项目启动和请求.
 7. IDEA的GsonFormat的插件使用.自动生成对应的JavaBean对象,注意FastJson的中文乱码问题.
 8. 使用Thymeleaf来作为视图层.3.0的版本,标签可以不同闭合的.
 9. 使用JDBC来实现用户登录.导入mysql的包,starter-jdbc.
 10. 静态资源统一存放在static的目录下.可以直接访问.日志框架采用默认的是logback.设置日志级别为DEBUG,开发设置.添加监控站点是记得配置敏感信息不展示endpoints.beans.sensitive=false.就可以解决401的异常.
 11. MyBatis(注解版和配置文件版),以及JPA(CRUD的接口编写测试),Redis单机版的整合使用.
 12. 集成FreeMarker模板引擎做视图层,是Java的一个库,经过测试FreeMarker和Thymeleaf是可以并存使用的.FreeMarker的include的使用.
 <#include />,<#list firends as item></#list>,<#if><#else>
 <h6>第二章项目实战篇</h6>
     SpringBoot开发博客系统.权限管理系统.
     
 
 
  