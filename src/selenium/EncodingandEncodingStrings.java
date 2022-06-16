package selenium;

import java.util.Base64;

public class EncodingandEncodingStrings {

	public static void main(String[] args) {
		
		String encrptData= "Password";
		byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
		System.out.println("encodedBytes --------->" + new String(encodedBytes));

		
		String decrptData  ="UGFzc3dvcmQ=";
		byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
		System.out.println("decodedBytes --------->" + new String(decodeBytes));
		
	}

}
