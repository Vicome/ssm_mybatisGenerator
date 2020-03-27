<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vic
  Date: 2020/3/14
  Time: 20:29
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<table border="1">
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>爱好</td>
    </tr>
    <c:choose>
        <c:when test="${not empty userList}">
            <c:forEach items="${userList}" var="user" varStatus="vs">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.sex}</td>
                    <td>${user.hobby}</td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="4">无数据!</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>
</body>
</html>
