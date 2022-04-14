package ch07;

import java.util.*;
public class C02while {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		int i = 2;
		//가로 구구단
//		while(i < 10) {
//			int j = 1;
//			while (j < 10) {
//				System.out.printf("%d * %d = %d", i, j, i * j);
//				System.out.println();
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//구구단을 역순출력한다.
		//단수 입력받아(dan) dan-9단 까지 출력
		//조건 dan안의 숫자는 9 미만이여야한다.
		
//		int dan = input.nextInt();
//		
//		while(dan > 1) {
//			int q = 9;
//			while (q > 2) {
//				System.out.printf("%d * %d = %d",dan, q, q * dan);
//				q--;
//				System.out.println();
//			}
//			System.out.println();
//			dan--;
//			
//		}
		
		
		
		//세로 구구단
//		while(i < 10) {
//			int j = 2;
//			while (j < 10) {
//				System.out.printf("%d * %d = %d\t", j, i, i * j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		System.err.println();
//		int h = 1;
//		while(h < 6) {
//			int w = 1;
//			while(w < 6) {
//				System.out.print("*");
//				w++;
//			}
//			System.out.println();
//			h++;
//		}
		
		//=============================
		//*
		//**
		//***
		//****
		
//		int h = input.nextInt();
//		String s = "";
//		while (h > 0) {
//			System.out.println(s += "*");
//			h--;
//		}
		
		//==============================
		
		
		// 높이 : 3
		// *
		// **
		// ***
		
//		h = 3;
//		s = "";
//		while (h > 0) {
//			System.out.println(s += "*");
//			h--;
//		}
		
		
		
		
	
		
//		System.err.println();
		// ****
		// ***
		// **
		// *
		//높이 : 4
//		int h = input.nextInt();
//		while(h > 0) {
//			String s = "";
//			int w = h;
//			while (w > 0) {
//				s += "*";
//				w--;
//			}
//			
//			System.out.println(s);
//			h--;
//		}
		
//		int i = 4;
//		int j = 3;
//		
//		while (i > 0) {
//			j = i;
//			while(j >0) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i--;
//		}
		
		
		
		
		
		// 높이 : 3
		// ***
		// **
		// *
		
//		int h = 3;
//		while(h > 0) {
//			String s = "";
//			int w = h;
//			while (w > 0) {
//				s += "*";
//				w--;
//			}
//			
//			System.out.println(s);
//			h--;
//		}
		//==============================
		
		//   *
		//  ***
		// *****
		//*******
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int h = input.nextInt();
//		while (i < h) {
//			
//			j=0;
//			while(j <= h-2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while(k <=2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		
		
		
		
		
		
		
		
//		String s = "*";
//		int h = 0;
//		int n = input.nextInt();
//		while(h < n) {
//			int j = 0;
//			while (j <= n-2-h) {
//				System.out.print(" ");
//				j++;
//			}
//			System.out.print(s);
//			while (j <= n-2-h) {
//				System.out.print(" ");
//				j++;
//			}
//			System.out.println();
//			s += "**";
//			h++;
//		}
		
		
		// 높이 : 3
		//   *
		//  ***
		// *****	
		
//		s = "*";
//		h = 0;
//		
//		while(h < 3) {
//			int j = 0;
//			while (j <=1-h) {
//				System.out.print(" ");
//				j++;
//			}
//			System.out.print(s);
//			while (j <= 1-h) {
//				System.out.print(" ");
//				j++;
//			}
//			System.out.println();
//			s += "**";
//			h++;
//		}
		
		//*******
		// *****
		//  ***
		//   *
		
		//강사님 풀이
		
		
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int n = input.nextInt();
//		while (i < n) {
//			j=0;
//			while(j <= i -1) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			
//			while(k	<=(n-1)*2-(2*i)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		
		
		
		
		
		String s = " ";
		int h = 0;
		int n = input.nextInt();
		while (h < n) {
			int j = n-h;
			int k = h;
			while (k > 0) {
				System.out.print(s);
				k--;
			}
			while (j > 0) {
				System.out.print("*");
				j--;
			}
			j =n-1-h;
			while (j > 0) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			h++;
		}
		// 높이 : 3
		// *****
		//  ***
		//   *
		

		
//		int h = 0;
//		while (h < 3) {
//			int j = 3-h;
//			int k = h;
//			while (k > 0) {
//				System.out.print(" ");
//				k--;
//			}
//			while (j > 0) {
//				System.out.print("*");
//				j--;
//			}
//			j =2-h;
//			while (j > 0) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			h++;
//		}
		
		//   *
		//  ***
		// *****
		//******* 
		// *****
		//  ***
		//   *
		
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int h = input.nextInt();
//		while (i < 7) {
//			
//			if(i<4) {
//				j=0;
//				while(j <= 2-i) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k <= 2 * i) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				j=0;
//				while(j <= i -4) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				
//				while(k <=6*2-(2*i) ) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			
//			
//			System.out.println();
//			i++;
//		}
		
		
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int h = input.nextInt();
//		while (i < h) {  // 7
//			
//			if(i<(h/2)) {  //4
//				j=0;
//				while(j <= (h/2)-1-i) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				while(k <= 2 * i) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				j=0;
//				while(j <= i - ((h/2)+1)) {
//					System.out.print(" ");
//					j++;
//				}
//				k=0;
//				
//				while(k <=(h-1)*2-(2*i) ) {
//					System.out.print("*");
//					
//					k++;
//				}
//			}
//			
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
		


		
	}

}
