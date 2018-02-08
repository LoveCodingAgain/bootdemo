<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FreeMarker</title>
</head>
<body>
    <div align="center">
    <h4>使用include导入公共页面</h4>
    <#include "/header.ftl" />
    <h4>您好,现在是:${mydate}！</h4>
     <span style="color:lightseagreen">我的好友信息:</span><br/>
     <#list friends as item>
        姓名:${item.name}.年龄:${item.age}
     </#list>
     <#include "/footer.ftl" />
    </div>
</body>
</html>