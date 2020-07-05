package sambaFamily;
import sambaFamily.SambaFather;
public class UseSambaProperty
{
	public static void main(String[] args)
	{
		SambaFather sf=new SambaFather();
		//sf.bscDegree();//private data member only accessed within the class
		sf.atmCard();//public data member accessed through out the package
		sf.roomForRent();//protected data member accessed through out the package and also other package during inheritance
		sf.sambaVilla();//default access specifiers-data members accessed only the same package only.
	}
}
