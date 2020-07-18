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
	    dto.setTitle("제목");
	    dto.setCreatedate("2020-07-14");
	    dto.setContent("내용내용");
	    
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
	        
	        System.out.println(list.size() + "하하하하하하하하하하하하 ");
	        
	    }catch (Exception e){
	        e.printStackTrace();
	    }

	}// method end 
	
	
	
	
//	public static void main(String ar[]){
//	    DTO dto=new DTO();
//	    dto.setSeq(1);
//	    dto.setTitle("제목");
//	    dto.setCreatedate(new Date());
//	    dto.setContent("내용내용");
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
//	출처: https://hellogk.tistory.com/11 [IT Code Storage]
	
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
			System.out.println("1과 100사이의 정수를 입력하세요 > ");
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
		}while(input != answer);
		System.out.println("정답입니다");
	}
	
	
	public static void main(String[] args) {
		
		WhileFor whileFor = new WhileFor();
		whileFor.test();
	}
}
