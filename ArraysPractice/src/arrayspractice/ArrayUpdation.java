package arrayspractice;

public class ArrayUpdation {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int n=5;
		int pos = 0;
		int ele = 44;
		
		System.out.println("Array Before Updation");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
		if(pos<1 || pos>n){
			System.out.println("Element cannot be updated.Position not valid.");
			return;
		}
			
		arr[pos-1] = ele;
		
		System.out.println("Array After  Updation");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
