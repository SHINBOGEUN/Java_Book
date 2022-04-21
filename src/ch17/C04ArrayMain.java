package ch17;

public class C04ArrayMain {
	public static void main(String[] args) {
		int [][] arr1 = new int[2][3];
		
//		arr1[0][0] = 10;
//		arr1[0][1] = 20;
//		arr1[0][2] = 30;
//		arr1[1][0] = 40;
//		arr1[1][1] = 50;
//		arr1[1][2] = 60;
		
		
//		System.out.println(arr1.length);
//		System.out.println(arr1[0].length);
		
		
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				System.out.print(arr1[i][j]+ "\t");
//			}
//			System.out.println();
//		}
		
		
		int [][]arr2 = {{10, 20, 30}, {40, 50, 60},{70, 80, 80}};
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
