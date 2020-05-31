<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("#optionA").click(function(){
		$("#selectedAnswer").attr("value","a");
		$("#quizform").submit();
  });
  $("#optionB").click(function(){
		$("#selectedAnswer").attr("value","b");
		$("#quizform").submit();
  });
  $("#optionC").click(function(){
		$("#selectedAnswer").attr("value","c");
		$("#quizform").submit(); 
  });
  $("#optionD").click(function(){
		$("#selectedAnswer").attr("value","d");
		$("#quizform").submit();
  });
});
</script>
<title>DeQuiz: Start Quiz</title>
</head>
<body>
<h1>Start Quiz</h1>
<!--  question number and question -->
<form:form id="quizform" action="/showresult"  method="post" modelAttribute="deQuizMaster">
  <div>
  <div>${deQuizMaster.deqmQuestion}</div>
  </div>
  <div>
  <form:hidden path="deqmQuizId" value="${deQuizMaster.deqmQuizId}"/>
  <form:hidden path="deqmQuestionNo" value="${deQuizMaster.deqmQuestionNo}"/>
  <form:hidden path="dquUserId" value="${deQuizMaster.dquUserId}"/>
  <form:hidden path="deqmAnswer" value="${deQuizMaster.deqmAnswer}"/>
  <form:hidden path="selectedAnswer" value="a"/>
  <p id="optionA">
  <form:label path="deqmOption_a" cssStyle="color: white;background-color:DodgerBlue">${deQuizMaster.deqmOption_a}</form:label>
  </p>
  <p id="optionB">
  <form:label path="deqmOption_b" cssStyle="color: white;background-color:DodgerBlue">${deQuizMaster.deqmOption_b}</form:label>
  </p>
  <p id="optionC">
  <form:label path="deqmOption_c" cssStyle="color: white;background-color:DodgerBlue">${deQuizMaster.deqmOption_c}</form:label>
  </p>
  <p id="optionD">
  <form:label path="deqmOption_d" cssStyle="color: white;background-color:DodgerBlue">${deQuizMaster.deqmOption_d}</form:label>
  </p>
<!--   <form:radiobutton path="selectedAnswer" readonly="true" cssStyle="color: white;background-color:Red" value = "a" /> 
  <form:input path="deqmOption_a" readonly="true" cssStyle="color: white;background-color:DodgerBlue" value = " ${deQuizMaster.deqmOption_a}" />
  </div><br/>
  <div>
  <form:radiobutton path="selectedAnswer" readonly="true" cssStyle="color: white;background-color:Red" value = "b" /> 
  <form:input path="deqmOption_b" readonly="true" cssStyle="color: white;background-color:Red" value = " ${deQuizMaster.deqmOption_b}" />
  </div><br/>
  <div>
  <form:radiobutton path="selectedAnswer" readonly="true" cssStyle="color: white;background-color:Green" value = "c" />
  <form:input path="deqmOption_c" readonly="true" cssStyle="color: white;background-color:Green" value = " ${deQuizMaster.deqmOption_c}" />
  </div><br/>
  <div>
  <form:radiobutton path="selectedAnswer" readonly="true" cssStyle="color: white;background-color:Orange" value = "d" /> 
  <form:input path="deqmOption_d" readonly="true" cssStyle="color: white;background-color:Orange" value = " ${deQuizMaster.deqmOption_d}" /> 
   
  <br/>  
  <form:button>submit</form:button>
  -->
  </div>
</form:form>
</body>
</html>