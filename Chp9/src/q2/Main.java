package q2;
abstract class A{
	abstract void A();
}
interface B{
	void B();
}
class C{
	void C(A a,B b) {
		a.A();
		b.B();
	}
}
public class Main {
public static void main(String[] args) {
	C c = new C();
	c.C(new A() {
		
		@Override
		void A() {
			System.out.println("inner A");
			
		}
	}, new B() {
		@Override
		public void B() {
			System.out.println("inner B");
			
		}
	});
}
}
