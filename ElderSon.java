package Inheritance;

public class ElderSon extends FatherHierarchical {

	int N= 30;
	public void elderSon() {
		System.out.println("Elder Son Class");
	}
	public static void main(String[] args) {
		ElderSon elder= new ElderSon();
		elder.fatherHi();
		System.out.println("Father age is "+ m);
		System.out.println("----");
		elder.elderSon();
		System.out.println("Elder Son age is "+elder.N);
	}
}
