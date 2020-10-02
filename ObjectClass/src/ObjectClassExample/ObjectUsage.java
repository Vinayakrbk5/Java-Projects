package ObjectClassExample;

public class ObjectUsage {
	public static void main(String[] args) {
		Object s=getObject("Bus");//   Object s;   s.getObject("Bus");
		Object s1=getObject("Sound");
		Bus b=new Bus();
		System.out.println(s);
		//System.out.println(s1);
		
	}
	public static Object getObject(String str)
	{
		if(str.equals("Sound"))
		{
			return new Sound();
		}
		else if(str.equals("Bus"))
		{
			return new Bus();
		}
		else
		{
			return null;
		}
				
	}

}
