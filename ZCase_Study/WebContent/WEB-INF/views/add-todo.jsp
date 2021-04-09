<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div class="container">

	<form:form action="addtodo" method="post" modelAttribute="todo">
	<fieldset class="form-group">
		<form:label path="tName">Name</form:label>
		<form:input name="tName" path="tName" type="text" class="form-control" required="required"/>
		<form:errors path="tName"></form:errors>
	
	</fieldset>
		<fieldset class="form-group">
		<form:label path="tDesc">Description</form:label>
		<form:input name="tDesc" path="tDesc" type="text" class="form-control" required="required"/>
		<form:errors path="tDesc"></form:errors>
	
	</fieldset>
		<fieldset class="form-group">
		<form:label path="doneDate">Done Date</form:label>
		<form:input name="doneDate" path="doneDate" type="date" class="form-control" required="required"/>
		<form:errors path="doneDate"></form:errors>
	
	</fieldset>
	
	<div style="text-align: center">
			<button type="submit" class="btn btn-success">Save</button>
	</div>
	
	</form:form>
	

</div>

<%@include file="footer.jsp" %>