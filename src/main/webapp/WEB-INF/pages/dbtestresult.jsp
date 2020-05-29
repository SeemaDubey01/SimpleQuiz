<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DB Test OK</title>
</head>
<body>

<H1> Quiz Result</H1>
<form:form  action = "/dbtest" modelAttribute="dqtest">
<p> Record is ----- Quiz#: <span>${dqtest.dqtQuizNo}</span> and name: 
<span>${dqtest.dqtUserName}</span> </p>
Your marks: ${dqtest.dqtMarks}
</form:form>
<a href="/"> Back</a>
</body>
</html>