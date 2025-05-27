package Q2;

class A {
	A meth() {
		System.out.println("in a");
		return this;
	}
}

class B extends A {
	@Override
	B meth() {
		// TODO Auto-generated method stub
		System.out.println("in b");
		return this;
	}
}

public class Main {
	public static void main(String[] args) {
	
		A a = new A();
		a.meth();
		B b = new B();
		b.meth();
		
	}

}
