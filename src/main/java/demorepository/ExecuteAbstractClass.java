package demorepository;

abstract class AbstractClass 
{
	int x=10;
	int y=20;
	abstract public void add();
}
class Concrete extends AbstractClass
{

	public void add()
	{
		int sum=x+y;
		System.out.println("sum="+sum);	
	}
	
}
public class ExecuteAbstractClass
{
	public static void main(String[] args)
	{
		AbstractClass ace=new Concrete();
		ace.add();
		Concrete cnc=new Concrete();
		cnc.add();
	}
}