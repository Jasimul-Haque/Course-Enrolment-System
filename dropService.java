package final_Exam;

import java.sql.SQLException;

public interface dropService {
	public Drop addCourse(String courseID, String grade);

	Register addCourse(String courseID, String grade, String ssn) throws ClassNotFoundException, SQLException;
	

}
