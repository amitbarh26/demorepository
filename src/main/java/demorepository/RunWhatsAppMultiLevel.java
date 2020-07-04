package demorepository;
class WhatsAppVOne
{
	public void onlytextFeature()
	{
		System.out.println("only text feature is there");
	}
}
class WhatsAppVTwo extends WhatsAppVOne
{
	public void multimediaFeature()
	{
		System.out.println("multimedia feature is there");
	}
}
class WhatsAppVThree extends WhatsAppVTwo
{
	public void calling()
	{
		System.out.println("calling feature is also available");
	}
}
public class RunWhatsAppMultiLevel
{
	public static void main(String args[])
	{
		WhatsAppVOne v1=new WhatsAppVOne();
		v1.onlytextFeature();
		WhatsAppVTwo v2=new WhatsAppVTwo();
		v2.onlytextFeature();
		v2.multimediaFeature();
		WhatsAppVThree v3=new WhatsAppVThree();
		v3.onlytextFeature();
		v3.multimediaFeature();
		v3.calling();
	}
}
