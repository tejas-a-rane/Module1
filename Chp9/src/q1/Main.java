package q1;

class A {
	void A() {

	}

}

interface B {
	void B();
}

abstract class C {
	abstract void Ci();
}

public class Main {
public static void main(String[] args) {
	A a = new A() {
		@Override
		void A() {
			// TODO Auto-generated method stub
			System.out.println("inner A");
		}
	};
	a.A();
	B b = new B() {
		
		@Override
		public void B() {
			System.out.println("inner B");
			
		}
	};
	b.B();
	
	C c = new C() {
		
		@Override
		void Ci() {
			System.out.println("inner c");
			
		}
	};
	c.Ci();
}
}
