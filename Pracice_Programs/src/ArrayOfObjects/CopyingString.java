package ArrayOfObjects;

public class CopyingString {

	public static void main(String[] args) {
		//String name1="India",name2="Karnataka",name3="Bangalore";
		String x;
		String arr[]=new String[3];
		for(int i=0;i<arr.length;i++)
		{
			x="name"+i;
			arr[i]=x;
		}
		System.out.println("Array elemnts are :");
		for(String c:arr)
		{
			System.out.print(c+", ");
		}
	}
}
