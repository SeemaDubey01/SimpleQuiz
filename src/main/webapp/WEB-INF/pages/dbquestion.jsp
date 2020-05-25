<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DB Question</title>
</head>
<body>
<H1> DB Question</H1><p/>
<div align="center">
		<h2>Here is question </h2>
		<form:form  modelAttribute="list">
			<span>Q1: </span><span>${list.get(0)}</span> <br />
			<span>Q2:</span><span>${list.get(1)}</span> <br/>
			<span>Q3:</span><span>${list.get(2)}</span><br/>
			Q4: <span>${list.get(3)}</span>
		</form:form>
	</div>
<div style="width:80%; margin:0 auto">
<!--  question number and question -->
  <h2>1. What is the capital of India?</h2>
  <form:form method="get">
 	<div style="color: white;background-color:DodgerBlue" onclick="alert('Delhi')"> Delhi</div>
    <div style="color: white;background-color:Red" onclick="alert('Mumbai')"> Mumbai</div>
    <div style="color: white;background-color:Green" onclick="alert('Kolkata')"> Kolkata</div>
    <div style="color: white;background-color:Orange" onclick="alert('Chennai')"> Chennai</div>
  </form:form>
<br /><a href="/">Home</a>
</div>
<a href="/">Back</a>
</body>
</html>