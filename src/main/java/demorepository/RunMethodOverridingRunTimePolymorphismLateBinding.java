package demorepository;
class Morning
{
	void wish()
	{
		System.out.println("Hi....good morning");
	}
}
class Evening extends Morning
{
	void wish()
	{
		System.out.println("Hi....good evening");
	}
}
public class RunMethodOverridingRunTimePolymorphismLateBinding 
{
	public static void main(String[] args)
	{
		Morning m1=new Morning();
		m1.wish();
		Evening e1=new Evening();
		e1.wish();
		Morning m=new Evening();
		m.wish();
	}
}
