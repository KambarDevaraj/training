<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Courses List</title>
</head>
<body>
<h1>Courses List</h1>
<table border="1">
    <thead>
        <tr>
            <th>Course ID</th>
            <th>Course Name</th>
            <th>Course Description</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.description}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
