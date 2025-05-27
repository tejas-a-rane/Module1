package pack1;

public class A {
	private int a= 10;
	protected int b=20;
	public int c = 30;
	int d = 40;
}

class B {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}

class C extends A {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}