<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>品牌列表</title>
</head>
<body>
<input type="button" value="增加" id="add"><br>
<hr>
<table border="1" cellspacing="0" width="800" style="text-align: center">
    <tr>
        <th>品牌ID</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌描述</th>
        <th>状态</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${brands}" var="brand">
        <tr>
            <td>${brand.id}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test="${brand.status == 1}">
                <td>启用</td>
            </c:if>
            <c:if test="${brand.status != 1}">
                <td>禁用</td>
            </c:if>
            <td>
                <a href="selectById?id=${brand.id}">修改</a>
                <a href="deleteBrand?id=${brand.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<script>
    document.getElementById("add").onclick = function () {
        location.href = "addBrand.jsp";
    }
</script>
</body>
</html>
