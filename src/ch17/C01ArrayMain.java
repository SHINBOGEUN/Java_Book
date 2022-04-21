package ch17;

public class C01ArrayMain {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] = %d\n", i , arr1[i]);
		}
		
		System.out.println(arr1.length);
		
		
		double arr2[] = new double[7];
		
		float arr3[];
		arr3 = new float[10];
		
		System.out.println("arr2의 배열의 길이 = " + arr2.length);
		System.out.println("arr3의 배열의 길이 = " + arr3.length);
		
		
		
	}
}
