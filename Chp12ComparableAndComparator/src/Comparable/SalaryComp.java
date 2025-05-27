package Comparable;

import java.util.Comparator;

public class SalaryComp implements Comparator<Emp> {
	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.salary>o2.salary) {
			return 1;
		}
		else if(o1.salary<o2.salary) {
			return -1;
		}
		return 0;
		
	}

}
