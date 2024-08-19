package _05_2for;

public class _0819_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5. int[] a ={34,55,23,56,34,45,34};
//		40보다 큰 수는 모두 몇개인가?
		 int[] a ={34,55,23,56,34,45,34};
		 int cnt=0;
		 
		for(int i=0;i< a.length;i++) {
			if(a[i]>40) {
				cnt++;
			}
		}
		System.out.println("40보다 큰수 "+cnt+"개");
		
		
		
		
		
	}

}
