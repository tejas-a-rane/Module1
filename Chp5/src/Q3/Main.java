package Q3;

class RBI {
	double rateOfInterest() {
		return 0;
	}
}

class SBI extends RBI {
	@Override
	double rateOfInterest() {
		// TODO Auto-generated method stub
		return 8.1;
	}
}

class Yes extends RBI {
	@Override
	double rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.1;
	}
}

class HDFC extends RBI {
	@Override
	double rateOfInterest() {
		// TODO Auto-generated method stub
		return 10.1;
	}
}

public class Main {
public static void main(String[] args) {
	RBI r;
	r= new HDFC();
	System.out.println(r.rateOfInterest());
	r= new SBI();
	System.out.println(r.rateOfInterest());
	r= new Yes();
	System.out.println(r.rateOfInterest());
	
}
}
