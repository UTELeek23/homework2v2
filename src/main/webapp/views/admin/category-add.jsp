<html>
<head>
    <title>Add Category</title>
</head>
<body>
<h1>Add New Category</h1>
<form action="${pageContext.request.contextPath}/admin/category/insert" method="post">
    <label for="name">Category Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <input type="submit" value="Add Category">
</form>
<a href="${pageContext.request.contextPath}/admin/categories">Back to Category List</a>
</body>
</html>
