package final_Exam;

import java.sql.*;
import java.util.ArrayList;

//import beans.Student;
//import beans.MyCourses;

public class DButil {
	private static Connection connection;
	private ResultSet resultset;
	
	// Open Connection to database
	public void connectDB(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("JDBC Driver loaded. Connecting to database....");
			connection = DriverManager.getConnection("jdbc:sqlserver://s16988308.onlinehome-server.com:1433;"
					+ "databaseName=CUNY_DB;integratedSecurity=false;", "cst4713","password1");
			System.out.println("Database Connected.");
		}catch(ClassNotFoundException | SQLException ex){
			ex.printStackTrace();
		}
	}
	
	// Run Query to get result set
	public ResultSet getQuery(String query) throws SQLException, ClassNotFoundException {
		
		try{
			connectDB();
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery(query);
		}catch(SQLException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		
		return resultset;
	}	
public AllCourses getAllCourse(String query) throws SQLException, ClassNotFoundException {
	AllCourses allCourses = new AllCourses();
	ArrayList<String> courseList = new ArrayList<String>();

		try{
			connectDB();
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery(query);
			while (resultset.next()) {
				courseList.add(resultset.getString(1));
				
			}
		}catch(SQLException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		
		return allCourses;
	}	
	
	// Insert values into database
	public void updateValues(String table, String query)throws SQLException, ClassNotFoundException {
		
		try{
			connectDB();
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
		}catch(SQLException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		
	}

	public Student validateSSNDB(String ssn) {

		String queryString = "select * from Students where ssn = ?";
		Student studentBean = new Student(ssn);
		try {
			connectDB();
			PreparedStatement preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setString(1, ssn);
			ResultSet resultset = preparedStatement.executeQuery();
			
			if(resultset.next()) {
				studentBean.setSsn(resultset.getString(1));
				studentBean.setFirstName(resultset.getString(2));
				studentBean.setMi(resultset.getString(3));
				studentBean.setLastName(resultset.getString(4));
				studentBean.setBirthDate(resultset.getString(5));
				studentBean.setStreet(resultset.getString(6));
				studentBean.setPhone(resultset.getString(7));
				studentBean.setZipcode(resultset.getString(8));
				studentBean.setDeptId(resultset.getString(9));				
				resultset.close();
				
				return (studentBean);
			}
			else {
				resultset.close();
				
				return (studentBean);
			}
			
		} catch (SQLException e) {	
		//If SSN does not exist in DB:
			return null;
		}
	}	

	public MyCourses getMyCourses(String ssn) {

		String queryString = "select en.courseId, co.title, en.grade from Enrollment en, Course co "; 
		queryString = queryString + " where en.ssn = ? and en.courseId = co.courseID";
		MyCourses myCoursesBean = new MyCourses();
		ArrayList<String> myRegCourses = new ArrayList<String>();
		
		try {
			connectDB();
			PreparedStatement preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setString(1, ssn);
			ResultSet resultset = preparedStatement.executeQuery();

			while (resultset.next())
			{
				myRegCourses.add(resultset.getString(1));
				myRegCourses.add(resultset.getString(2));
				myRegCourses.add(resultset.getString(3));
				//+ "  |" + resultset.getString(2) + "|" + resultset.getString(3) + "<BR>");			
			}
			resultset.close();
			myCoursesBean.setMyCourses(myRegCourses);
			return (myCoursesBean);

		} catch (SQLException e) {	
			//If SSN does not exist in DB:
			return null;
		}
	}	
	public AllCourses getallMyCourses() {

		String queryString = "SELECT  [courseID]  FROM Course"; 
		
		AllCourses courseBean = new AllCourses();
		ArrayList<String> allCourseList = new ArrayList<String>();
		
		try {
			connectDB();
			PreparedStatement preparedStatement = connection.prepareStatement(queryString);
			
			ResultSet resultset = preparedStatement.executeQuery();

			while (resultset.next())
			{
				allCourseList.add(resultset.getString(1));
				
				//+ "  |" + resultset.getString(2) + "|" + resultset.getString(3) + "<BR>");			
			}
			resultset.close();
			courseBean.setCourseList(allCourseList);
			return (courseBean);

		} catch (SQLException e) {	
			//If SSN does not exist in DB:
			return null;
		}
	}	
	
	
	
	// Closes database connection
	public void closeConn() throws SQLException{

		connection.close();
	}
}