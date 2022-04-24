<%--
  Created by IntelliJ IDEA.
  User: 飛
  Date: 2022/4/23
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<h1>品牌信息</h1>
<form action="addBrand" method="post">
    品牌名称：<input type="text" name="brandName"><br>
    企业名称：<input type="text" name="companyName"><br>
    排列顺序：<input type="text" name="ordered"><br>
    描述信息：<textarea rows="5" cols="20" name="description"></textarea><br>
    状态：<input type="radio" name="status" value="1">启用
    <input type="radio" name="status" value="0">禁用<br>
    <input type="submit" value="提交">
</form>
</body>
</html>
