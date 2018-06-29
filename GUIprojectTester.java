//***************************************************************************
//File: GUIprojectTester.java
//
//Purpose: To run the project through main.
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

import javax.swing.SwingUtilities;

public class GUIprojectTester
{

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new GUIframeMain();
			}
		});
	}
}
