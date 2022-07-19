package dayTwo;
public class Area {
	public int rectangle() {
	int length = 20;
	int width = 10;
	return length * width;
	}
		public float triangle() {
		float length = 20.12f;
		float breadth = 9.15f;
		return (float) (0.5 * length * breadth);
		}
	public double cuboid() {
			double length = 20;
			double breadth = 15;
			double height = 30;
			return length * breadth * height;

	}
		public static void main(String[] args) {
			Area a = new Area();
			System.out.println("Area of rectangle:" + a.rectangle());
			System.out.println("Area of  triangle:" + a.triangle());
			System.out.println("Volume of cuboid:" + a.cuboid());
		}
	}

