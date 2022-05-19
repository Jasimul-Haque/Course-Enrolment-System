package final_Exam;

import java.sql.SQLException;

public class DropInfo implements dropService{

	@Override
	public Register addCourse(String courseID, String grade,String ssn) throws ClassNotFoundException, SQLException {
		DButil db= new DButil();
		db.updateValues("Enrollment", "insert into Enrollment (ssn, courseId, dateRegistered, grade)values ("+ssn+","+courseID+",'12-17-2021', "+grade);
		return null;
	}

	@Override
	public Drop addCourse(String courseID, String grade) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
