
public class test_formater {
	
	public static void main(String[] args) {
		
		String []shortest = {"how","are","you","bil","joe","bob",null};
		String []medium = {"dear","mine",null,null,null,null,null};
		String []longest = {"power","lover","yours",null,null,null,null};
//		String line = "";
//		String result ="";
//		for (int i =0;i<3;i++){
//			
//		if (medium[i]==null){
//			medium[i]= "";
//		}
//		if (longest[i]==null){
//			medium[i]= "";
//		}
//		if (shortest[i]==null){
//			medium[i]= "";
//		}
//		
//		line =longest[i]+" "+ medium[i]+" " +shortest[i]+"\n\t"+line ;
//		result = result+line;
//	//	System.out.println(line);
//		}
//		System.out.print(line);
//		
//		
		
		
		System.out.println(formatPoem(shortest,medium,longest));
		
		//System.out.print("ldfksjhdfk\nklsjdfhkjsfh\n\tkjhskjshd");
		
		
	}
	
	
public static String formatPoem(String[] shortest, String[] medium, String[] longest){
	
	String result = "";


for( int i =0;i<longest.length;i++){
	
	
	
	if (shortest[i]!=null){
		result = result + shortest[i]+" ";		
	}
	
	if (medium[i]!=null){
		result = result + medium[i]+" ";		
	}
	
	
	if (longest[i]!=null){
		result = result + longest[i]+" ";		
	}
	
	result = result + "\n";
	
	for(int k = 0;k<=i;k++){	
	result = result + "\t";
	}
	
	
}
	return result;	
	
	
}
}