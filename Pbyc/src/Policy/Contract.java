package Policy;

public interface Contract {
	double calSal(double sal);
	double calSal(double sal,double tax);
	double calSal(double sal,double tax,double bonus);
}
