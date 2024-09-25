package _12_class_sample;

public class MydogList {
	
	Dog[] dogList = new Dog[5];
	
	public MydogList() {
		System.out.println("--강아지 관리 --");
		System.out.println(dogList[0]);
		if(dogList[0]!=null) {
			System.out.println(dogList[0].name);
		}
		
		dogList[1]= new Dog();
		System.out.println(dogList[1]);
		dogList[2]=dogList[1];
		System.out.println(dogList[2]);
		
		dogList[3]=new Dog();
		System.out.println(dogList[3]);
		
		Dog dd = new Dog();
		dogList[4]=dd;
		System.out.println(dd);
		System.out.println(dogList[4]);
	
		dogList[1].name = "abc";
		System.out.println(dogList[1].name);
		System.out.println(dogList[2].name);
		System.out.println(dogList[3].name);
		
		System.out.println("===========");
		
		for(int i=0;i<5;i++) {
			if(dogList[i]!=null) {
				System.out.println(dogList[i].name);
			}
		}
		// 강아지 검색
		String s= "땡칠이";
		for(int i=0;i<5;i++) {
			if(dogList[i]!=null) {
				if(dogList[i].name.equals(s)) {
					System.out.println("찾음");
					break;
				}
			}
		}
		
		
		
		
	}

}
