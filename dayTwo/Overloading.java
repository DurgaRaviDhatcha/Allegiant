package dayTwo;
	public class Overloading {
		public String EmployeeDetails1(String name, int age) {
         //String Name ="Durga";
        // String Age = "22";
         return (name + age);
         }	
		public double EmployeeDetails2(double a, double h, double w){
//			double age = 22.5;
//			double height = 5.1;
//			double weight = 40.1;
        return (a + h + w);
		}
		public static void main(String[] args) {
			Overloading o =new Overloading();
			System.out.println(o.EmployeeDetails1("Durga" , 22));
			System.out.println(o.EmployeeDetails2(22.5, 5.1, 40.1));
						
		}
		private void add() {
			// TODO Auto-generated method stub

		}
	}
