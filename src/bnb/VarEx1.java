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
		
		// ������ xy ���� �ٲ��� 
		tmp = x; //tmp�� x ���� 
		x = y; 
		y = tmp;
		System.out.println("x : " + x + " y: " + y);
		
		///////////////////////////////////////
		
		final double  PI = 3.14d;
		float f = 100f;
		String fuits = new String("apple"); 
		System.out.println("���̴� " + PI + " /    ������? " + fuits );
		
		boolean flag; // �⺻���� false String�� null
		
		char ch = 'A'; 
		System.out.println("�ƽ�Ű" + ch);
		char ch1= 90;
		System.out.println("�ƽ�Ű" + ch1);
		
		String a = "A" + "B";
		System.out.println("Stirng : " + a);
		
		int i = 7;
		// (a+i) + i //// (i+i) + a   string + int = �ڵ�����ȯ �ᱹ ���ڿ�
		System.out.println("String + i : " + a + i + i);
		System.out.println("String + i : " + i + i + a );
		System.out.println("i : " + (i*i) + "" );
		
		///// string �ڸ��� // tokenizer // trim //
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���>>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("�Է³��� : " + input);
		System.out.println("���� : " + num);
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
