<%@page import="java.text.Format"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.siri.esmartHealthCare.beans.MedicinesBean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<th style="color: blue">Medicine_Id</th>
<th style="color: blue">Medicine_Name</th>
<th style="color: blue">ManifactureDate</th>
<th style="color: blue">ExpireDate</th>
<th style="color: blue">Action</th>
</tr >


<core:choose>
<core:when test="${not empty MedicinesList}">
<core:forEach items="${MedicinesList}" var="medibean">

<tr>
<td>${medibean.getMedicineId()}</td>
<td>${medibean.getMedicineName()}</td>
<td>${medibean.getManifactureDate()}</td>
<td>${medibean.getExpiredDate()}</td>
<td>
<a href="${pageContext.request.contextPath}/getAllMediciensById?medicineId=medibean.getMedicineId()">edit/</a>
<a href="deleteDoctorById?docId=${docbean.getDocId()}">delete</a>
</td>
</tr>.................
</core:forEach>
</core:when>
</core:choose>
</table>
<a href="addMedicines">addMedicines</a>
<form action="${pageContext.request.contextPath}/searchMedicines?searchValue&searchCriteria">
<select name="searchCriteria">
<option value="name"  label="searchByName">searchByName</option>
<option value="date" label="searchByDate">searchByDate</option>
</select>
<input type="text" name="searchValue"></input>
<input type="submit" value="search"/>
</form>

</body>
</html>