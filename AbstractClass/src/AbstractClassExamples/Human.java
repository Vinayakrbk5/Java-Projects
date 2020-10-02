package AbstractClassExamples;

public class Human extends Carnivorus {
	public void sound()
	{
		System.out.println("The Human can speak");
	}
	public void move()
	{
		System.out.println("The Human  is "+Carnivorus.corn()+" and it can walk and speak");
	}


}
