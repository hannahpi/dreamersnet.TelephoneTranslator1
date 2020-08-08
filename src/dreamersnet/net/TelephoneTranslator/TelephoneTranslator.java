package dreamersnet.net.TelephoneTranslator;

public class TelephoneTranslator {
	
	public static void main(String[] args) {
		ReadUserInput readInput = new ReadUserInput();
		String telephoneNumber = readInput.prompt("Please enter the phone number:");
		StringBuilder translatedNumber = new StringBuilder();
		char[] replacement = {'2','2','2',       // A B C   : 2
							  '3','3','3',       // D E F   : 3
							  '4','4','4',       // G H I   : 4
							  '5','5','5',       // J K L   : 5
							  '6','6','6',       // M N O   : 6
							  '7','7','7','7',   // P Q R S : 7
							  '8','8','8',       // T U V   : 8
							  '9','9','9','9'};  // W X Y Z : 9
		
		int letterValue = -1;
		for (char ch : telephoneNumber.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				ch = Character.toUpperCase(ch);
				//get the value for the number of letter... A = 0, Z = 25
				//     take the value for ch for example F is 70, A is 65
				//     70(F)-65(A) = 5
				//     if A = 0 in our array, B = 1, C = 2, D = 3, E = 4, F = 5
				//     replacement[5] =  '3'
				letterValue = (int) ch - (int) 'A';
				translatedNumber.append(replacement[(int) ch - (int) 'A']);
			} else {
				translatedNumber.append(ch);
			}
		}
	
		System.out.println("The translated phone number is:" + translatedNumber);
	}		
}
	
	

