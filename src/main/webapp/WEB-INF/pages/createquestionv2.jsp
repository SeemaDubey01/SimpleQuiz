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
		<h2>Create your quiz: Enter New question</h2>
 		<form:form action="/createconfirm" method="post" modelAttribute="deQuizQuestions">
 			<form:label path="dequizquiz.dqQuizId" value = "${deQuizQuestions.dequizquiz.dqQuizId}"><H2> Quiz#: ${deQuizQuestions.dequizquiz.dqQuizId}</H2></form:label><p/>
 			<form:label path="dequizquiz.dqQuizDetail" value="${deQuizQuestions.dequizquiz.dqQuizDetail}"><H3> Quiz#: ${deQuizQuestions.dequizquiz.dqQuizDetail}</H3></form:label><p/>
			<form:label path="dqsQuestionNo" value ="${deQuizQuestions.dqsQuestionNo}">Question#: ${deQuizQuestions.dqsQuestionNo}</form:label><p/>
			<form:hidden path="dequizquiz.dqQuizId" value = "${deQuizQuestions.dequizquiz.dqQuizId}"/>
			<form:hidden path="dequizquiz.dqQuizDetail" value = "${deQuizQuestions.dequizquiz.dqQuizDetail}"/>
			<form:hidden path="dqsQuestionNo" value = "${deQuizQuestions.dqsQuestionNo}"/>
			<form:hidden path="dqsQuestionId" value = "${deQuizQuestions.dqsQuestionId}"/>
			<form:label path="dqsQuestion"> Q: </form:label>
			<form:input path="dqsQuestion"/><p/> 
			<form:label path="dqsOption_a"> Option A: </form:label>
			<form:input path="dqsOption_a" /><p/>
			<form:label path="dqsOption_b"> Option B: </form:label>
			<form:input path="dqsOption_b" /><p/>
			<form:label path="dqsOption_c"> Option C: </form:label>
			<form:input path="dqsOption_c" /><p/>
			<form:label path="dqsOption_d" > Option D: </form:label>
			<form:input path="dqsOption_d" /><p/>
			<form:label path="dqsAnswer"> Correct option: </form:label>
			<form:input path="dqsAnswer" length="1"/><p/>
			<form:button>submit</form:button>
		</form:form>
  	</div>
  	<div>
  	<a href="/"> Go Back</a>
  	</div>
</body>
</html>