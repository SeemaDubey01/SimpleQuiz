<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("#ctime").click(function(){
		$("#param").attr("value","Page clicked....");
		
  });
});
</script>
<title>SimpleQuiz: Listener</title>
</head>
<body>
<H1> Listening</H1>
<p id="ctime">Current time:</p> ${dqtCurrTime}
<p id="param"></p>
<p/> <a href="/">Home</a>
</body>
</html>