package dayTwo;

public class StudentDetails implements Bharathdass {

	@Override
	public void studentDetails() {
		String name = "Durga";
		int c = 12;
		char s = 'A';
		String DOB = "29-08-1999";
		String BG = "B+ve";
		System.out.println("   *** Student Details  ***");
		System.out.println("Name:" +name);
		System.out.println("Class:" +c);
		System.out.println("Section:" + s);
		System.out.println("DOB:" +DOB);
		System.out.println("Blood Group:" +BG);	
	}

	@Override
	public void marks() {
		String eng = "95";
		  String tam = "100";
		  String mat = "100";
		  String comp = "100";
		  String phy = "100";
		  String che = "100";
		  
		  System.out.println("     Half yearly exam marks  ");
		  System.out.println("Tamil:" +tam);
		  System.out.println("English:" +eng);
		  System.out.println("Maths:" +mat);
		  System.out.println("Computer:" +comp);
		  System.out.println("Physics:" +phy);
		  System.out.println("Chemistry:" +che);
	}
	public static void main(String[] args) {
		StudentDetails s1= new StudentDetails();
		s1.studentDetails();
		s1.marks();
	}
}


