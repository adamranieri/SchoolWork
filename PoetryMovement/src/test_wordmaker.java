import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test_wordmaker {
	
	public static void main(String[] args) {
		
//		String letters ="tobeornottobethatisthequestion" ;
//		
//		String[] word_Sack= new String[letters.length()];
//		int wordSize =3;
//	
//		// -1 for word length 2
//		// -2 for word length 3
//		// -3 for word length 4
//		// -4 for word length 5
//		for(int i=0;i<(letters.length()-(wordSize-1));i++){
//			String possible_Word ="";	
////		this works
////		possible_Word= test_Sample.substring(i+0,i+1)+test_Sample.substring(i+1,i+2)+test_Sample.substring(i+2,i+3);
////		System.out.println(possible_Word);
//						
//			
//		for(int k = 0;k<wordSize;k++){
//		 possible_Word= possible_Word +letters.substring(i+k+0,i+k+1);
//		 
//		}
//		System.out.println(possible_Word);
////			if (isWord(possible_Word)){
////			word_Sack[x]= possible_Word;
////			x++;
////			}
////			
//		}
//	
//			for (int i = 0;i< word_Sack.length;i++){
//			System.out.println(word_Sack[i]);
//		}
////	
////		
	//	findWordsOfLength("loved",3);
	//	System.out.println(findWordsOfLength("loved",4));
		String [] debug =findWordsOfLength("lovedooms",5);
		for (int i = 0;i< debug.length;i++){
			System.out.println(debug[i]);
		}
//		}	
}
	public static String[] findWordsOfLength(String letters, int wordSize) {
		int x =0;
		//create the appropiate length array
		String[] word_Sack= new String[letters.length()];
		
		// shows where the possible word should start
		for(int i=0;i<(letters.length()-(wordSize-1));i++){
			String possible_Word ="";	
		//calculates how long for words should be
		for(int k = 0;k<wordSize;k++){
		 possible_Word= possible_Word +letters.substring(i+k+0,i+k+1);
		 
		}
//		System.out.println(possible_Word);
		// adds a word to the array if it is a real word
			if (isWord(possible_Word)){
			word_Sack[x]= possible_Word;
			x++;
			}
//			
		}
// 			for debugging
//			for (int i = 0;i< word_Sack.length;i++){
//			System.out.println(word_Sack[i]);
//		}	
		return word_Sack;
	}
	

	/**
	 * This method checks whether the given String occurs in a dictionary of English.
	 * STUDENTS: DO NOT MODIFY THIS METHOD IN ANY WAY. IT IS PROVIDED FOR YOU. 
	 * This method will terminate your program if it is unable to access the remote URL.
	 * You must be online for this code to work. 
	 * @param possWord The word to be checked.
	 * @return boolean Returns true if the word given is an English word, false otherwise.
	 */
	private static boolean isWord(String possWord) {
		boolean isWord = true;
		try {
			//connect to the URL. 
			String s = getUrl(possWord);
			Document d = Jsoup.connect(s).timeout(6000).get();
			Elements tdTags = d.select("h3");

			// Loop over all tdTags, in this case: the h3 tag 
			for( Element element : tdTags ){
				String check = element.toString();

				//Wordnet has a special h3 tag that appears only if the word is not in the dictionary
				//We search for this tag. If it is found, then the word searched is not in the dictionary
				if(check.equals("<h3>Your search did not return any results.</h3>") ){
					isWord = false;
				}
			}
		}
		catch (IOException e) {
			System.err.print("CHECK INTERNET CONNECTION. Could not connect to jsoup URL.");
			System.exit(0);
		}
		return isWord;
	}

	/**
	 * This is a helper method that the teaching staff code uses. 
	 * STUDENTS: DO NOT EDIT THIS METHOD.
	 * This method will terminate your program if it is unable to access the remote URL.
	 * You must be online for this code to work. 
	 * @param String: search 
	 * @return A string containing the URL for the wordnet search.
	 */
	private static String getUrl(String search) {
		//Standard URL for wordnet to search
		String url = "http://wordnetweb.princeton.edu/perl/webwn?s=";
		String newURL = null;
		try {
			//Get new page from word wordnet and get its location
			Document doc = Jsoup.connect(url + search).timeout(6000).get();
			newURL = doc.location().toString();
		}
		catch (IOException e) {
			System.err.print("CHECK INTERNET CONNECTION. Could not connect to jsoup URL.");
			System.exit(0);
		}
		//Return the string of the new URL. 
		return (newURL);
	}
	
	
	
	
}
