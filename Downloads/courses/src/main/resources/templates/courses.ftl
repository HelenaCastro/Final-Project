
<!DOCTYPE html>
<html lang="en">
<head>
<title>Courses</title>

<link href="/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.container {
	margin-top: 80px;
}
.bg-dark {
	background-color: #3b8dbd !important;
}
</style>
</head>
<body>

	<div class="container">

		<form class="form-inline" method="post" action="/courses/rumos">
			<input
				type="text" class="form-control mb-2 mr-sm-2 mb-sm-0"
				id="name" name="name" placeholder="Course name" />
			<input
				type="text"  class="form-control mb-2 mr-sm-2 mb-sm-0" id="price"
				placeholder="price" name="price" />

			<button type="submit" class="btn btn-primary">Add</button>
		</form>
		<br/>

		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th> name</th>
					<th>price</th>

					<th></th>
				</tr>
			</thead>
			<tbody>
				<#list cursoespetacular as item>
				<tr>
				    <th scope="row">${item.ID}</th>

					<th >${item.name}</th>

					<td>${item.price}</td>

                    <td>
                    <a href="/courses/rumos/delete/${item.ID}">
                    <button type="submit" class="btn btn-warning">Delete</button> </td>
                    </a>

				</tr>
				</#list>


			</tbody>
		</table>
	</div>
</body>
</html>
