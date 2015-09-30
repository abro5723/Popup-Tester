package input.controller;

import input.model.Thingy;
import input.view.PopupDisplay;

public class InputController
{
	private PopupDisplay myPopups;
	private Thingy myTestThing;

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
		
		while(!isInteger(temp))
		{
			temp = myPopups.grabAnswer("Type in a positive integer idiot!");
		}
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
		double myWeight;
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.grabAnswer("Type in a number you butthead!");
		}
		if(isDouble(tempWeight))
		{
			myWeight = Double.parseDouble(tempWeight);
		}
		else
		{
			myWeight = 50.3;
		}
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
			myPopups.showResponse("not an integer, retry!");
		}

		return isInt;
	}

	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a number! Retry!");
		}
		
		return isDouble;
	}
}





