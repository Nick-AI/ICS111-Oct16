
public class Months {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 8;
		int num3 = 12;
		int num4 = 0;
		
		// Print month names using IF ELSE statements
		
		printMonthUsingIfs(num1);
		printMonthUsingIfs(num2);
		printMonthUsingIfs(num3);
		printMonthUsingIfs(num4);
		
		System.out.println();
		
		// Print month names using SWITCH statements
		
		printMonthUsingSwitch(num1);
		printMonthUsingSwitch(num2);
		printMonthUsingSwitch(num3);
		printMonthUsingSwitch(num4);
		
		// The result is exactly the same!
		
	}
	
	/**
	 * Uses IF ELSE structure
	 * Prints out the name of the month, according to the number of the month.
	 * Ex: If number is 1, print January. If number is 12, print December.
	 * If the number is not a number from 1 through 12, print "???"
	 * 
	 * @param num : an integer, the number of the month.
	 */
	public static void printMonthUsingIfs(int num) {
		if (num == 1) {
			System.out.println("January");
		}
		else if (num == 2) {
			System.out.println("February");
		}
		else if (num == 3) {
			System.out.println("March");
		}
		else if (num == 4) {
			System.out.println("April");
		}
		else if (num == 5) {
			System.out.println("May");
		}
		else if (num == 6) {
			System.out.println("June");
		}
		else if (num == 7) {
			System.out.println("July");
		}
		else if (num == 8) {
			System.out.println("August");
		}
		else if (num == 9) {
			System.out.println("September");
		}
		else if (num == 10) {
			System.out.println("October");
		}
		else if (num == 11) {
			System.out.println("November");
		}
		else if (num == 12) {
			System.out.println("December");
		}
		else {
			System.out.println("???");
		}
	}
	
	
	/**
	 * Uses SWITCH structure
	 * Prints out the name of the month, according to the number of the month.
	 * Ex: If number is 1, print January. If number is 12, print December.
	 * If the number is not a number from 1 through 12, print "???"
	 * 
	 * @param num : an integer, the number of the month.
	 */
	public static void printMonthUsingSwitch(int num) {
		switch (num) {
		case 1: 
				System.out.println("January");
				break;
		case 2: 
				System.out.println("February");
				break;
		case 3: 
				System.out.println("March");
				break;
		case 4:
				System.out.println("April");
				break;
		case 5:
				System.out.println("May");
				break;
		case 6:
				System.out.println("June");
				break;
		case 7: 
				System.out.println("July");
				break;
		case 8:
				System.out.println("August");
				break;
		case 9: 
				System.out.println("September");
				break;
		case 10:
				System.out.println("October");
				break;
		case 11:
				System.out.println("November");
				break;
		case 12:
				System.out.println("December");
				break;
		default:
				System.out.println("???");
		}
	}
}
