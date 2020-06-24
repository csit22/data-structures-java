package arrayspractice;

public class ArrayDeletion {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int n = 5;
		int pos = 6;	
		
		System.out.println("Array Before Deletion");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
		if (pos < 1 || pos > n) {
			System.out.println("Element cannot be deleted.Position not valid.");
			return;
		}
		//i=2, i=4
		
		for(int i=pos-1;i<n-1;i++)
			arr[i] = arr[i+1];  
		
		//arr[2]=arr[3]
		//arr[3]=arr[4]
		n--;
		
		System.out.println("Array After  Deletion");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
