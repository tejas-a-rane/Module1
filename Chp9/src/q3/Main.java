package q3;
class Outter{
	private int a =10;
	class Inner{
		void meth() {
			System.out.println("inner" + a);
		}
	}
}
public class Main {
public static void main(String[] args) {
	Outter outter = new Outter();
	Outter.Inner inner = outter.new Inner();
	inner.meth();
}
}
