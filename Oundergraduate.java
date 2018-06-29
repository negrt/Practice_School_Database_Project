package guiProject;

public class Oundergraduate extends Ostudents
{
	public Oundergraduate()
	{
		super();
	}
	public Oundergraduate(String fName, String lName, String status, String courseStudent)
	{
		this();
		super.setfName(fName);
		super.setlName(lName);
		super.setMatriculantStatus(status);
		super.setCoursesStudent(courseStudent);
	}
}
