<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Colors (2)</title>
</head>
<jsp:useBean id="colorBean2" class="colors.ColorBean" scope="session"/>
<jsp:setProperty property="*" name="colorBean2"/>
<body bgcolor='<jsp:getProperty property="backgroundColor" name="colorBean2"/>'  >


	TEXT="<jsp:getProperty property="foregroundColor" name="colorBean2"/>"
<h1>Show Colors (2)</h1>
------------------------,---------------------,------------------

</body>
</html>