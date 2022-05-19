package final_Exam;

import java.sql.SQLException;
import java.util.Iterator;

public class StudentInfo  implements StudentValidateService {

	@Override
	public Student getinfo(String ssn) {
		DButil db= new DButil();
		Student student=db.validateSSNDB(ssn);
System.out.println(student.getFirstName());;
		return student;
	}

	@Override
	public MyCourses getCourseinfo(String ssn) {
		// TODO Auto-generated method stub
		DButil db= new DButil();
		MyCourses myCourses=db.getMyCourses(ssn);
		
		return myCourses;
	}

	@Override
	public AllCourses getAllCourseinfo() {
		DButil db=new DButil();
		AllCourses allCourse=db.getallMyCourses();
		// TODO Auto-generated method stub
		return allCourse;
	}
	
	
	
//	
////	public Student Validate(String ssn) throws SQLException {
////		DButil db= new DButil();
////		
////		Student student=db.validateSSNDB(ssn);
////		student.getFirstName();
////		
////		db.closeConn();
////		return student;
////		
////	}
//	
//
//    @Override
//    public String getFirstName(String ssn) throws SQLException {
//    	DButil db= new DButil();		
//		Student student=db.validateSSNDB(ssn);	        
//        String firstName=student.getFirstName();
//        db.closeConn();
//        return firstName;    }
//
//    @Override
//    public String getMi(String ssn) throws SQLException {
//        DButil db= new DButil();
//        Student student=db.validateSSNDB(ssn);
//        String mi =student.getMi();
//        db.closeConn();
//        return mi;
//    }
//
//    @Override
//    public String getLastName(String ssn) throws SQLException {
//        DButil db= new DButil();
//        Student student=db.validateSSNDB(ssn);
//        String lastName =student.getLastName();
//        
//        db.closeConn();
//        return lastName;
//    }

//    @Override
//    public String getBirthDate(String ssn) throws SQLException {
//        DButil db= new DButil();
//        Student birthDate =db.validateSSNDB(ssn);
//        db.closeConn();
//        return birthDate;
//        }
//
//    @Override
//    public String getPhone(String ssn) throws SQLException {
//        DButil db= new DButil();
//        Student phone =db.validateSSNDB(ssn);
//        db.closeConn();
//        return phone;
//        }
//
//    @Override
//    public String getDeptId(String ssn) throws SQLException {
//        DButil db= new DButil();
//        Student deptId =db.validateSSNDB(ssn);
//        db.closeConn();
//        return deptId;
//        }
//   

}