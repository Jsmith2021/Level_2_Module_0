package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot Robots[]= {new Robot(),  new Robot(), new Robot(), new Robot(), new Robot()};
	//3. use a for loop to initialize the robots.
for(int i=0; i<5; i++) {
	System.out.println(Robots);
	Robots[i].setSpeed(10);
	Robots[i].turn(180);
	Robots[i].move(200);
	Robots[i].turn(180);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up



	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

Random rand  = new Random();
int num=rand.nextInt(50);
num=30;
for(int j=0; j<100; j++) {
	
for(int i=0; i<Robots.length; i++) {
	num++;
	System.out.println(num);
	Robots[i].move(num);
	
}

Robots[j].move(num);

}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
System.out.println("You are the winner!");


	//8. try different races with different amounts of robots.
//Robot Robots2[]= {new Robot(),  new Robot()};
	//9. make the robots race around a circular track.
//for(int i=0; i<2; i++) {
	////.out.println(Robots);
	//Robots2[i].setSpeed(10);
	//Robots2[i].turn(180);
	//Robots2[i].move(200);
	//Robots2[i].turn(180);
	
}
//for(int i=0; i<361; i++) {
////.out.println(Robots);
//Robots2[i].turn(1);
//Robots2[i].move(num);
//}
//}
}