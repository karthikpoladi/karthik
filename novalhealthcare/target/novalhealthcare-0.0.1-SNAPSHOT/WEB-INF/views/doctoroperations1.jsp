<%@page import="java.text.Format"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.siri.esmartHealthCare.beans.PatientBean" %>
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
<th style="color: blue">Doctor_Id</th>
<th style="color: blue">Doctor_Name</th>
<th style="color: blue">Email</th>
<th style="color: blue">GENDER</th>
<th style="color: blue">Mobileno</th>
<th style="color: blue">Action</th>
</tr >


<core:choose>
<core:when test="${not empty DoctorList}">
<core:forEach items="${DoctorList}" var="docbean">

<tr>
<td>${docbean.getDocId()}</td>
<td>${docbean.getDocName()}</td>
<td>${docbean.getEmail()}</td>
<td>${docbean.getGender()}</td>
<td>${docbean.getMobilenumber()}</td>
<td>
<a href="${pageContext.request.contextPath}/getAllDoctorsById?docId=${docbean.getDocId()}">edit/</a>
<a href="deleteDoctorById?docId=${docbean.getDocId()}">delete</a>
</td>
</tr>
</core:forEach>
</core:when>
</core:choose> 
<core:set value="${docBean}" var="docbean"></core:set>
<tr>
<td>${docbean.getDocId()}</td>
<td>${docbean.getDocName()}</td>
<td>${docbean.getEmail()}</td>
<td>${docbean.getGender()}</td>
<td>${pbean.docbean.getMobileno()}</td>
<td>
<a href="${pageContext.request.contextPath}/getAllDoctorsById?docId=${docbean.getDocId()}">edit/</a>
<a href="deleteDoctorById?docId=${docbean.getDocId()}">delete</a>
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