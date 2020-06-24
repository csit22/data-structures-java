package arrayspractice;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		
     int[] arr = new int[10];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int ele = 44;
		int n = 5;
		
			
		System.out.println("Array : ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
		for(int i=0;i<n;i++){
			if(arr[i]==ele){
				System.out.println("Element found  at pos " + (i+1));
				return;
			}
		}
			
		System.out.println("Element not found.");
	}

}
