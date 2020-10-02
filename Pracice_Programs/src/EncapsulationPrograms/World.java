package EncapsulationPrograms;

public class World {
	  String name="karnataka";   //  second preference of value assignment
	  int noofnations=100;
	  Nation nations;
	
	World()
	{
		name="India";    // first preference of value assignment
		noofnations=198;
		
	}
	/*public void setName(String name)
	{
		this.name=name;
	}*/
	public String getName()
	{
		return name;
	}
	
	/*public void setNoOfNations(int noofnations)
	{
		this.noofnations=noofnations;
	}*/
	public int getNoOfNations()
	{
		return noofnations;
	}

}
