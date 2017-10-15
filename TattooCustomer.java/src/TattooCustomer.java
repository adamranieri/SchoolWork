
public class TattooCustomer {
	
	String customerName;
	String desiredTattoo;
	int preferredTechnician;
	int estimatedTime;
	
	
	
	
	public TattooCustomer (String customerName,String desiredTattoo,int estimatedTime){
		this.customerName = customerName;
		this.desiredTattoo = desiredTattoo;
		this.preferredTechnician = preferredTechnician;
		this.estimatedTime = estimatedTime;
			
	}
	
	
	public String getName(){
		return customerName;	
	}
	
	public String getTattoo(){
		return desiredTattoo ;	
	}

	public int getMinutes(){
		return estimatedTime;	
	}
	
	
	
}
