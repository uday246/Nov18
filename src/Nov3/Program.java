package Nov3;

public class Program {

	static String extractKey(String currentKey)

	{

		String roundKey = currentKey.substring(0, 32);

		return roundKey;

	}

	static String exClusiveOR(String text, String roundKey){
		int x;
		String ctext = "";

		int[] temp = new int[32];

		for (int i = 0; i < 32; i++)

		{

			x = text.charAt(i) ^ roundKey.charAt(i);// taking first with first

			ctext = ctext + x;

		}

		return ctext;

	}

	static String enPbox(String text, int[] Pbox)

	{

		String ctext = "";

		for (int i = 0; i < 32; i++)

			ctext = ctext + text.charAt(Pbox[i]);

		return ctext;

	}

	static String FirstFour(String ctext)

	{

		String text = "";

		for (int i = 0; i < 4; i++)

			text = text.charAt(i) + ctext;

		return ctext;

	}

	public static void main(String[] args)

	{

		String Key = "011101110111011101110111011101110111";

		String text = "00110011001100110011001100110011";

		String currentKey = Key;

		int[] Pbox = { 0, 16, 29, 12, 1, 17, 8, 28, 2, 18, 15, 21, 3, 19, 27, 30, 4, 10, 9, 13, 5, 31, 25, 26, 6, 22,
				24, 10, 7, 23, 11, 14 };

		String roundKey = extractKey(currentKey);

		System.out.println(roundKey);

		System.out.println("ok");

		String cText = exClusiveOR(text, roundKey);

		System.out.println(cText);

		System.out.println("ok");

		cText = enPbox(cText, Pbox);

		System.out.println(cText);

		System.out.println("ok");

		System.out.println(cText.substring(0, 4));

	}

}
