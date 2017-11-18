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
<th style="color: blue">Staff_Id</th>
<th style="color: blue">Staff_Name</th>
<th style="color: blue">Email</th>
<th style="color: blue">GENDER</th>
<th style="color: blue">Mobileno</th>
<th style="color: blue">Action</th>
</tr>

<core:set value="${staffBean}" var="staffBean"></core:set>
<tr>
<td>${staffBean.getStaffId()}</td>
<td>${staffBean.getName()}</td>
<td>${staffBean.getEmail()}</td>
<td>${staffBean.getGender()}</td>
<td>${staffBean.getMobileno()}</td>
<td>
<a href="${pageContext.request.contextPath}/getAllStaffsById?staffId=${staffBean.getStaffId()}">edit/</a>
<a href="deleteStaffById?staffId=${staffBean.getStaffId()}">delete</a>
</td>
</tr>
</table>
<a href="addDoctor">addDoctor</a>
<form action="${pageContext.request.contextPath}/searchDoctor?searchValue">
<input type="text" name="searchValue"></input><span id="sid"></span><input type="submit" value="search"/>
</form>
</td>
</tr>
</table>
</body>
</html>