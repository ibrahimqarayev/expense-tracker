<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div align="center">

    <h1 align="center" style="color:darkcyan">Expense Tracker</h1>
    <a href="${contextRoot}/expense" style="color:red">Add Expense</a>


    <h1> ---------------- </h1>

    <c:forEach var="expense" items="${expenses}">

        <div>
            <h3>${expense.expenseName}</h3>
            <p>&#36;${expense.amount}</p>
            <a href="${contextRoot}/expense/${expense.id}">Edit</a>
            <a href="${contextRoot}/expense/${expense.id}/">Delete</a>
            <h1> ---------------- </h1>
        </div>

    </c:forEach>

</div>

</body>
</html>