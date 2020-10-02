package EncapsulationConcept;

public class BreakInWhileLoop {

	public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("printing the array elements");
	for(int j:num)
	{
		System.out.println(j);
	}
	System.out.println("-----------------------------------");
	int i=0;
	while(i<10)
	{
		if(num[i]==5) {
			i++;
			continue;
		}
		else if(num[i]==8) {
			break;
		}
		System.out.println(num[i]);
		i++;
		
	}
}
}
