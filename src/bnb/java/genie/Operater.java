package bnb.java.genie;

import bnb.VarEx1;


public class Operater {
	
	//���� > ���� > ���� > ����
	
	// <<, >>, >>>�� ���������ں��� �켱������ ����
	// || �� && ���� �켱������ ����
	// ���������� 
	// ���� ++i ���� �����Ǳ� ���� ������Ų��
	// ���� i++ ���� ������ �Ŀ� ������Ų��
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
		b=a++; // ������ ���� ������ �Ŀ� ���� b = 0 + 1
		System.out.println( a +" / " + b ); // 
		
		
		a=5; b=0;
		b=++a; // ������ ���� ������ �� ����  b = 5 + 1 ;
		System.out.println( a +" / " + b );
		System.out.println();
		
		// ��ȣ������(+,-)�� ������������(!)
		
		
		
		char c1 = 'a';
		char c3 = c1++;	
		char c2 = ++c1; //  b
		System.out.println(c2);
		System.out.println(c3);
		
		int i = 'B'-'A';
		System.out.println(i);
		
		//�ݿø�
		long num = Math.round(3.64195);
		System.out.println(num);
		//��ȣ��ȣ ��
		double num1 = Math.abs(-1.9333);
		System.out.println(num1);
		int num2 = (int)(Math.random()*100);
		System.out.println(num2);
		double num3 = Math.random()*100;
		System.out.println(num3);
		
		 byte aa = 10;
		 byte bb = 30;
		 byte cc  = (byte) (aa + bb); // ����ȯ
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
		
		
		int result1 = aaa * aaa / aaa;    // �����Ⱚ ���� 
		System.out.println(result1);
		long result2 = (long)aaa * (aaa / aaa);    // �����Ⱚ ���� 
		System.out.println(result2);
		
		
		char c11 = 'a';
		char c12 = c11;
		char c13 =  ' '; /// �������� �ʱ�ȭ -----!!
		
		int ii = c11 + 1;
		c13 = (char)(c11 + 1);
		c13++; // c11�� �ι��ø� ��������
		c12++;  // 
		System.out.println(ii + " / " + c12 + " / " + c13);
		
		
		
		 
	}
	
}
