//***************************************************************************
//File: GUIframeMain.java
//
//Purpose: The main frame creates a window and mounts the panels to them.
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

import java.awt.GridLayout;
import javax.swing.JFrame;

public class GUIframeMain extends JFrame
{
	/******************************************************
	 * STEP 1: Variables
	 * 
	 * Notes: Create outside of class to be able to access
	 * 		  through other functions.
	 ******************************************************/
	//Member Variables ::OUTSIDE::
	private GUIpanelTitle m_PanelTitle;
	private GUIpanelMain m_PanelMain;
	
	//TheFrame Constructor
	public GUIframeMain()
	{
		/******************************************
		 * STEP 2: Customize
		 * 
		 * Notes: Panels will use grid layout or
		 * 		  flow layout depending on what is
		 * 		  instructed.
		 ******************************************/
		super("Project 1");
		setLayout(new GridLayout(2,0));
		setSize(1300, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/***********************************************
		 * STEP 3: Initialize
		 * 
		 * Notes: Create the Panels. Do this by calling
		 * 		  the Panel constructors.
		 ***********************************************/
		m_PanelTitle = new GUIpanelTitle();
		m_PanelMain = new GUIpanelMain();
	
		/*************************************
		 * STEP 4: add();
		 * 
		 * Notes: Mount the panels on frame.
		 * ***********************************/
		add(m_PanelTitle);
		add(m_PanelMain);
		
		/**************************************************
		 * STEP 5: Set Visibility
		 * 
		 * Notes: Let code run everything before setting
		 * 		  the visibility to true. This ensures the
		 * 		  everything was loaded prior to appearing
		 *		  on screen. Can be Used as a method of
		 *		  trouble shooting.
		 **************************************************/		
		
		setVisible(true);
	}
}
