package dayTwo;

public class OverridingNew extends Overriding{
	 @Override
	public void phnNo() {
		//super.phnNo();
		System.out.println("9789919143");
	}
public static void main(String[] args) {
	OverridingNew o = new OverridingNew();
	o.aadharcardNo();
	o.phnNo();
}
}
