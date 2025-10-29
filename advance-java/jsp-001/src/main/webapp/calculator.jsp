<%@page errorPage="handler.jsp" %>
<html>
<body>
<h2>calculate.jsp file</h2>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operator = request.getParameter("operator");
    int result = switch (operator) {
        case "+" -> number1 + number2;
        case "-" -> number1 - number2;
        case "*" -> number1 * number2;
        case "/" -> number1 / number2;
        case "%" -> number1 % number2;
        default -> throw new IllegalStateException("Unexpected value: " + operator);
    };
    out.println("Result is = " + result);
%>
</body>
</html>
