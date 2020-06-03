<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="/css/dequiz.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> 
<script src="/script/registerquiz2.js"></script>
<title>DeQuiz - Register Multiplayer Quiz</title>

</head>
<body>
<H1> Register for multiplayer quiz</H1>
<p/>
<div>
	<form:form id="quizform" action="startquiz2" method="post" modelAttribute="deQuizUser">
		Quiz No: 
		<form:input path="dquQuizId" value="101" type="int"></form:input><p/>
		User Name:
		<form:input path="dquUserName" value="mtest"></form:input><p/>
		<form:button>submit</form:button>
	</form:form><p/>
	<table>
	<tr><td>Time remaining: <span id="timer">10</span> Seconds</td></tr>
	<tr><td>Marks: <span id="tmarks">1000</span> points</td></tr>
	</table>
	<a href="dbtest">DBTEST</a>
</div>

</body>
</html>