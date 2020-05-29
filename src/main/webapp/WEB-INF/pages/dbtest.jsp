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
	var remainingSec = 10;
	var marks = 1000;
	setInterval(function(){
		$("#timer").text (remainingSec);
		remainingSec = remainingSec - 1;
		if (remainingSec < 0 ) $("#quizform").submit();

		setInterval(function(){
			marks = marks - 2;
			if (marks < 0 ) marks =0;
			$("#dqtMarks").attr("value",marks);
			$("#tmarks").text (marks);
		},100);

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
		<form:hidden path="dqtMarks" id="dqtMarks" value=" " />
		<form:button>submit</form:button>
	</form:form><p/>
	<table Style="border:1px solid black; width:200px">
	<tr><td>Time remaining: <span id="timer">10</span> Seconds</td></tr>
	<tr><td>Marks: <span id="tmarks">1000</span> points</td></tr>
	</table>
</div>
</body>
</html>