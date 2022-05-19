<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>My register</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>


<body>
Name : ${student.firstName} ${student.mi} ${student.lastName}   Phone#: ${student.phone} </br>

My Classes: 


<table align="center" cellspacing="1" border="1">
  <tr>
    <th>Course ID</th>
    <th>Course Title</th>
    <th>Grade</th>
  </tr>
  <tr>
    <td>${course.myRegCourses[0]}</td>
    <td>${course.myRegCourses[1]}</td>
    <td>${course.myRegCourses[2]}</td>
    
    
  </tr>
  <tr>
    <td>${course.myRegCourses[3]}</td>
    <td>${course.myRegCourses[4]}</td>
    <td>${course.myRegCourses[5]}</td>
    
    
  </tr>

</table>
<form  action="regisLogin.jsp">
<button>Exit</button>
</form>

<form  action="Enroll.jsp">
<button>Enroll</button>
</form>






</body>
</html>