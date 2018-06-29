//***************************************************************************
//File: PanelTitle.java
//
//Purpose: The title panel file create a class that is designed to construct
//		a JPanel that will contain single JTextField that displays a title.
//
//Written By: Timothy N
//
//Compilers: Eclipse Oxygen
//		   
//Update Information
//------------------
//
//Name:
//Date:
//Description: 
//
//***************************************************************************

package guiProject;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIpanelTitle extends JPanel
{
	private JLabel m_titleLBL;
	
	public GUIpanelTitle()
	{		
		setLayout(new BorderLayout());
		
		m_titleLBL = new JLabel("SUNY Farmingdale State College Database");
		m_titleLBL.setHorizontalAlignment(JLabel.CENTER);
		m_titleLBL.setHorizontalTextPosition(JLabel.CENTER);
		m_titleLBL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
		
		add(m_titleLBL);
	}
}
