<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>DeQuiz - Create Confirm</title>
</head>
<body>
<div align="center" style="font-size:5vw;">
		<h2>Search Question:</h2>
			<form:form  action="/searchquestion" method="get" modelAttribute="deQuizQuestions">
			<table>
 			<tr><form:label path="dqsQuestionId"><H2> Quiz#: ${deQuizQuestions.dequizquiz.dqQuizId}</H2></form:label></tr>
 			<tr><form:label path="dqsQuestionId"><H3> Quiz Name: ${deQuizQuestions.dequizquiz.dqQuizDetail}</H3></form:label></tr>
			<tr><form:label path="dqsQuestionNo">Question#: ${deQuizQuestions.dqsQuestionNo}</form:label></tr>
			<tr><td><form:label path="dqsQuestion"> Q: </form:label></td>
			<td><form:label path="dqsQuestion"/>${deQuizQuestions.dqsQuestion}</td></tr> 
			<tr><td><form:label path="dqsOption_a"> Option A: </form:label></td>
			<td><form:label path="dqsOption_a" />${deQuizQuestions.dqsOption_a}</td></tr>
			<tr><td><form:label path="dqsOption_b"> Option B: </form:label></td>
			<td><form:label path="dqsOption_b" />${deQuizQuestions.dqsOption_b}</td></tr>
			<tr><td><form:label path="dqsOption_c"> Option C: </form:label></td>
			<td><form:label path="dqsOption_c" />${deQuizQuestions.dqsOption_c}</td></tr>
			<tr><td><form:label path="dqsOption_d" > Option D: </form:label></td>
			<td><form:label path="dqsOption_d" />${deQuizQuestions.dqsOption_d}</td></tr>
			<tr><td><form:label path="dqsAnswer"> Correct option: </form:label></td>
			<td><form:label path="dqsAnswer" length="1"/>${deQuizQuestions.dqsAnswer}</td></tr>
			</table>
			<form:button>Search Another Question</form:button>
			</form:form>
			<span ><a href="/">Home</a></span>

</div>
</body>
</html>