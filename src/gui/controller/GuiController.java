package gui.controller;

import gui.view.GuiFrame;

/**
 * GuiController for the super simple GUI project!!
 * @author cand3952
 *
 */
public class GuiController
{
	/**
	 * Reference to the GuiFrame object of the view.
	 */
	private GuiFrame baseFrame;
	
	public GuiController()
	{
		baseFrame = new GuiFrame(this);
	}
	
	public void start()
	{}
}
