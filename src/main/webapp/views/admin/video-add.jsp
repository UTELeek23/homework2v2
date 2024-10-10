<html>
<head>
  <title>Add Video</title>
</head>
<body>
<h1>Add New Video</h1>
<form action="${pageContext.request.contextPath}/admin/videos" method="post">
  <input type="hidden" name="action" value="add">
  <label for="videoId">Video ID:</label>
  <input type="text" id="videoId" name="videoId" required><br>
  <label for="title">Title:</label>
  <input type="text" id="title" name="title" required><br>
  <label for="description">Description:</label>
  <textarea id="description" name="description" required></textarea><br>
  <label for="poster">Poster:</label>
  <input type="text" id="poster" name="poster" required><br>
  <label for="active">Active:</label>
  <input type="number" id="active" name="active" required><br>
  <label for="views">Views:</label>
  <input type="number" id="views" name="views" required><br>
  <input type="submit" value="Add Video">
</form>
<a href="${pageContext.request.contextPath}/admin/videos">Back to Video List</a>
</body>
</html>
