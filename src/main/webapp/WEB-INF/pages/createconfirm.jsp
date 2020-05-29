<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeQuiz - Create Confirm</title>
</head>
<body>
<div align="center">
		<h2>Create your quiz: Question Created</h2>
			<form:form  action="/createquestionv2" method="get" modelAttribute="deQuizQuestions">
 			<form:hidden path="dequizquiz.dqQuizId" value = "${deQuizQuestions.dequizquiz.dqQuizId}"/>
			<form:hidden path="dequizquiz.dqQuizDetail" value = "${deQuizQuestions.dequizquiz.dqQuizDetail}"/>
			<form:hidden path="dqsQuestionNo" value = "${deQuizQuestions.dqsQuestionNo}"/>
			<form:hidden path="dqsQuestionId" value = "${deQuizQuestions.dqsQuestionId}"/>
			<table>
 			<tr><form:label path="dqsQuestionId"><H2> Quiz#: ${deQuizQuestions.dequizquiz.dqQuizId}</H2></form:label></tr>
 			<tr><form:label path="dqsQuestionId"><H3> Quiz#: ${deQuizQuestions.dequizquiz.dqQuizDetail}</H3></form:label></tr>
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
			<form:button>Create Another Question</form:button>
			</form:form>
			<a href="/">Home</a>

</div>
</body>
</html>