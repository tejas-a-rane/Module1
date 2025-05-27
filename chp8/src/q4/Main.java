package q4;
class AgeException extends Exception{
	public AgeException(String s) {
		super(s);
	}
}
class Vote {
	void meth(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("ineligible");
		}
		else {
			System.out.println("You are eligible");
		}
	}
}
public class Main {
public static void main(String[] args) {
	Vote vote = new Vote();
	try {
		vote.meth(15);
	} catch (AgeException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}
}
