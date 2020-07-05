package sambaUncleFamily;
import sambaFamily.SambaFather;
public class SambaAunty
{
	public static void main(String[] args)
	{
		SambaFather sf=new SambaFather();
		sf.atmCard();//public
		/*sf.bscDegree();private-not accessed in other package
		sf.roomForRent();protected-not accessed in other package -if inheritance condition then accessed
		sf.sambaVilla();default-accessed only within the package */
	}
}
