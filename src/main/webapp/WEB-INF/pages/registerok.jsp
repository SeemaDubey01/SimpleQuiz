<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Status</title>
</head>
<body>
<H2>Registration Status <span></span></H2>

<form:form action="/startquiz" method="get" modelAttribute="user">
	<form:hidden path="dquQuizId" value ="${user.dquQuizId}"/>
	<form:hidden path="dquUserName" value ="${user.dquUserName}"/>
	<form:label path="dquQuizId">Quiz#: <span>${user.dquQuizId}</span></form:label><p/>
	<form:label path="dquUserName">Quiz#: <span>${user.dquUserName}</span></form:label><p/>
	<form:label path="dquSessionId">Quiz#: <span>${user.dquSessionId}</span></form:label><p/>
	<form:button>Continue</form:button>
</form:form>		

</body>
</html>