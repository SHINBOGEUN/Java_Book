package ch17;

import java.util.Arrays;
import java.util.Scanner;

public class C03ArrayMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr1 = new int[5];
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
			sum += arr1[i];
		}
		
		double aver = (double) sum / arr1.length;
		System.out.println("평균 = " + aver);
		int max ,min;
		
	
		// 0  1  2  3  4
		// 19 20 25 30 50
		min = arr1[0];
		max = arr1[0];
		
		for (int i = 1; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		
		
		System.out.println(min);
		System.out.println(max);
		
		
		
		
		
	}
}
