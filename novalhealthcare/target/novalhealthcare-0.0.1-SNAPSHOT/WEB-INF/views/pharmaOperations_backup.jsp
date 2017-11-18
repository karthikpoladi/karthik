<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <form action="${pageContext.request.contextPath}/search/searchpatient?searchValue">
<input type="text" name="searchValue"></input><span id="sid"></span><input type="submit" value="search"/>
</form>
 --%>
 <table border="2">
 <tr>
 <td>
 <jsp:include page="menu.jsp">
<jsp:param value="This page having menu" name="DesCription"/>
</jsp:include>
 
 </td>
<td>
 <table border="2">
<tr>
<th style="color: blue">Pharma_Id</th>
<th style="color: blue">Pharma_Name</th>
<th style="color: blue">Email</th>
<th style="color: blue">Mobileno</th>
<th style="color: blue">Action</th>
</tr >


<core:choose>
<core:when test="${not empty PharmaList}">
<core:forEach items="${PharmaList}" var="pharmaBean">
<tr>
<td>${pharmaBean.getPharmaId()}</td>
<td>${pharmaBean.getPharmaName()}</td>
<td>${pharmaBean.getEmail()}</td>
<td>${pharmaBean.getMobileno()}</td>
<td>
<a href="${pageContext.request.contextPath}/getAllPharmasById?pharmaId=${pharmaBean.getPharmaId()}">edit/</a>
<a href="deletePharmaById?pharmaId=${pharmaBean.getPharmaId()}">delete</a>
</td>
</tr>
</core:forEach>
</core:when>
</core:choose> 
 </table>
<a href="addPharma">addPharma</a>
<form action="${pageContext.request.contextPath}/searchPharma?searchValue">
<input type="text" name="searchValue"></input><span id="sid"></span><input type="submit" value="search"/>
</form>
</td>
</tr>
</table>
</body>
</html>