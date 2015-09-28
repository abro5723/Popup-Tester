package input.view;

import javax.swing.JOptionPane;
/**
 * A popup display class used for showing input and output.
 * @author abro5723
 * @version 1.0 09/24/15
 */
public class PopupDisplay
{
	/**
	 * Displays inputs and outputs in a popup window.
	 * @param wordsFromSomewhere
	 */
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	/**
	 * Displays a popup with field in which you can type, along with text supplied by the program.
	 * It returns the answer/input to the supplied question as a String(text).
	 * @param stuff
	 * @return
	 */
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);

		return answer;
	}
}
