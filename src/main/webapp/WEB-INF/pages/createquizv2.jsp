<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeQuiz - Create Quiz</title>
</head>
<body>
<div align="center">
		<h2>Create your quiz - version 2</h2>
		<form:form action="/writequiz" method="post" modelAttribute="deQuizQuiz">
			<form:label path="dqQuizId"> Quiz Number: </form:label>
			<form:input path="dqQuizId"/><p/> 
			<form:label path="dqQuizDetail"> Quiz Name: </form:label>
			<form:input path="dqQuizDetail" /><p/>
			<form:button>submit</form:button>
		</form:form>
	</div>
</body>
</html>