import java.util.*;
class Sorting{
	
	
		public static void main(String... args){
		int a1[]={1,2,4,5,3};
		
		int n = a1.length;
		System.out.println("Before sorting "+ Arrays.toString(a1));
		for (int i=n-1;i>=0;i--){
			int target = a1[i];
			int j = i-1;
			int temp = 0 ;
			while(j>=0 && a1[j]>=target){
				
				temp = a1[j+1]=a1[j];
				a1[j]= a1[j-1];
				a1[j+1]= temp;
				j-- ;
			
			}
		    temp = a1[j+1];
            a1[j+1]= target;
            target = temp ;
			System.out.println( Arrays.toString(a1)+ "target : "+ target);
			
		}
		System.out.println("After sorting "+ Arrays.toString(a1));
		
	}
}