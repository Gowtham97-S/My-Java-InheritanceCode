package Inheritance;

public class SiChild extends SiParent{

	int b = 30;

	public void single(int a) {
		System.out.println("Child class");
	}
	public void singleIN() {
		System.out.println("Method overriding");
	}
	public void single(int a,int b) {
		System.out.println("Child class");
	}
	
	public static void main (String []args) {
		SiChild son= new SiChild();
		System.out.println("INHERITANCE CLASS");
		son.singleIN();
		System.out.println("Age of Father is "+ a);
		System.out.println("------");
		son.single(20,4);
		System.out.println("Age of Son is "+ son.b);
		
		
	}
}
