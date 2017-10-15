
public class test_to_english {

	public static void main(String[] args) {

		
		
		
		System.out.println(toEnglishLetters("6c6f766564"));
	
	
	
}

public static String toEnglishLetters(String hex){
	if(hex.length()%2 == 1){
		hex = hex.substring(0,hex.length()-1);
	}
	String converted_English = "";
	
	for (int i =0; i<hex.length();i+=2){
		int letter_Int = Integer.valueOf(hex.substring(i,i+2), 16);	
		
		if (letter_Int<97 ||letter_Int>122){
			letter_Int = (letter_Int%26)+97;						
		}
		
		char letter_Char = (char)letter_Int;	
		String letter_String = Character.toString(letter_Char) ;
		converted_English = converted_English +letter_String;
		}
	
	return converted_English;
	
	
}

}