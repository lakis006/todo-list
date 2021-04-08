<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"
	rel="stylesheet">

<link
	href="webjars/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker3.min.css"
	rel="stylesheet" />
<spring:url value="/resources/css/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Register</h1>

	<div
		class="content-wrapper d-flex align-items-center auth auth-bg-1 theme-one">
		<div class="row w-100">
			<div class="col-lg-4 mx-auto">
				<div class="auto-form-wrapper">
			<form:form action="./register" method="post" modelAttribute="user">
						<div class="form-group">
							<form:label path="username" class="label">Username</form:label>
							<div class="input-group">
								<form:input path="username" type="text" name="username" class="form-control"
									placeholder="username"/>
							</div>
						</div>

						<div class="form-group">
							<form:label path="email" class="label">Email</form:label>
							<div class="input-group">
								<form:input type="email" name="email" path="email" class="form-control"
									placeholder="email"/>
							</div>
						</div>

						<div class="form-group">
							<form:label path="password" class="label">Password</form:label>
							<div class="input-group">
								<form:input type="password" path="password" name="password" class="form-control"
									placeholder="*********"/>
								<div class="input-group-append"></div>
							</div>
						</div>
						<div class="form-group">
							<input class="btn btn-primary submit-btn btn-block" type="submit"
								 value="Register"/>
						</div>
					</form:form>
				</div>
			</div>
			
		</div>
	</div>

		
<%@include file="footer.jsp" %>
</body>
</html>