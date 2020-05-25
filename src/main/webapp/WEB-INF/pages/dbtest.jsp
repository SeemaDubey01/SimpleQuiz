<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> 
<script>
	var remainingSec = 15;
	setInterval(function(){
		$("#timer").text ("Time remaining " + remainingSec + " seconds")
		remainingSec = remainingSec - 1;
		if (remainingSec <0 ) form.submit();
	},1000);
</script>

<title>Insert title here</title>
</head>
<body>
<H1> DB Test to insert values</H1>
<p/>
<div>
	<form:form id="quizform" action="dbtestresult" method="post" modelAttribute="dqtest">
		Quiz No: 
		<form:input path="dqtQuizNo" value="1" type="int"></form:input><p/>
		User Name:
		<form:input path="dqtUserName" value="MD"></form:input><p/>
		<form:button>submit</form:button>
	</form:form><p/>
	<p id="timer"></p>
</div>
</body>
</html>