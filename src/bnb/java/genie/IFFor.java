package bnb.java.genie;

import java.util.Scanner;

public class IFFor {

	
	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		System.out.printf("������ �Է��ϼ���>>%n");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);
		
//		if(score >= 90) {
//			grade = 'A';
//		}else if(score >=80) {
//			grade='B';
//		}else if(score >=70) {
//			grade = 'C';
//		}else {
//			grade='D';
//		}
//		
//		System.out.println("����� ������ " + grade + " �Դϴ�");
		
		System.out.println("score " + score);
		switch (score/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default:
			grade='D';
			break;
		}
		
		System.out.println("����� ������ " + grade + " �Դϴ�");
		
	}// main end

}

