package Nov9;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class TestAES {
	public static void main(String[] args) throws Exception {
		String origianl = "Test@123";
		String key = "123&6122";
		String str = AESAlgo.encryptprocess(origianl, key);
		String dec = AESAlgo.decryptprocess(str, key);
		System.out.println("Original : " + origianl);
		System.out.println("Encrypted : " + str);
		System.out.println("Decrypted : " + dec);
	}
}

class AESAlgo {

	private static SecretKeySpec secretEncryptionKey;

	private static byte[] key;

	// Get cipher/ secret key

	public static void setCipherKey(String mysecretKey) throws Exception

	{

		MessageDigest msg = null;

		key = mysecretKey.getBytes("UTF-8");

		msg = MessageDigest.getInstance("SHA-1");

		key = msg.digest(key);

		key = Arrays.copyOf(key, 16);

		secretEncryptionKey = new SecretKeySpec(key, "AES");

	}

	// Encryption method

	public static String encryptprocess(String stringEncrypt, String secretkey) throws Exception

	{

		setCipherKey(secretkey);

		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");

		cipher.init(Cipher.ENCRYPT_MODE, secretEncryptionKey);

		return Base64.getEncoder().encodeToString(cipher.doFinal(stringEncrypt.getBytes("UTF-8")));

	}

	// Decryption method

	public static String decryptprocess(String stringDecrypt, String secretkey) throws Exception

	{

		setCipherKey(secretkey);

		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");

		cipher.init(Cipher.DECRYPT_MODE, secretEncryptionKey);

		return new String(cipher.doFinal(Base64.getDecoder().decode(stringDecrypt)));

	}
}