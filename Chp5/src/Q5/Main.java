package Q5;
class A{
	int a =10;
	public A() {
		System.out.println("super constructor");
	}
	void meth() {
		System.out.println("this is A");
	}
}
class B extends A{
	
	public B() {
		super();
	}
	void meth2() {
		super.meth();
		System.out.println("Inside B");
		System.out.println("super variable "+super.a);
	}
}
public class Main {
public static void main(String[] args) {
	B b = new B();
	b.meth2();
}
}
