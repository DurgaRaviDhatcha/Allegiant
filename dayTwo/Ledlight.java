package dayTwo;

	public class Ledlight extends Bulb{
		 
		public void ledLightColor() {
			System.out.println("Blue");
		}
		
		public static void main(String[] args) {
			Ledlight l = new Ledlight();
			l.lampType();
			l.lampBrand();
			l.lampPrice();
			l.bulbVoltage();
			l.ledLightColor();
		}
	}
