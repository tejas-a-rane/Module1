package q4;

import q4.Outter.Inner;

class Outter{
	static private int a=10;
	static class Inner{
		static void meth() {
			System.out.println("inner static" + a);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Inner inner = new Outter.Inner();
		inner.meth();
		Inner.meth();
		Outter.Inner.meth();
	}
}
