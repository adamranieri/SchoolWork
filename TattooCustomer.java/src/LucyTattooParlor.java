
import java.util.Scanner;
public class LucyTattooParlor {
	
	
	
	public static void main(String [] args){
		
		System.out.println("Welcome to Lucy's tattoo parlor");
		// creates scanner and takes a command line argument
		Scanner reader = new Scanner(System.in);
		TattooCustomer [][] schedule = new TattooCustomer[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		
//	    schedule[0][0] = new TattooCustomer("tim","skull",10);
//	    schedule[0][1] = new TattooCustomer("mike","skull",50);
//	    schedule[0][2] = new TattooCustomer("cindy","skull",90);
//	    
//	    schedule[1][0] = new TattooCustomer("bill","skull",10);
//	    schedule[1][1] = new TattooCustomer("bob","skull",5);
//	    schedule[1][2] = new TattooCustomer("robin","skull",90);
//	    
//	    schedule[2][0] = new TattooCustomer("justin","skull",10);
//	    schedule[2][1] = new TattooCustomer("adam","skull",50);
//	    schedule[2][2] = new TattooCustomer("connor","skull",90);
		
	    // initizlizes and assigns a few key booleans for choices
	   boolean success = true;    
	   boolean complete =true;
	    
	   while(complete){
		// Basic user interface
		System.out.println("Please enter the client's name");
		String name = reader.next();
		if (name.equals("Print")){
		//// prints list of artists and clients
		    
		    for (int w =0; w<schedule.length;w++){
		    	System.out.println("");
		    for (int x =0;x<schedule[w].length;x++){
		    	if (schedule[w][x]== null){;
		    		break;}
		    	if(x==0){
		    		System.out.println("Artist "+w +" ");
		    	}
		    	System.out.print(schedule[w][x].customerName+"\t");		    			    	
		    }
		    }			
			break;
		}
		System.out.println("Please enter the client's type of tattoo");
		String tattoo = reader.next();		
		System.out.println("Please enter the client's estimated time in minutes");
		int estimatedTime = reader.nextInt();
	    TattooCustomer jimbo = new TattooCustomer(name,tattoo,estimatedTime);
	    
	    System.out.println("Does the client have a preferred artist Y/N");  
	    String input = reader.next();
	    boolean wantArtist;
	    if(input.charAt(0)=='Y'){
	     wantArtist = true;
	    }
	    if(input.charAt(0)=='y'){
		     wantArtist = true;
		    }
	    else{
	    	wantArtist = false;
	    }
	    
	    
	    
	    
	    //for the shortest wait	   
	     if(wantArtist==false){
	    	 success= addCustomer(schedule,jimbo);    
	     if (success==false){
	    	 System.out.println("sorry client could not be added to this artist please try someone else");
	     } }
	    // for the shortest wait
	    
	     
	     
	     else{
	     
	    ///for a preferred artist
	    System.out.println("Enter the client's prefferred artist");    
	 	int preferedArtist = reader.nextInt();  
	 	    
	    if(preferedArtist>=schedule.length){
	    	System.out.println("sorry that artist does not exist");
	    	continue;	    }
	    
	     success=addCustomer(schedule,jimbo,preferedArtist);
	     if (success==false){
	    	 System.out.println("sorry client could not be added to this artist please try someone else");
	     }
	     ///for a preferred artist
	     }
	     
//	     /// final check to add clients
//	     System.out.println("are you done adding clients? Y/N");
//	     String decision =  reader.next();
//	     char choice = decision.charAt(0);
//	     if(choice == 'Y'){
//	    	 complete = false;
//	     }
	     
	     
	   }
	   
	    
		
		
		
	}
	
	
	/**
	* Computes how many minutes of work the specified tattoo artist has.
	* @param The array of customers for one particular tattoo artist
	*/
	public static int computeMinutesOfWork(TattooCustomer [] a) {
	//TODO
		int time = 0;
		for(int i =0; i< a.length;i++){		
			if (a[i]== null){
				return time;
			}
			time = time + a[i].estimatedTime;			
		}
		
	return time;
	}
	/**
	* Adds customer to the waitlist for a specific artist.
	* If the artist is at capacity (in terms of number of customers or minutes)
	* Then the customer is not added and the method returns false
	* If the customer is successfully added the method returns true
	* @param
	*/
	public static boolean addCustomer(TattooCustomer [][] schedule, TattooCustomer client, int artistNum) {
	//TODO
		
		if(480<computeMinutesOfWork(schedule[artistNum])+ client.estimatedTime){
			return false;
		}
		
		for (int i =0;i<schedule[artistNum].length;i++){	
			if(schedule[artistNum][i]==null){
				schedule [artistNum][i]=  client; 
				return true;
			}
		}
			
				return false;
		}

	/**
	* Adds customer to the shortest waitlist in terms of minutes. If some artists have equal length waitlists
	* then the customer is added to the lowest numbered artist. If no artist has space then the method does not
	* add the customer, and returns false.
	* TODO - finish this javadoc
	* @return true if the customer was added to the waitlist, false otherwise (if all artists were full)
	*/
	public static boolean addCustomer(TattooCustomer [][] schedule, TattooCustomer client) {
	//TODO
		int max =480;
		int artistNum =0;
		
		
		for (int k =0; k<schedule.length;k++){			
			if(max>computeMinutesOfWork(schedule[k])){
				max = computeMinutesOfWork(schedule[k]);			
				artistNum= k;				
			}	
				
		
		}
		
		System.out.println("added to this artist "+artistNum);
		for (int i =0;i<schedule[artistNum].length;i++){	
			if(schedule[artistNum][i]==null){
				schedule [artistNum][i]=  client; 
				return true;} }
		
		
	return false;

}
}





