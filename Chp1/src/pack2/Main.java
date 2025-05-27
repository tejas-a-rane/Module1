package pack2;

import pack1.A;

class D extends pack1.A{
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.c);
		System.out.println(d.b);
	}
}

class E {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.c);
	}
}
