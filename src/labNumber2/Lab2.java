package labNumber2;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	char userChar;
	userChar = 'y';

	while (userChar == 'y') {
		System.out.println("How many inches long is your room?");	
		double snugRoomLength = scan.nextDouble();
		
		System.out.println("How many inches wide is your room?");
		double snugRoomWidth = scan.nextDouble();
		
		double snugRoomArea = snugRoomLength * snugRoomWidth;
		
		System.out.println("The area of your room is " + snugRoomArea); 
		
		double snugRoomPerimeter = (snugRoomWidth * 2) + (snugRoomLength * 2);
		
		System.out.println("The perimeter of your room is " + snugRoomPerimeter); 
		
		System.out.println("Would you like to continue measuring more rooms? Enter 'y' if Yes");
		
		userChar = scan.next().charAt(0);		
	}
	
		System.out.println("Have a good day!");
	
	}
}
