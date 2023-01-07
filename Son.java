package Inheritance;

public class Son extends Father {
 
	int w = 20;

	public void son() {
		System.out.println("Son Class");
	}
	
	public static void main(String[] args) {
		Son sons = new Son();
		sons.family();
		System.out.println("GrandPa age is "+sons.p);
		System.out.println("----");
		sons.father01();
		System.out.println("Father age is "+ sons.b);
		System.out.println("----");
		sons.son();
		System.out.println("Son age is "+ sons.w);
	}
}
