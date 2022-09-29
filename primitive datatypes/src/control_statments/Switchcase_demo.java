package control_statments;

import java.util.Scanner;

public class Switchcase_demo {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int month =sc.nextInt();
		String monthstring;
		
		switch(month) {
		case 1: 
			monthstring = "jan";
			break;
		case 2:
			monthstring = "feb";
			break;
		case 3:
			monthstring = "march";
			break;
		case 4:
			monthstring = "april";
			break;
		case 5:
			monthstring = "may";
			break;
		case 6:
			monthstring = "june";
			break;
		case 7:
			monthstring = "july";
			break;
		case 8:
			monthstring = "august";
			break;
		case 9:
			monthstring = "sep";
			break;
		case 10:
		    monthstring = "oct";
		    break;
		case 11:
			monthstring = "nov";
			break;
		case 12:
		    monthstring = "dec";
		    break;
		default:
			monthstring = "invalid month";
			break;
		}
		System.out.println(monthstring);
	}

}
