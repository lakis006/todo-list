<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div class="container">

	<form:form action="add-todo" method="post" modelAttribute="todo">
	<form:hidden path="id"/>
	<fieldset class="form-group">
		<form:label path="tName">Name</form:label>
		<form:input path="tName" type="text" class="form-control" required="required"/>
		<form:errors path="tName"></form:errors>
	
	</fieldset>
		<fieldset class="form-group">
		<form:label path="tDesc">Description</form:label>
		<form:input path="tDesc" type="text" class="form-control" required="required"/>
		<form:errors path="tDesc"></form:errors>
	
	</fieldset>
		<fieldset class="form-group">
		<form:label path="doneDate">Done Date</form:label>
		<form:input path="doneDate" type="date" class="form-control" required="required"/>
		<form:errors path="doneDate"></form:errors>
	
	</fieldset>
	
	<div style="text-align: center">
			<a href="list-todos"><button type="submit" class="btn btn-success">Save</button></a>
	</div>
	
	</form:form>
	

</div>

<%@include file="footer.jsp" %>