<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<link href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"
    rel="stylesheet">

<link
    href="webjars/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker3.min.css"
    rel="stylesheet" />
    	<spring:url value="/resources/css/style.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

</head>
<body bgcolor="red">
	<h1>Login</h1>
	<h3>${loginFailedMessage}</h3>
		<div class="content-wrapper d-flex align-items-center auth auth-bg-1 theme-one">
          <div class="row w-100">
            <div class="col-lg-4 mx-auto">
              <div class="auto-form-wrapper">
                <form action="./login" method="post">
                  <div class="form-group">
                    <label class="label">Username</label>
                    <div class="input-group">
                      <input type="text" name="username" class="form-control" placeholder="username">
                      <div class="input-group-append">
                    
                      </div>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="label">Password</label>
                    <div class="input-group">
                      <input type="password" name="password" class="form-control" placeholder="*********">
                      <div class="input-group-append">

                      </div>
                    </div>
                  </div>
                  <div class="form-group">
                    <input class="btn btn-primary submit-btn btn-block" type="submit" value="Login">
                  </div>
                  <div class="form-group d-flex justify-content-between">
               
                  </div>
                  <div class="text-block text-center my-3">
                    <span class="text-small font-weight-semibold">Not a member ?</span>
                    <a href="register.jsp" class="text-black text-small">Create new account</a>
                  </div>
                </form>
              </div>

              <p class="footer-text text-center">copyright © 2021 Minn-Things. All rights reserved.</p>
        
            </div>
          </div>
        </div>
	

</body>
</html>