package Inheritance;

public class YoungerSon extends FatherHierarchical {
	
	static int t = 25;
	public void younger() {
		System.out.println("Younger Class");
		
	}
	public static void main (String[]args) {
		YoungerSon youngerson = new YoungerSon();
		youngerson.fatherHi();
		System.out.println("Father age is "+m);
		System.out.println("----");
		youngerson.younger();
	System.out.println("Yonger Son Age is " +t);
	}

}
