package switch_Case;

import java.util.*;

public class Switch {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.print("Input a : ");
		int a = input.nextInt();
		System.out.print("Input b : ");
		int b = input.nextInt();
		
		System.out.println("MENU FOR THE BASIC CALCULATOR :"
				+ " \n\n1 -> Addition\n2 -> Subtraction\n3 -> Multiplication\n4 -> Division");
		
		System.out.print("Choose option : ");
		int option = input.nextInt();
		
		switch(option) {
			case 1 :	System.out.println("a+b = "+(int)(a+b));
						break;
			case 2 :	System.out.println("a-b = "+(a-b));
						break;
			case 3 :	System.out.println("a*b = "+a*b);
						break;
			case 4 :	System.out.println("a/b = "+(float)a/b);
						break;
			default :	System.out.println("a*b = "+a*b);
			
		}

	}

}
