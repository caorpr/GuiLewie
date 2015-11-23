package gui.view;

import javax.swing.*; // You can do this so that everything in "javax.swing." is imported! Can mess up HUGE projects apparently, 

import java.awt.Color;
import java.awt.event.ActionListener;     //  but Mr. H says it is okay for any of the projects that we do.
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import gui.controller.GuiController;

import java.awt.event.*;

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button");

		firstTextField = new JTextField("Type Words Here");
				
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Loads content into the panel.
	 */
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);  //This needs to be your first line.
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	/**
	 * Helper method to hold this crap GUI layout code.
	 */
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 171, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 170, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 361, SpringLayout.WEST, this);
		
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 0, SpringLayout.WEST, firstButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -4, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 290, SpringLayout.WEST, this);

	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			
			public void mouseClicked(MouseEvent clicked)
			{
				changeRandomColor();
			}
			
			
			@Override
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			
			
			@Override
			public void mousePressed(MouseEvent pressed)
			{
				changeRandomColor();
			}
			
			@Override
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}
			
			
			@Override
			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}
		});
		
		
	}


	
	private void changeRandomColor()
	{
		int red, green, blue;
	
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
	
		this.setBackground(new Color(red, green, blue));
	}


}
