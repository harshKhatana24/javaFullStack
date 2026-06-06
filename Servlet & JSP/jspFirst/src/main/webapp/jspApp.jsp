<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>jsp project</title>
</head>
<body>

<h1>JSP Web App to generate Dynamic Response</h1>


<%@

page import="java.util.Date"

%>

<%!
int age = 18;
%>

<%


Date date=new Date();

String n=request.getParameter("uname");
String e=request.getParameter("ucity");

out.println(n+" "+e);
out.println("from jsp file directly");
out.println("age is : "+age);
out.println("date today: "+date);


%>


<h1><%= date %></h1>
<h2><%= e %></h2>

<h1>I Know your real age is: <%= age%></h1>

</body>
</html>