//***************************************************************************
//File: Oemployee.java
//
//Purpose: To create the employee class.
//
//Written By: Timothy N
//
//Compilers: Eclipse Java Oxygen
//		   
//Update Information
//------------------
//
//Name:
//Date:
//Description: 
//
//****************************************************************************

package guiProject;

public class Oemployee extends Operson
{
	//Attributes
	private String m_deptName;
	private static int m_eID = 0;
	
	//Constructors
	public Oemployee()
	{
		super();
		m_eID++;
		m_deptName = "None";
	}
	public Oemployee(String deptName)
	{
		this();
		m_deptName = deptName;
	}
	public Oemployee(String firstName, String lastName, String deptName)
	{
		this();
		m_deptName = deptName;
		super.setlName(lastName);
		super.setfName(firstName);
	}
	
	//Setters & Getters
	public void setDeptName(String deptName)
	{
		m_deptName = deptName;
	}
	public String getDeptName()
	{
		return m_deptName;
	}
	public int getEmployeeID()
	{
		return m_eID;
	}	
}
