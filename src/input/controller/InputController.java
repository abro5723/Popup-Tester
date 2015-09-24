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
		String myName = myPopups.grabAnswer("Type in your name.");
		myPopups.showResponse("Your name is: " + myName);

		String temp = myPopups.grabAnswer("Type in your age");
		int myAge;

		if (isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = 9999;
		}
		myPopups.showResponse("Your age is: " + myAge);

		String tempWeight = myPopups.grabAnswer("Type in your weight");
		double myWeight = Double.parseDouble(tempWeight);
		myPopups.showResponse("Your weight is: " + myWeight);

		myTestThing = new Thingy(myName, myAge, myWeight);
	}

	private boolean isInteger(String input)
	{
		boolean isInt = false;

		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch (NumberFormatException error)
		{
			myPopups.showResponse("not an iteger - bad value will be used");
		}

		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double tempWeight = Double.parseDouble(input);
			isDouble = true;
		}
		catch()
		{
			
		}
		
		return isDouble;
	}
}
