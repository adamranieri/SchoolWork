public class SalesAssociate extends Employee{
	private int numClients;
    private String[] products;
    private RegionalManager supervisor;

    SalesAssociate(int IDNumber, String name, Task[] taskList, int numClients, String[] products, RegionalManager supervisor){
    	super.setName(name);
    	super.setIDNumber(IDNumber);
    	super.setTaskList(taskList);
    	this.products = products;
    	this.supervisor = supervisor;
    	this.numClients = numClients;
    }
    
    // Get products
    public String[] getProducts(){
    	return this.products;
    }
    
    // Set products
    public void setProducts(String[] products){
    	this.products = products;
    }
    
    // Get num clients
    public int getNumClients(){
    	return this.numClients;
    }
    
    // Set num clients
    public void setNumClients(int numClients){
    	this.numClients = numClients;
    }
    
    // Get supervisor
    public RegionalManager getSupervisor(){
    	return this.supervisor;
    }
    
    // Set supervisor
    public void setSupervisor(RegionalManager supervisor){
    	this.supervisor = supervisor;
    }
	//equals method. Do not edit!
    
    // The to string method of this class
    public String toString(){
    	String returnString = "Sales Associate\n";
    	Task[] taskList = super.getTaskList();
    	String[] products = this.getProducts();
    	returnString += "Name: " + super.getName() + "\n";
    	returnString += "ID: " + super.getIDNumber() + "\n";
    	returnString += "Task List: \n";
    	
    	// Loop through all of the tasks the employee has and add them to the string.
    	for(int i = 0; i < taskList.length; ++i){
            returnString += taskList[i].toString() + "\n";
    	}
    	
    	returnString += "Regional Manager: " + this.getSupervisor().getName() + "\n";
    	returnString += "Number of clients: " + this.getNumClients() + "\n";
    	returnString += "Products to sell: \n";
  
    	for(int i = 0; i < products.length; ++i){
    		
    		// Used to prevent an extra line at the end
    		
    		if(i != products.length - 1){
        		returnString +=  "\t" + this.products[i] + "\n";
    		} else {
        		returnString +=  "\t" + this.products[i];
    		}
    	}
    	
    	return returnString;
    }
    
	public boolean equals(SalesAssociate s){
		boolean equal = super.equals(s);
		equal = equal && (s.getNumClients() == numClients);
		equal = equal && (s.getSupervisor().equals(supervisor));
		
		for(int i = 0; i < products.length; i++){
			equal = equal && (products[i].equals(s.getProducts()[i]));
		}
		return equal;
	}
	
}