package q5;

class Outer {
	private int a = 10;
	void meth() {
		final int b = 20;
		class Inner {
			void meth1() {
				System.out.println("inner" + a+" "+b );
			}
		}
		Inner inner = new Inner();
		inner.meth1();
	}
}

public class Main {
public static void main(String[] args) {
	Outer outer = new Outer();
	outer.meth();
}
}
