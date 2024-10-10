<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Video List</title>
</head>
<body>
<h1>Video List</h1>
<a href="${pageContext.request.contextPath}/admin/videos?action=add">Add New Video</a>
<table border="1">
    <thead>
    <tr>
        <th>Video ID</th>
        <th>Title</th>
        <th>Description</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="video" items="${videos}">
        <tr>
            <td>${video.videoId}</td>
            <td>${video.title}</td>
            <td>${video.description}</td>
            <td>
                <a href="${pageContext.request.contextPath}/admin/videos?action=edit&id=${video.videoId}">Edit</a>
                <a href="${pageContext.request.contextPath}/admin/videos?action=delete&id=${video.videoId}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
