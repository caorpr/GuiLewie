package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * 
 * @author cand3952
 * @version 0.4 November 9, 2015.
 */

public class GuiFrame extends JFrame
{
	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
		basePanel = new GuiPanel(baseController); // instance of GuiPanel with reference to controller.
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);  //They can't resize it, automatically true.
		this.setTitle("My First Window.");
		this.setSize(400, 400);		//Sets the size.
		this.setVisible(true);      //This will be you last line of code in the setupFrame method.
	}
}
