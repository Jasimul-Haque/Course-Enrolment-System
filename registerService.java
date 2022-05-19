package final_Exam;

import java.sql.SQLException;

public interface registerService {
	public Register addCourse(String courseID, String grade);

	Register addCourse(String courseID, String grade, String ssn) throws ClassNotFoundException, SQLException;
	

}
