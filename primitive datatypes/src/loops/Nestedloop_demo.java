package loops;

public class Nestedloop_demo {
	public static void main(String arg[]) {
       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0;i< 3;i++) {
			for (int j = 0; j < 3;j++ ) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
			
	}

}
/* first inner loop will excute and the outer will excute the nested loop*/