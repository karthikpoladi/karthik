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
<th style="color: blue">PATIENT_ID</th>
<th style="color: blue">PATIENT_Name</th>
<th style="color: blue">DATEOFBIRTH</th>
<th style="color: blue">GENDER</th>
<th style="color: blue">createdDate</th>
<th style="color: blue">Email</th>
<th style="color: blue">createdBy</th>
<th style="color: blue">Action</th>
</tr >


<core:choose>
<core:when test="${not empty PatientList}">
<core:forEach items="${PatientList}" var="pbean">

<tr>
<td>${pbean.getPid()}</td>
<td>${pbean.getPname()}</td>
<td></td>
<td>${pbean.getGender()}</td>
<td></td>
<td>${pbean.getEmail()}</td>
<td>${pbean.getModifiedBy()}</td>
<td>
<a href="">edit/</a>
<a href="">delete</a>
<%-- <a href="${pageContext.request.contextPath}/home/getAllPatientsById?patientId=${pmodel.getPatientId()}">edit  </a>|
<a href="${pageContext.request.contextPath}/home/deletePatientById?patientId=${pmodel.getPatientId()}">delete</a> --%>
</td>

</tr>

</core:forEach>
</core:when>
</core:choose>
<%-- <core:set var="pmodel" value='${requestScope["patientModel"]}'>
</core:set>
 <tr>
 <td>${pmodel.getPatientId()}</td>
<td>${pmodel.getAddressId()}</td>
<td>${pmodel.getFirstName()}</td>
<td>${pmodel.getMiddleName()}</td>
<td>${pmodel.lastName}</td>
<td>${pmodel.gender}</td>
<td>${pmodel.getDateofBirth()}</td>
<td>${pmodel.dateBecamePatient}</td>
<td>${pmodel.getOtherDetails()}</td>
</tr>
</table>
<core:forEach items="${requestScope.allPatientsList}" var="ptdto">
<a href="${pageContext.request.contextPath}/home/getAllPatientsByPaging?currPage=${ptdto.getPatientId()}&noofRecPerPage=5">${ptdto.getPatientId()}
</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
</core:forEach> --%>
</body>
</html>