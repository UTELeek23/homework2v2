<html>
<head>
    <title>Edit Video</title>
</head>
<body>
<h1>Edit Video</h1>
<form action="${pageContext.request.contextPath}/admin/videos" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="videoId" value="${video.videoId}">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" value="${video.title}" required><br>
    <label for="description">Description:</label>
    <textarea id="description" name="description" required>${video.description}</textarea><br>
    <label for="poster">Poster:</label>
    <input type="text" id="poster" name="poster" value="${video.poster}" required><br>
    <label for="active">Active:</label>
    <input type="number" id="active" name="active" value="${video.active}" required><br>
    <label for="views">Views:</label>
    <input type="number" id="views" name="views" value="${video.views}" required><br>
    <input type="submit" value="Update Video">
</form>
<a href="${pageContext.request.contextPath}/admin/videos">Back to Video List</a>
</body>
</html>
