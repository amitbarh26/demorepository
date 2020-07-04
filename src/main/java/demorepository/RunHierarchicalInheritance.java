package demorepository;
class Father
{
	String home="Devkunj";
	String bike="Bajaj Dominar";
	String cash="30Lacs";
	String insurance="10Lacs";
	String degree="B.sc";
	public void fathersProperty()
	{
		System.out.println("father has "+" home="+home+" bike="+bike+" cash="+cash+" insurance="+insurance+" degree="+degree);
	}
}
class Brother extends Father
{
	String job="government work";
	public void brothersProperty()
	{
		System.out.println("brother has "+"home="+home+" bike="+bike+" cash="+cash+" insurance="+insurance+" degree="+degree+" job="+job);
	}
}
class MySelf extends Father
{
	String sence="common sence";
	public void myProperty()
	{
		System.out.println("i have "+"home="+home+" bike="+bike+" cash="+cash+" insurance="+insurance+" degree="+degree+" sence="+sence);
	}
}
public class RunHierarchicalInheritance
{

	public static void main(String[] args)
	{
		Father f=new Father();
		f.fathersProperty();
		Brother b=new Brother();
		b.brothersProperty();
		MySelf ms=new MySelf();
		ms.myProperty();
	}

}
