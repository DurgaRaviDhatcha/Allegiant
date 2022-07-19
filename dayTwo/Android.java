package dayTwo;

public class Android extends Hierarchy {
	
	public void update() {
    System.out.println("Android has auto update feature");
	}

	public void record() {
    System.out.println("Android has auto recording feature");
	}
	
	public static void main(String[] args) {
		Android a = new Android();
		a.basic();
		a.basic1();
		a.update();
		a.record();
		
	}
}
