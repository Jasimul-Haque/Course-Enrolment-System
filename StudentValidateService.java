package final_Exam;

import java.sql.SQLException;

public interface StudentValidateService {
	public Student getinfo(String ssn);
	public MyCourses getCourseinfo(String ssn);
	public AllCourses getAllCourseinfo();
}
