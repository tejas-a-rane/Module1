package q5;

public class Main {
public static void main(String[] args) {
		
	try {
		int arr[] = new int[5];
		String t = null;
		System.out.println(t.length());
		arr[10] = 10/2;
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}catch (ArithmeticException e) {
		System.out.println(e);
	}catch (NullPointerException e) {
		System.out.println(e);
	}catch (Exception e) {
		System.out.println(e);
	}
	
}
}
