<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>


<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>To-Do Title</th>
				<th>Description</th>
				<th>Is it Done?</th>
				<th></th>
				<th></th>
			</tr>
			</thead>
			
			<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
				<td>${todo.tName}</td>
				<td>${todo.tDesc}</td>
				<td>"${todo.doneDate}</td>
				<td>${todo.isComplete}</td>
				<td><a type="button" class="btn btn-success" href="update-todo?id=${todo.id}">Update</a></td>
				<td><a type="button" class="btn btn-warning" href="delete-todo?id=${todo.id}">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
	</table>
	
	<div style="text-align: center">
		
		<button  type="button" class="btn btn-light btn-lg btn-block"><a href="add-todo"> Add A Todo</a></button>
	</div>
	
</div>


<%@include file="footer.jsp" %>