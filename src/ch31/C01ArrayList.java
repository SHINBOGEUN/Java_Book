package ch31;

import java.util.*;

public class C01ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("Java");
		list.add("JDBC");
		list.add("OracleDB");
		list.add("JSP");
		list.add("Servlet");
		list.add("SpringFrameWork");
		list.add("Java");
		
		System.out.println("총 개체수 : " + list.size());
		
		
		System.out.println("Idx 2번째 문자열 : " + list.get(6));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list %d번째 =  %s\n",i, list.get(i));
		}
		System.out.println();
		
		//개량 포문
		for(String tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("삭제 후 확인 -----------------");
		// 인덱스 넣어 삭제
		list.remove(0);
		// 삭제 후 확인!!
		for(String tmp : list) {
			System.out.println(tmp);
		}
		// 값을 넣어 삭제
		System.out.println();
		list.remove("Java");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		
		System.out.println(list.toString());
		
		//전체 삭제
		list.clear();
		System.out.println(list.toString());
	}
}
