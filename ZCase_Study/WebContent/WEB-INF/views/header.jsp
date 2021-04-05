 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<title>Todo-List</title>
<link href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"
    rel="stylesheet">

<link
    href="webjars/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker3.min.css"
    rel="stylesheet" />
    	<spring:url value="/resources/css/style.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

</head>

<body>