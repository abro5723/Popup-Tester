package input.controller;

import input.view.PopupDisplay;

public class InputController
{
	private PopupDisplay myPopups;
	
	public InputController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String temp = myPopups.grabAnswer("Type in your name.");
		myPopups.showResponse("Your name is: " + temp);
	}
}
