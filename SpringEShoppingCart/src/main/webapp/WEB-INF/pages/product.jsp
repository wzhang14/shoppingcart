<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">

</head>
<body>

    <jsp:include page="_header.jsp"/>
    <jsp:include page="_menu.jsp"/>
    
    <div class="page-title">Product</div>
    
    <c:if test="${not empty errorMessage}">
        <div class="error-message">
            ${errorMessage}
        </div>
    </c:if>
    
    <form:form modelAttribute="productForm" method="POST" enctype="multipart/form-data">
        <table style="text-align:left;">
            <tr>
                <td>Code*</td>
                <td style="color:red;">
                    <c:if test="${not empty productFrom.code}"}
                        <form:hidden path="code"/>
                        ${productForm.code}
                    </c:if>
                    <c:if test="${empty productForm.code}">
                        <form:input path="code"/>
                        <form:hidden path="newProduct"/>
                    </c:if>
                </td>
                <td><form:errors ></form:errors>)

</body>
</html>