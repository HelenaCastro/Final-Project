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

    		<form class="form-inline" method="post" action="/courses/rumos/update">
    		    <input
    		    type="text" readonly="readonly" name="ID" value="${add.ID}"/>
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





    			</tbody>
    		</table>
    	</div>



</body>
</html>
