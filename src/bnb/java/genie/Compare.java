package bnb.java.genie;

import java.util.Scanner;

public class Compare {
	
	
	public static void apple() {
			
		Scanner scanner = new Scanner(System.in);	
		char ch = ' '; 
		System.out.printf("���ڸ� �ϳ� �Է��ϼ��� >>> ");
		
		String input = scanner.nextLine();
		ch = input.charAt(1);
		
		if('0' <= ch && '9' >=ch ) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ� ");
		}	
		if(('a' <= ch &&  'z' >= ch) || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�%n");
//			System.out.print("�Է��Ͻ� ���ڴ� �������Դϴ�");

		}
		
	}//apple end
	
	
	public static void main(String[] args) {
		
		apple();
		//https://blog.javarouka.me/2018/10/28/new_project_1/   cs ����
		//https://www.otwojob.com/product/PRGMS5oxLRfGZOTIryKW  /  cs 
		//https://1833-8259.tistory.com/76 // ���ͳ� ��ȭ cs ����
	}//main end
	
}//class end
