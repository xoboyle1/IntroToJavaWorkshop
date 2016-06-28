import org.jointheleague.graphical.robot.Robot;

public class robottest {
public static void main(String[] args) {
	Robot Nathan = new Robot();
	Nathan.move (200);
	Nathan.penDown();
	Nathan.turn (-90);
	Nathan.penDown();
	Nathan.move (200);
	Nathan.penDown();
	Nathan.turn(-90);
	Nathan.setSpeed(40);
}
}
