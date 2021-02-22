package year_2015.days;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day4 extends AbstractDay{
	
	
	public byte[] createMD5(String input) {
		MessageDigest m;
		try {
			m = MessageDigest.getInstance("MD5");
			m.reset();
			m.update(input.getBytes());
			byte[] digest = m.digest();
			
			return digest;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String toHexString(byte[] bytes) {
	    StringBuilder hexString = new StringBuilder();

	    for (int i = 0; i < bytes.length; i++) {
	        String hex = Integer.toHexString(0xFF & bytes[i]);
	        if (hex.length() == 1) {
	            hexString.append('0');
	        }
	        hexString.append(hex);
	    }

	    return hexString.toString();
	}

	public int calculateFirstToFiveZeros(String in) {
		String result;
		String newInput = in;
		int counter = 0;
		do {
			result = toHexString(createMD5(newInput));	//adds the input of previous loop
			newInput = input + counter;
			counter++;									//increase the counter for the next loop
			
		}while(!result.startsWith("00000"));
		return counter - 2;					//needs to be -2 to account for the above
	}
	
	public int calculateFirstToSixZeros(String in) {
		String result;
		String newInput = in;
		int counter = 0;
		do {
			result = toHexString(createMD5(newInput));	//adds the input of previous loop
			newInput = input + counter;
			counter++;									//increase the counter for the next loop
			
		}while(!result.startsWith("000000"));
		return counter - 2;					//needs to be -2 to account for the above
	}
	
	
	@Override
	public void execute(boolean isDebug, boolean isHome) {
		readInput(isDebug, isHome);
		System.out.println(calculateFirstToFiveZeros(input));
		System.out.println(calculateFirstToSixZeros(input));
	}
}
