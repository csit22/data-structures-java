package arrayspractice;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int ele = 10;
		int n=5;
			
		System.out.println("Array : ");
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
		int first =0;
		int last = n-1;
		
		while(first<=last){
			int mid = (first+last)/2;
			//System.out.println("mid " + mid);
			if(ele==arr[mid]){
				System.out.println("Element found  at pos " + (mid+1));
				return;
			}
			else if(ele<arr[mid]){
				last = mid-1;
			}else{
				first = mid+1;
			}
		}
		
		System.out.println("Element not found.");
	}

}
