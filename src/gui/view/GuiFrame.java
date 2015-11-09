package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * 
 * @author cand3952
 * @version 0.1 November 9, 2015.
 */

public class GuiFrame extends JFrame
{
	private GuiController baseController;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
	}
}
