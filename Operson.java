//***************************************************************************
//File: Operson.java
//
//Purpose: To create the person class.
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

public class Operson 
{
	//Attributes
	private String m_firstName;
	private String m_lastName;
	
	//Constructors
	public Operson()
	{
		m_firstName = "None";
		m_lastName = "None";
	}
	public Operson(String firstName, String lastName)
	{
		this();
		m_firstName = firstName;
		m_lastName = lastName;
	}
	
	//Setters & Getters
	public void setfName(String fName)
	{
		m_firstName = fName;
	}
	public void setlName(String lName)
	{
		m_lastName = lName;
	}
	public String getfName()
	{
		return m_firstName;
	}
	public String getlName()
	{
		return m_lastName;
	}
}
