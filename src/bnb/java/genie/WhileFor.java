package bnb.java.genie;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileFor {
	
	public void test() {
		ArrayList<String> list = new ArrayList<String>();
		//list.add(i, value);
		
		DTO dto=new DTO();
	    dto.setSeq("");
	    dto.setTitle("����");
	    dto.setCreatedate("2020-07-14");
	    dto.setContent("���볻��");
	    
	    try{
	        Object obj=dto;
	        for (Field field : obj.getClass().getDeclaredFields()){
	            field.setAccessible(true);
	            Object value=field.get(obj);
				 if(!value.equals("") && value != null){
//					 int i = 0;
//						i++;
					list.add((String)value);
	            System.out.println(field.getName()+":"+value);
				}
	        }
	        
	        System.out.println(list.size() + "������������������������ ");
	        
	    }catch (Exception e){
	        e.printStackTrace();
	    }

	}// method end 
	
	
	
	
//	public static void main(String ar[]){
//	    DTO dto=new DTO();
//	    dto.setSeq(1);
//	    dto.setTitle("����");
//	    dto.setCreatedate(new Date());
//	    dto.setContent("���볻��");
//	    try{
//	        Object obj=dto;
//	        for (Field field : obj.getClass().getDeclaredFields()){
//	            field.setAccessible(true);
//	            Object value=field.get(obj);
				// if(!value.equals("") && value != null){
					// int i = 0;
					//	i++;
				//	List<String> list = new ArrayList<String>();
				//	list.add(i, value);
//	            System.out.println(field.getName()+":"+value);
//				}
//	        }
//	    }catch (Exception e){
//	        e.printStackTrace();
//	    }
//	}
//   
//
//	��ó: https://hellogk.tistory.com/11 [IT Code Storage]
	
	public void countinued() {
		int num = 0;
		int sum = 0;
		
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		
		while(num != 0) {
			sum += sum;
		}
		
		int input = 0;
		int answer = 0;
		answer = (int)(Math.random()*100) + 1;
		Scanner scanner = new Scanner(System.in);
	
		do {
			System.out.println("1�� 100������ ������ �Է��ϼ��� > ");
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
		}while(input != answer);
		System.out.println("�����Դϴ�");
	}
	
	
	public static void main(String[] args) {
		
		WhileFor whileFor = new WhileFor();
		whileFor.test();
	}
}
