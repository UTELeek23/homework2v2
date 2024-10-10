<html>
<head>
    <title>Edit Category</title>
</head>
<body>
<h1>Edit Category</h1>
<form action="${pageContext.request.contextPath}/admin/category/update" method="post">
    <input type="hidden" name="id" value="${category.id}">
    <label for="name">Category Name:</label>
    <input type="text" id="name" name="name" value="${category.name}" required>
    <br>
    <input type="submit" value="Update Category">
</form>
<a href="${pageContext.request.contextPath}/admin/categories">Back to Category List</a>
</body>
</html>
