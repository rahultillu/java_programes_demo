package control_statments;

public class Nestedif_demo {
	public static void main(String args[]) {
		int a = 50;
		if(a == 50) {
			System.out.println("i is 50");
			if(a < 75) {
				System.out.println("i is smaller then 75");
				if(a < 55) {
					System.out.println("i is smaller then 55");
				}
			}
		}
	}

}
