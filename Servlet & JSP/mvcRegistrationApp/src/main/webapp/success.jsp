<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success</title>
</head>
<body>

    <h1 style="color: green;">Success!</h1>
    <h2>Your operation was completed successfully.</h2>


<%

String name=session.getAttribute("name_").toString();
String email=session.getAttribute("email_").toString();
String pass=session.getAttribute("pass").toString();


%>

<h2>Congratulations <%= name %> your registration is successful</h2>
<h2>with email <%= email %> and Password <%= pass %> </h2>


</body>
</html>