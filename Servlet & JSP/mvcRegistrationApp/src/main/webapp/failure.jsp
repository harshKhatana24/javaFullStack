<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>

    <h1 style="color: red;">Failed!</h1>
    <p>Something went wrong. Please try again.</p>


<%

String name=session.getAttribute("name_").toString();
String email=session.getAttribute("email_").toString();
String pass=session.getAttribute("pass").toString();


%>

<h2>Hey! <%= name %> your registration is failed</h2>
<h2>with email <%= email_ %> and Password <%= pass %> </h2>
<h1>try again</h1>


</body>
</html>