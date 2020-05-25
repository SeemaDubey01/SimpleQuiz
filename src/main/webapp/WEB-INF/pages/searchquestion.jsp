<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>DeQuiz - Search Question</title>
</head>
<body>
<div align="center" style="font-size:8vw;">
	<h2>Search Question: </h2>
	<form:form action="/displayquestion" method="post" modelAttribute="deQuizQuestions">
	<table>
		<tr><td><form:label path="dequizquiz.dqQuizId"> Enter Quiz Id: </form:label></td>
		<td><form:input path="dequizquiz.dqQuizId"/></td></tr>
		<tr><td><form:label path="dqsQuestionNo">Enter Question No:</form:label></td>
		<td><form:input path="dqsQuestionNo"/> </td></tr>
	</table>
		<form:button>submit</form:button>
	</form:form>
</div>
</body>
</html>