
public class Laptop {
	//laptop features=variables
	String color;
	int weight;
	int generation;
	Laptop(){
		System.out.println("Creating the laptop");
	}
	//functions/behavior=methods
	void Start()
	{
		System.out.println("laptop became on");
	}
	void Running()
	{
		System.out.println("The laptop is running");
	}
	void Shutdown()
	{
		System.out.println("The laptop is shutting down");
	}

	public static void main(String[] args) {
		Laptop Hp=new Laptop();//instantiation
		//features of laptop= variable
		Hp.color="gray";
		Hp.generation=6;
		Hp.weight=15;
		
		System.out.println("The features os the laptop are: ");
		
		System.out.println("The laptop color is : "+Hp.color);
		System.out.println("The laptop generation is : "+Hp.generation);
		System.out.println("The laptop weight is : "+Hp.weight);
		
		System.out.println("---------------------");
		
		System.out.println("The functions of the laptop are :");
		
		Hp.Start();
		Hp.Running();
		Hp.Shutdown();

	}

}
