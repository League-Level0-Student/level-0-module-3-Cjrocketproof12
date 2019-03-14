//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas

		String tgay = JOptionPane.showInputDialog("u liek banannanasanasanas?");
		// 2. if they say no,

		// tell them they are crazy
		// and end quiz
		if (tgay.equals("no")) {
			JOptionPane.showMessageDialog(null, "good");
			System.exit(0);
		}
		// 3. if they say yes
		else if (tgay.equals("yes")) {
			tgay = JOptionPane.showInputDialog("whats your favourite hobby?");
			JOptionPane.showMessageDialog(null, tgay + " sucks");
		}
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes�? or “no�?
		// show a pop up that says “You are bananas!�?

	}

}
