package _13_ArrayList;

import java.util.ArrayList;

public class ListSample {
	ArrayList<String> a = new ArrayList<>();	// 리스트선언 / String 타입
	public ListSample() {
		System.out.println("리스트의 길이"+a.size());
		a.add("apple");
		System.out.println("리스트의 길이"+a.size());
		a.add("banana");
		a.add("abc초콜렛");
		a.add("샌드");
		System.out.println("리스트의 길이"+a.size());
		System.out.println(a.get(1));
		
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("=======================");
		for(int i=0;i<a.size();i++) {
			if(a.get(i).charAt(0)!='a'){
				System.out.println(a.get(i));
				
			}
		}
		/*
		 * a.add(1,"오징어")	특정 인덱스 위치에 추가 
		 * a.set(1,"쭈꾸미")  특정 인덱스 수정
		 * a.remove(3) 		특정 인덱스 삭제
		 * a.clear()			전체 리스트 삭제
		 */
		
	}
}
