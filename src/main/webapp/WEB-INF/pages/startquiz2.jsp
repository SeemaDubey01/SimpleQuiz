<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/script/startquiz2.js"></script>
<title>DeQuiz: Start Quiz</title>
</head>
<body>
<h1>Start Quiz</h1>
<!--  question number and question -->
<div class="questionForm">
  <div id="dquUserName"><H2>User Name</H2></div><p/>
  <div id="deqmQuestion"><H3>Question</H3></div>

  <div>
  <p id="optionA" class="quizQuestion">Option A</p>
  <p id="optionB" class="quizQuestion">Option B</p>
  <p id="optionC" class="quizQuestion">Option C</p>
  <p id="optionD" class="quizQuestion">Option D</p>
  </div>
</div>
<a href="/">Home</a>
</body>
</html>