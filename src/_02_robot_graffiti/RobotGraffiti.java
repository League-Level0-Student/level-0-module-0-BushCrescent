package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	public static void main(String[] args) throws Exception{
Robot rob = new Robot();
rob.penDown();

rob.setSpeed(10);
rob.move(100);
rob.turn(-90);
rob.move(50);
rob.turn(180);
rob.move(100);
rob.turn(180);
rob.move(50);
rob.turn(-90);
rob.move(100);
rob.turn(90);
rob.move(50);
rob.turn(90);
rob.move(50);
}
}
