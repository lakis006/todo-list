<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

	<div
		class="content-wrapper d-flex align-items-center auth auth-bg-1 theme-one">
		<div class="row w-100">
			<div class="col-lg-4 mx-auto">
				<div class="auto-form-wrapper">
			<form:form action="./update" method="post" modelAttribute="updateTodo">
			<form:input path="id" type="hidden" value="${updateTodo.id}"/>
			<form:input path="id" type="hidden" value="${updateTodo.tList}"/>
						<div class="form-group">
							<form:label path="tName" class="label">Task Name</form:label>
							<div class="input-group">
								<form:input path="tName" type="text" name="tName" class="form-control"
									placeholder="username"/>
							</div>
						</div>

						<div class="form-group">
							<form:label path="tDesc" class="label">Task Description</form:label>
							<div class="input-group">
								<form:input type="text" name="tDesc" path="tDesc" class="form-control"
									placeholder="Description"/>
							</div>
						</div>

						<div class="form-group">
							<form:label path="doneDate" class="label">Done Date</form:label>
							<div class="input-group">
								<form:input type="text" path="doneDate" name="doneDate" class="form-control"
									placeholder="Target Date"/>
								<div class="input-group-append"></div>
							</div>
						</div>
						<div class="form-group">
							<input class="btn btn-primary submit-btn btn-block" type="submit"
								 value="Update"/>
						</div>
					</form:form>
				</div>
			</div>
			
		</div>
	</div>

		
<%@include file="footer.jsp" %>
</body>
</html>