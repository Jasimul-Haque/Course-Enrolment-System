<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Colors (3)</title>
</head>
<jsp:useBean id="colorBean3" class="colors.ColorBean" scope="application"/>
<jsp:setProperty property="*" name="colorBean3"/>
<body bgcolor='<jsp:getProperty property="backgroundColor" name="colorBean3"/>'  >


	TEXT="<jsp:getProperty property="foregroundColor" name="colorBean3"/>"
<h1>Show Colors (3)</h1>
------------------------,---------------------,------------------

</body>
</html>