package arrays_demo;

public class ThreeD_array {
	public static void main(String args[]) {
		int arr[][][] = { { {1,4,7},{2,5,8} },{ {3,6,9},{4,5,6} } };
		
		for (int i = 0;i<2;i++) {
			for(int j = 0;j<2;j++) {
				//System.out.print(arr[i][j]+"");
				for (int z=0;z<3;z++) {
					System.out.print(arr[i][j][z]+"");
				}
				System.out.println();
		}
			//System.out.println();
	}
		
		//System.out.println(arr[0][1][2]);
	}

}
