<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>second servlet</title>
</head>
<body>

<h1>Second Servlet Html Page</h1>
<h2>The sum of</h2>
<h2>n1 = <%= session.getAttribute("a") %></h2>
<h2>n2 = <%= session.getAttribute("b") %></h2>
<h1>Result = <%= session.getAttribute("ans") %></h1>

</body>
</html>