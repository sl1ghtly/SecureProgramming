import java.util.Date;

public final class Course {

	String courseName;
	private final Date startDate;

	public Course (String courseName, Date startDate) {
		this.courseName = courseName;
		this.startDate = new Date(startDate.getTime());
    }

	public String getCourseName() {
		return courseName;
	}

	public Date startDate() {
		return new Date(startDate.getTime());
	}
}
