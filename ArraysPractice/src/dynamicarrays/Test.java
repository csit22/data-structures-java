package dynamicarrays;

public class Test {

	public static void main(String[] args) {
		DynamicArray dynamicArray = new DynamicArray();
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(10);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(20);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(30);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(40);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(50);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
	//----------------------------------------------------	
		dynamicArray.add(60);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
	
	//--------------------------------------------------------------
		dynamicArray.add(70);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(80);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(90);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
		dynamicArray.add(100);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
	//--------------------------------------------------------------------------------------	
		dynamicArray.add(110);
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
	
	//--------------------------------------------------------------------------------------
		dynamicArray.remove();
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
		
	//---------------------------------------------------------------------------------------	
		
		for(int i=1;i<=5;i++){
			dynamicArray.remove();
			System.out.println("capacity" + dynamicArray.getCapacity());
			System.out.println("size " + dynamicArray.getSize());
		}

	//-------------------------------------------------------------------------------------------
		dynamicArray.printElementData();
		dynamicArray.removeAt(3);
		System.out.println("After removal");
		dynamicArray.printElementData();;
		
//-------------------------------------------------------------------------------------
		
		dynamicArray.addAt(3,33);
		dynamicArray.addAt(5,55);
		dynamicArray.addAt(1,66);
		
		System.out.println("After adding");
		dynamicArray.printElementData();
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());
//---------------------------------------------------------------------------------------	
		dynamicArray.addAt(1,43);
		dynamicArray.addAt(2,75);
		dynamicArray.addAt(3,88);
		dynamicArray.addAt(4,99);
		dynamicArray.addAt(5,65);
		dynamicArray.addAt(6,37);
		System.out.println("After adding");
		dynamicArray.printElementData();
		System.out.println("capacity" + dynamicArray.getCapacity());
		System.out.println("size " + dynamicArray.getSize());	
	}

}
