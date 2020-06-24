package arrayspractice;

public class ArraysDeclaration {

	public static void main(String[] args) {
		
		double[] salary = new double[5];
		salary[0] = 10000;
		salary[1] = 20000;
		salary[2] = 30000;
		salary[3] = 40000;
		salary[4] = 50000;
		
		salary[5] = 6000;
		salary[6] = 7000;
		
		for(int i=0;i<=6;i++)
			System.out.println(salary[i]);
		
	}

}
