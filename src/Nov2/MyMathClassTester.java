package Nov2;

import java.util.ArrayList;

class MyMathClass {
	public double average(ArrayList list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			double d = (double) list.get(i);
			sum = sum + d;
		}
		return sum / list.size();
	}

	public double standardDeviation(ArrayList list) {
		double avg = average(list);
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			double d =  (double) list.get(i);
			sum = sum + (avg - d);
		}
		sum = sum / list.size();
		return Math.sqrt(sum);
	}
}

public class MyMathClassTester {
	public static void main(String[] args) {
		MyMathClass m1 = new MyMathClass();
		ArrayList list1 = new ArrayList ();
		list1.add(10);
		list1.add(16);
		list1.add(8);
		list1.add(14);
		list1.add(23);
		list1.add(17);
		
		ArrayList list2 = new ArrayList ();
		list2.add(18.0);
		list2.add(22.0);
		list2.add(29.0);
		list2.add(13.0);
		list2.add(21.0);
		list2.add(32.0);
		
		ArrayList list3 = new ArrayList();
		list3.add(new Long(11));
		list3.add(new Long(29));
		list3.add(new Long(59));
		list3.add(new Long(12));
		list3.add(new Long(11));
		list3.add(new Long(13));
		
		System.out.println("Average : "+m1.average(list1));
		System.out.println("Standard Deviation : "+m1.standardDeviation(list1));
		
		
		
		
		
	}
}
