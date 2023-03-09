package com.WellBeing.admin;

public class stringclass {

	public static void main(String[] args) {
		//String Mytring="UHID is: COH/138";
		String myString = "Hello World! This is a test.";

		//String str = Mytring.substring(9);
				//System.out.println(str);
				//String[] stt = Mytring.split(" ");
				
				//System.out.println(stt[2]);
				String[] parts = myString.split("World!|This");
				String extractedText = parts[1];
				System.out.println(extractedText);
	}

}
