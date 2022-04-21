package ch17;

import java.util.Scanner;

public class C05ArrayMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[][] = new int[5][3];
		int student[] = new int[5];
		int score[] = new int[3];
		int student1 = 0;
		int sub = 0;
		//학생 총점
		for (int i = 0; i < arr.length; i++) {
			student1 =0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextInt();
				student1 += arr[i][j];
			}
			student[i] = student1;		
		}
		//과목 총점 리스트 추가
		for (int i = 0; i < score.length; i++) {
			sub = 0;
			for (int j = 0; j < arr.length; j++) {
				sub += arr[j][i];
			}
			score[i] = sub;
		}
		//학생 출력
		for (int i = 0; i < student.length; i++) {
			System.out.printf("학생%d 총점 = %d 평균 = %d\n",i+1, student[i], student[i]/arr[0].length);
		}
		System.out.println();
		//과목 출력
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 과목 총점수 = %d\t", i+1, score[i]);
			System.out.printf("%d번째 과목의 총점수 = %.1f\n",i+1, (double)score[i]/3);
		}

		
		

		
		
	
		
	}
}
