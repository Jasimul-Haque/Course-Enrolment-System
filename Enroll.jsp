<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"">
<title>Enroll your class</title>


 

</head>
<body>
<form method="post" >


Courses: 
<select  id="selectcourses" name="courseID">
<option>ACC11</option>
<option>AFR12</option>
<option>CST00</option>
<option>CST01</option>
<option>CST02</option>
<option>CST03</option>
<option>CST04</option>
<option>CST06</option>
<option>CST07</option>
<option>CST08</option>
<option>CST0A</option>
<option>CST10</option>
<option>CST13</option>
<option>CST14</option>
<option>CST19</option>
<option>CST35</option>
<option>CST36</option>
<option>CST42</option>
<option>CST47</option>
<option>CST48</option>
<option>cst55</option>

<option>cst71</option>
<option>ENG01</option>
<option>ENG25</option>
<option>MATH2</option>
<option>PSY35</option>
</select>

select your Grade:
<select name="Grade">
<option>A</option>
<option>B</option>
<option>C</option>
<option>F</option>
</select>


</form>
<br>

<form  action="regisLogin.jsp">
<button>Exit</button>
</form>
<br>

<form  action="DropClas">

<button>drop</button>
</form>
<br>
<form  action="Resistation" name="CourseID">
<button>regitster</button>
</form>
</body>
</html>