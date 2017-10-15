//Michael Arboleda
import static org.junit.Assert.*;

import org.junit.Test;

public class RegionalManagerTest {
	public static String error = "RegionalManagerTest\n";	
	
	@Test
	public void testRegionalManagerToString(){
		error += ("testRegionalManagerToString() \t RegionalManager toString\n");
		
		Task t1 = new Task("T1", 1);
		Task t2 = new Task("T2", 2);
		Task[] ansTasks = {t1, t2};
		String[] items = {"100x white paper","Sabre Printer" ,"Sabre Copier"};
		RegionalManager r = new RegionalManager(-1, "Michael Scott", null, -1, null, -1);
		SalesAssociate sa = new SalesAssociate(3, "James Duncan Halpert", ansTasks, 5, items, r);
		AssistantRegionalManager arm = new AssistantRegionalManager(2, "Dwight Kurt Schrute III", ansTasks, r, 5);
		Employee[] ee = {arm, sa};

		String rString = "Assistant Regional Manager\nName: Dwight Kurt Schrute III\nID: 2\nTask List: \n" +
				"\tTask: T1\tLevel: 1\n\tTask: T2\tLevel: 2\nRegional Manager: Michael Scott\nMinimum Task Level: 5";
		
		String saString = "Sales Associate\nName: James Duncan Halpert\nID: 3\nTask List: \n\tTask: T1\tLevel: 1\n" +
				"\tTask: T2\tLevel: 2\nRegional Manager: Michael Scott\nNumber of clients: 5\nProducts to sell: \n" +
				"\t100x white paper\n\tSabre Printer\n\tSabre Copier";		
		
		RegionalManager e = new RegionalManager(1, "Michael Scott", ansTasks, 10, ee, 8);
			
		String ans = "Regional Manager\nName: Michael Scott\nID: 1\nTask List: \n\tTask: T1\tLevel: 1\n\tTask: T2\tLevel: 2\n" +
				"Region Number: 10\nMinimum Task Level: 8\nEmployees: \n" + rString + "\n" + saString;

		String students = e.toString();

		int min = Math.min(ans.length(), students.length());
		if(ans.length() !=  students.length()){
			error += ("\tSize was " + ans.length() + " but received size " + students.length() + "\n\n");
		}

		for(int i = 0; i < min; i++){
			if(ans.charAt(i) != students.charAt(i)){
				String temp1 = "";
				String temp2 = "";

				if(ans.charAt(i) == '\t'){
					temp1 = "\\t";
				}
				else if(ans.charAt(i) == '\n'){
					temp1 = "\\n";
				}
				else{
					temp1 = ("" + ans.charAt(i));
				}

				if(students.charAt(i) == '\t'){
					temp2 = "\\t";
				}
				else if(students.charAt(i) == '\n'){
					temp2 = "\\n";
				}
				else{
					temp2 = ("" + students.charAt(i));
				}
				error += ("\tIndex: " + i + " Ans: " + temp1 + " Students: " + temp2 + "\n");	
			}
		}
		error += ("\n");

		assert(ans.equals(students));
	}
}