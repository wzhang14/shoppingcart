<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Customer Information</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">

</head>
<body>

<jsp:include page="_header.jsp"/>
<jsp:include page="_menu.jsp"/>

<div class="page-title">Enter Customer Information</div>

    <form:form method="POST" modelAttribute="customerForm"
        action="${pageContext.request.contextPath}/shoppingCartCustomer">
        
        <table>
            <tr>
                <td>Name*</td>
                <td><form:input path="name"/></td>
                <td><form:errors path="name"
        </table>

</body>
</html>