package demorepository;
class Demo
{
	public void test()
	{
		System.out.println("method with zero argument");
	}
	public void test(int i)
	{
		System.out.println("method with one int argument"+i);
	}
	public void test(double j)
	{
		System.out.println("method with one double argument"+j);
	}
	public void test(int a,double b)
	{
		System.out.println("method with two different type argument"+a+" "+b);
	}
}
public class RunMethodOverloadingCompileTimePolymorphismEarlyBinding 
{

	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.test(12, 5.23);
		d.test();
		d.test(5);
		d.test(12.56);
	}

}
