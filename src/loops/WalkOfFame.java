
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.setX(41);
		// You also need to show the robot to see the result of this line.
for (int i = 0; i < 5; i++) {
	rob.setSpeed(100);
rob.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
rob.turn(144);
		// 3. Set the size of the star to 30.
rob.move(50);
}
rob.penUp();
rob.turn(90);
rob.move(50);
for (int i = 0; i < 5; i++) {
	rob.setSpeed(100);
rob.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
rob.turn(144);
		// 3. Set the size of the star to 30.
rob.move(50);
}
rob.penUp();
rob.turn(180);
rob.move(50);
for (int i = 0; i < 5; i++) {
	rob.setSpeed(100);
rob.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
rob.turn(144);
		// 3. Set the size of the star to 30.
rob.move(50);
}
rob.penUp();
rob.turn(270);
rob.move(50);
for (int i = 0; i < 5; i++) {
	rob.setSpeed(100);
rob.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
rob.turn(144);
		// 3. Set the size of the star to 30.
rob.move(50);
}
rob.penUp();
rob.turn(360);
rob.move(50);






		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
