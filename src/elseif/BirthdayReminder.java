
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "aokrls 09919291th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String str = JOptionPane.showInputDialog("whos birthday");
		// 3. Print out what the user typed

		System.out.println(str);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (str.equals("mom")) {
			JOptionPane.showMessageDialog(null, "June 928228th");

		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (str.equals("dad")) {
			JOptionPane.showMessageDialog(null, "January 83788328th");

		}
		// 6. if user asked for your name
		// print myBirthday
		else if (str.equals("your")) {
			JOptionPane.showMessageDialog(null, "aprilahfiahifhahhfa 1978177117191919198197813th");

		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "dunno");

		}
	}
}
