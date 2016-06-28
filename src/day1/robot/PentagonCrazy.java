package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
	 Robot Nathan = new Robot();

		Nathan.penDown();
Nathan.setSpeed(10);
		// 8. Make the robot go at maximum speed (10)

		// 9. Set the pen to a color that you like for the shape

		int sides = 5;

		
int angle = 360/sides;
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.
for (int i = 0; i < 200; i++) {
	

		
	Nathan.move(200);
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	
			Nathan.turn(angle + 1);
	
			// 11. Turn the robot one more degree

	}}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}