package q1;

public class Main {
	public static void main(String[] args) {
		String s1 = "tejas";
		System.out.println(s1.length());
		String s2 = " rane";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s2.trim());
		System.out.println(s1.replace("a", "u"));
		String str = "100";
		int i = Integer.valueOf(str);
		System.out.println(i);

		// Wrapper class
		Integer i2 = new Integer(i);
		System.out.println(i2);

		int t = i2.intValue();
		System.out.println(t);

	}
}
