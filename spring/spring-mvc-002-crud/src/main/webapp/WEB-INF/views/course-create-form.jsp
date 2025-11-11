<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>course-create-form</title>
</head>
<body>
<form action="http://localhost:8080/spring_mvc_002_crud_war/courses" method="post">
    <table>
        <tr>
            <td>id</td>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <td>Duration</td>
            <td><input type="text" name="duration"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="number" name="price"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add Course"></td>
        </tr>

    </table>

</form>
</body>
</html>
