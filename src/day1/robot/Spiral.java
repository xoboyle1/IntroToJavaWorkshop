package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Nathan = new Robot();
		Nathan.turn(75);
		Nathan.setSpeed(10);
		for (int i = 0; i < 75; i++) {
		Nathan.penDown();	
		Nathan.move(5);

			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
		}
	}
}
