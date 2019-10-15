package Nov10;

import java.util.Random;

public class ArrayEx {
	public static void main(String[] args) {
		double originalArray[] = new double[20];
		double modifiedArray[] = new double[20];

		Random r = new Random();
		double sum = 0;
		for (int i = 0; i < originalArray.length; i++) {
			originalArray[i] = r.nextInt(100) + 1;
			sum += originalArray[i];
		}
		double avg = sum / 20;
		for (int i = 0; i < originalArray.length; i++) {
			if (originalArray[i] < avg)
				modifiedArray[i] = avg;
			else
				modifiedArray[i] = originalArray[i];

		}
		System.out.println("Oroginal\tModified");
		for (int i = 0; i < 20; i++)
			System.out.println(originalArray[i] + "\t\t" + modifiedArray[i]);
	}
}
