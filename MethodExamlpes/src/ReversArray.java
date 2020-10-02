
public class ReversArray {

	public static void main(String[] args) {
		char namearr[]= {'B','A','N','G','L','O','R','E'};
		//char revarr[]=new char[namearr.length];
		
		 revarray(namearr);
		 System.out.println();
		revrsearr(namearr);
	}
	public static void revarray(char printarr[])
	{
		for(int i=0; i<printarr.length;i++)
		{
			System.out.print(printarr[i]);
		}
	}
	public static void revrsearr(char printarr[])
	{
		//char revarr[]=new char[printarr.length];
		int length=printarr.length;
		for (int i=printarr.length-1;i>=0;i--)
		{
			System.out.print(printarr[i]);
			}
	} 

}
