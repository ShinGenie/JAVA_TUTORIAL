package bnb.java.genie;

import java.util.Scanner;

public class Compare {
	
	
	public static void apple() {
			
		Scanner scanner = new Scanner(System.in);	
		char ch = ' '; 
		System.out.printf("문자를 하나 입력하세요 >>> ");
		
		String input = scanner.nextLine();
		ch = input.charAt(1);
		
		if('0' <= ch && '9' >=ch ) {
			System.out.println("입력하신 문자는 숫자입니다 ");
		}	
		if(('a' <= ch &&  'z' >= ch) || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다%n");
//			System.out.print("입력하신 문자는 영문자입니다");

		}
		
	}//apple end
	
	
	public static void main(String[] args) {
		
		apple();
		//https://blog.javarouka.me/2018/10/28/new_project_1/   cs 개발
		//https://www.otwojob.com/product/PRGMS5oxLRfGZOTIryKW  /  cs 
		//https://1833-8259.tistory.com/76 // 인터넷 전화 cs 개발
	}//main end
	
}//class end
