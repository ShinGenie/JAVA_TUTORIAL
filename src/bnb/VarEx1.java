package bnb;

import java.util.Scanner;

public class VarEx1 {
	
	public void cals() {
		
		int year = 0;
		int age = 14;
		
		System.out.println("year: " + year);
		System.out.println("age: " + age);
		
		year = age + 2000;
		age = age + 1;
		System.out.println("year: " + year);
		System.out.println("age: " + age);
		
		//////////////////////////////////////
		
		int x = 10;
		int y = 20;
		int tmp = 0;
		System.out.println("x : " + x + " y: " + y);
		
		// 목적이 xy 값을 바꿔줌 
		tmp = x; //tmp에 x 넣음 
		x = y; 
		y = tmp;
		System.out.println("x : " + x + " y: " + y);
		
		///////////////////////////////////////
		
		final double  PI = 3.14d;
		float f = 100f;
		String fuits = new String("apple"); 
		System.out.println("파이는 " + PI + " /    과일은? " + fuits );
		
		boolean flag; // 기본값은 false String은 null
		
		char ch = 'A'; 
		System.out.println("아스키" + ch);
		char ch1= 90;
		System.out.println("아스키" + ch1);
		
		String a = "A" + "B";
		System.out.println("Stirng : " + a);
		
		int i = 7;
		// (a+i) + i //// (i+i) + a   string + int = 자동형변환 결국 문자열
		System.out.println("String + i : " + a + i + i);
		System.out.println("String + i : " + i + i + a );
		System.out.println("i : " + (i*i) + "" );
		
		///// string 자르기 // tokenizer // trim //
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입럭해주세요>>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("입력내용 : " + input);
		System.out.println("숫자 : " + num);
		System.out.printf("num : %d%n ", num);
		System.out.println("");
		
		//////
		double d = 85.4;
		int score = (int) d;
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		
		int aa=10;
		byte bb=(byte)aa;
		System.out.printf("[int->byte] i=%d -> b=%d%n", aa,bb);
		
		byte cc=-2;
		aa=(int)cc;
		System.out.printf("[int->byte] i=%d -> b=%d%n", cc,aa);
		System.out.println(Integer.toBinaryString(aa));
		
		
		
		
	}
	
	public static void main(String[] args) {
		
			VarEx1 varEx1 = new VarEx1();
			varEx1.cals();
		
	}
	
}
