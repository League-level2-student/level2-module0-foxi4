package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen. 

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.
//no
	//9. make the robots race around a circular track.
	//no
	public static void main(String[] args) { 
		
		Robot[] robots = new Robot[5]; 
		
		for(int i=0; i<robots.length; i++){
			robots[i] = new Robot();
		
		}
		
		robots[0].moveTo(100, 550);
		robots[1].moveTo(275, 550);
		robots[2].moveTo(450, 550);
		robots[3].moveTo(625, 550);
		robots[4].moveTo(800, 550);
		
		boolean winner = false;
		
			
			
			
			while(!winner) {  
				for(int i=0; i<robots.length; i++){
					Random rand = new Random();
					int movement = rand.nextInt(50);
					robots[i].setSpeed(20);
					robots[i].move(movement);
			
					if(robots[i].getY()<0) {
						winner = true; 
						
						    JOptionPane.showMessageDialog(null, "robot " + i + " won! woooooo");
						
					}
					
				}
			
		}
		
			
	}
}
