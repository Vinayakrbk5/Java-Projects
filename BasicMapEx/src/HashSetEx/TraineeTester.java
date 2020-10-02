package HashSetEx;

import java.util.HashSet;

public class TraineeTester {
	public static void main(String[] args) {
		String t1=new String("Vinayak");
		String t2=new String("Vinayak");
		String t3="Vinayak";
		String t4="Vinayak";
		
		System.out.println(t1.equals(t2)); // Comparing values both are same
		System.out.println(t1.equals(t3)); // Comparing values both are same
		System.out.println(t1==t2);  // Comparing addresses  both are different
		System.out.println(t1==t3);  // Comparing addresses both are different
		System.out.println(t3.equals(t4)); // Comparing values  both are same
		System.out.println(t3==t4);        // Comparing addresses both are same
		
		Trainee tr1= new Trainee(2,"Vinayak","WeekEnd4");
		Trainee tr2=new Trainee(2,"Vinayak","WeekEnd");
		System.out.println(tr2.equals(tr1));
		System.out.println(tr2==tr1);
		HashSet<Trainee> train=new HashSet<>();
		train.add(tr1);
		train.add(tr2);
		System.out.println(train);
		
		
	}

}
