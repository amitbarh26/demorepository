package demorepository;

class WhatsAppV1
{
	public void onlytextFeature()
	{
		System.out.println("only text feature is there");
	}
}
class WhatsAppV2 extends WhatsAppV1
{
	public void multimediaFeature()
	{
		System.out.println("multimedia feature is there");
	}
}
public class RunWhatsApp
{
	public static void main(String args[])
	{
		WhatsAppV1 v1=new WhatsAppV1();
		v1.onlytextFeature();
		
		WhatsAppV2 v2=new WhatsAppV2();
		v2.onlytextFeature();
		v2.multimediaFeature();
	}
}
