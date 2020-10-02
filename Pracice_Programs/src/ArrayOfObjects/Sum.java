package ArrayOfObjects;

public class Sum {
	int a;
	int b;
	
	Sum(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		Sum obj1=new Sum(10,20);
		Sum obj2=new Sum(15,36);
		Sum obj3=new Sum(200,532);
		Sum[] arr=new Sum[3];
		
		for (int i=0;i<arr.length;i++)
		{
			
			arr[i]=obj&i;
		}
		/*arr[0]=obj1;
		arr[1]=obj2;
		arr[2]=obj3;*/
		
		for(Sum c:arr)
		{
			System.out.println("The valus Of a and b is :"+c.a+" and "+c.b);
		}
		
	}

}
