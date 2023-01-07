package Inheritance;

public class Father extends GrandPa{
	
	  int b = 50;
	public void father01(){
		System.out.println("Father Class");
	}
		public static void main (String[]args) {
			Father multi = new Father();
			multi.family();
			System.out.println("GrandPa age is " + multi.p);
			
			multi.father01();
			System.out.println("Father age is " + multi.b);
		}
	
}
