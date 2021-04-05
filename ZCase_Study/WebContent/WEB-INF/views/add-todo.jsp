<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div class="container">

	<form:form method="post" modelAttribute="todo">
	<form:hidden path="id"/>
	<fieldset class="form-group">
		<form:label path="name">Name</form:label>
		<form:input path="name" type="text" class="form-control" required="required"/>
		<form:errors path="name"></form:errors>
	
	</fieldset>
		<fieldset class="form-group">
		<form:label path="desc">Description</form:label>
		<form:input path="desc" type="text" class="form-control" required="required"/>
		<form:errors path="desc"></form:errors>
	
	</fieldset>
		<fieldset class="form-group">
		<form:label path="doneDate">Done Date</form:label>
		<form:input path="doneDate" type="text" class="form-control" required="required"/>
		<form:errors path="doneDate"></form:errors>
	
	</fieldset>
		<button type="submit" class="btn btn-success">Save</button>
	</form:form>
	

</div>

<%@include file="footer.jsp" %>