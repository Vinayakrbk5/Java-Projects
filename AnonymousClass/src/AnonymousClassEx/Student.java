package AnonymousClassEx;

public class Student {
	
	public void createclass()
	{
		Employee emp=new Employee()
		{
			public void display()
			{
				System.out.println("This is Bangalore");
			}
		};
		emp.display();
		
		}
	
	}
