package sambaUncleFamily;

import sambaFamily.SambaFather;

public class SambaUncle extends SambaFather
{
	public static void main(String[] args) {
		SambaUncle sf=new SambaUncle();
		sf.atmCard();//public
		sf.roomForRent();//protected in the case of inheritance
	}
}
