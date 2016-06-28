package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot Nathan=new Robot(); 
	

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
Nathan.setSpeed(10);
			
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
Nathan.penDown();
		Nathan.move(90);
		Nathan.turn(90);
		Nathan.move(90);
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
