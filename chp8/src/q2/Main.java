package q2;

import java.io.IOException;

class A {
	IOException i = new IOException();

	void A() throws IOException {
		throw i;
	}

}

class B {
	void B() throws IOException {
		A a = new A();
		a.A();
	}
}
class C{
	void C() {
		B b = new B();
		try {
			b.B();	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

public class Main {
	public static void main(String[] args) {
		C c = new C();
		c.C();

	}
}
