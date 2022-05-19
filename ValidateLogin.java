package final_Exam;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/Validation")
public class ValidateLogin extends HttpServlet {
	 
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		
		String ssn= request.getParameter("ssn");
		if(ssn==null){
			ssn="";
		}
		ssn=ssn.trim();
		StudentInfo studentService=new StudentInfo();

		
		
		Student student=studentService.getinfo(ssn);
		MyCourses course=studentService.getCourseinfo(ssn);
		AllCourses allCourse=studentService.getAllCourseinfo();
		
		
		
		
		
		request.setAttribute("student", student);
		request.setAttribute("course", course);
		request.setAttribute("allCourse", allCourse);
		System.out.println(allCourse.getCourseList());
		
		String address="";
		if(ssn.isEmpty()){
			address="/WEB-INF/LoginError.jsp";
		}else if(ssn !=null){
			address="/WEB-INF/MyRegis.jsp";
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
		
	}

}



