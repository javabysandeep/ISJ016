<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scriptlet tags</title>
</head>
<body>
<h2>normal scriptlet tag</h2>
<%
    out.println("java code written using scriptlet that will be part of jspService() method");
%>

<h2>expression scriptlet tag </h2>
<%="java code written using expression scriptlet that will be part of jspService() method" %>


<h2>declaration scriptlet tag - define new methods, variables in generated Servlet </h2>
<%!
    public static String greeting() {
        return "Greetings of the day " + LocalDateTime.now();
    }
%>
<%= greeting()%>

</body>
</html>
