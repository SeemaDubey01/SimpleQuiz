<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1> DB Result</H1><p/>
<div align="center">
		<h2>Participants please enter details</h2>
		<form:form  modelAttribute="list">
			<span>Element1 </span><span>${list.get(0)}</span> <br />
			<span>Element2</span><span>${list.get(1).toString()}</span> <br/>
			<span>Element3</span><span>${list.get(2).toString()}</span>
		</form:form>
</div>
<a href="/">Back</a>
</body>
</html>