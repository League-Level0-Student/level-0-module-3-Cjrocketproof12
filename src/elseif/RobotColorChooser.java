//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Random ninjadiedofligma = new Random();
		// 1. Create a new Robot
		Robot pewDiePie = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		String epic = JOptionPane.showInputDialog(null, "wut color red gren or blu");
		// 5. Use an if/else statement to set the pen color that the user requested
		if (epic.equals( "red")) {
			pewDiePie.setPenColor(0, 255, 0);
			
		}
		else if (epic.equals( "green")) {
			pewDiePie.setPenColor(0, 0, 255);
			
		}
		else if (epic.equals( "blue")) {
			pewDiePie.setPenColor(255, 0, 0);
			
		}
			;
		// 6. If the user doesn’t enter anything, choose a random color
			if(epic.equals("")) {
				int red = ninjadiedofligma.nextInt(256);	 
						int green =ninjadiedofligma.nextInt(256);
								int blue =ninjadiedofligma.nextInt(256);
				(new Color( , , );
			
		
			
				pewDiePie.setPenColor(ninjadiedofligma);
			}
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
		pewDiePie.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i < 100000; i++) {
			pewDiePie.setSpeed(1000);
			pewDiePie.penDown();
			pewDiePie.move(300);
			pewDiePie.turn(90);

		}
	}
}
