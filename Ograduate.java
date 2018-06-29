package guiProject;

public class Ograduate extends Ostudents
{
	public Ograduate()
	{
		super();
	}
	public Ograduate(String fName, String lName, String status, String courseStudent)
	{
		this();
		super.setfName(fName);
		super.setlName(lName);
		super.setMatriculantStatus(status);
		super.setCoursesStudent(courseStudent);
	}
}
