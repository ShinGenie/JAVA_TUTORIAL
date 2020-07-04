package bnb.java.genie;

import bnb.VarEx1;


public class Operater {
	
	//단항 > 이항 > 삼항 > 대입
	
	// <<, >>, >>>는 덧셈연산자보다 우선순위가 낮다
	// || 는 && 보다 우선순위가 낮다
	// 증감연산자 
	// 전위 ++i 값이 참조되기 전에 증가시킨다
	// 후위 i++ 값이 참조된 후에 증가시킨다
	public static void main(String[] args) {
		int x=1;
		int y=5;
		int result = x + y * 6;
		System.out.println("result  : "  + result);
		
		
	
		
		for(int j=0; j<5; ++j) {
			System.out.println(j);
		}
		System.out.println("");
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		
		
		int a=5, b=0;
		b=a++; // 후위는 값이 참조된 후에 증가 b = 0 + 1
		System.out.println( a +" / " + b ); // 
		
		
		a=5; b=0;
		b=++a; // 전위는 값이 참조된 후 증가  b = 5 + 1 ;
		System.out.println( a +" / " + b );
		System.out.println();
		
		// 부호연산자(+,-)와 논리부정연산자(!)
		
		
		
		char c1 = 'a';
		char c3 = c1++;	
		char c2 = ++c1; //  b
		System.out.println(c2);
		System.out.println(c3);
		
		int i = 'B'-'A';
		System.out.println(i);
		
		//반올림
		long num = Math.round(3.64195);
		System.out.println(num);
		//부호기호 뺌
		double num1 = Math.abs(-1.9333);
		System.out.println(num1);
		int num2 = (int)(Math.random()*100);
		System.out.println(num2);
		double num3 = Math.random()*100;
		System.out.println(num3);
		
		 byte aa = 10;
		 byte bb = 30;
		 byte cc  = (byte) (aa + bb); // 형변환
		 System.out.println(cc);
		 
		int aaa = 1000000;
		int bbb = 2000000;
		long bbbL = 2000000L;
		
		long ccc = aaa * bbb;
		long cccL = aaa * bbbL;
		long cccM = (long)aaa * bbb;
		System.out.println(ccc);
		System.out.println(cccL);
		System.out.println(cccM);
		
		
		int result1 = aaa * aaa / aaa;    // 쓰레기값 나옴 
		System.out.println(result1);
		long result2 = (long)aaa * (aaa / aaa);    // 쓰레기값 나옴 
		System.out.println(result2);
		
		
		char c11 = 'a';
		char c12 = c11;
		char c13 =  ' '; /// 공백으로 초기화 -----!!
		
		int ii = c11 + 1;
		c13 = (char)(c11 + 1);
		c13++; // c11을 두번올림 후위연산
		c12++;  // 
		System.out.println(ii + " / " + c12 + " / " + c13);
		
		
		
		 
	}
	
}
