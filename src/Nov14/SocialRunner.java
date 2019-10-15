package Nov14;

class Social {
	private String socialNum;
	private int sum;

	public Social() {

	}

	public Social(String msg) {
		socialNum = msg;
		chopAndAdd();
	}

	public void setWord(String w) {
		socialNum = w;
	}

	public void chopAndAdd() {
		String sub = socialNum;
		String temp[] = sub.split("-");
		for (String s : temp) {
			sum += Integer.parseInt(s);
		}
	}

	public String toString() {
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}

public class SocialRunner {
	public static void main(String[] args) {
		Social s = new Social("456-56-234");
		System.out.println(s);
		s = new Social("102-2-12");
		System.out.println(s);
	}
}
