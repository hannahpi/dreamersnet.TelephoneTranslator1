package dreamersnet.net.TelephoneTranslator;

public class TelephoneTranslator {
	
	public static void main(String[] args) {
		ReadUserInput readInput = new ReadUserInput();
		String telephoneNumber = readInput.prompt("Please enter the phone number:");
		StringBuilder translatedNumber = new StringBuilder();
		char[] replacement = {'2','2','2',
						      '3','3','3',
						      '4','4','4',
						      '5','5','5',
						      '6','6','6',
						      '7','7','7','7',
						      '8','8','8',
						      '9','9','9','9'};
		
		for (char ch : telephoneNumber.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				ch = Character.toUpperCase(ch);
				translatedNumber.append(replacement[(int) ch - (int) 'A']);
			} else {
				translatedNumber.append(ch);
			}
		}
		
		System.out.println("The translated phone number is:" + translatedNumber);
	}		
}
	
	

