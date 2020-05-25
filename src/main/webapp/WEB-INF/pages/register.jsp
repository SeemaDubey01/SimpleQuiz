<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JoinQuiz</title>
</head>
<body>
	<div align="center">
		<h2>Participants please enter details</h2>
		<form:form action="/register" method="post" modelAttribute="user">
			<form:label path="dquQuizId">Quiz#:</form:label>
			<form:input path="dquQuizId" type = "number" />
			<form:errors path="dquQuizId" />
			<form:label path="dquUserName">Your Name:</form:label>
			<form:input path="dquUserName" />
			<form:errors path="dquUserName" />
			<form:button>submit</form:button>
		</form:form>
	</div>
</body>
</html>