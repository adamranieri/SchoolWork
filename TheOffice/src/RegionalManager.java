public class RegionalManager extends Employee {
	
    private int RegionNum;
    private Employee[] subordinates;
    private int minimumTask;
    
    public RegionalManager(int IDNumber, String name, Task[] taskList, int RegionNum, Employee[] subordinates, int minimumTask){
    	super.setIDNumber(IDNumber);
    	super.setName(name);
    	super.setTaskList(taskList);
    	this.RegionNum = RegionNum;
    	this.subordinates = subordinates;
    	this.minimumTask = minimumTask;
    }
    
    RegionalManager(int IDNumber, String name, Task[] taskList, int RegionNum, int minimumTask){
    	super.setIDNumber(IDNumber);
    	super.setName(name);
    	super.setTaskList(taskList);
    	this.RegionNum = RegionNum;
    	this.minimumTask = minimumTask;
    }
    
    //Get regionNum 
    public int getRegionNum(){
    	return this.RegionNum;
    }
    
    // Set region num
    public void setRegionNum(int regionNum){
    	this.RegionNum = regionNum;
    }
	
    //Get subordinates
    public Employee[] getSubordinates(){
    	return this.subordinates;
    }
    
    //Set subordinates
    public void setSubordinates(Employee[] subordinates){
    	this.subordinates = subordinates;
    }
    
    //Get minimum task
    public int getMinimumTask(){
    	return this.minimumTask;
    }
    
    //Set minimum task
    public void setMinimumTask(int minimumTask){
    	this.minimumTask = minimumTask;
    }
    
    /*
     * Returns a string of the Regional Manager's name, ID, Tasks, employees, and minimum task level
     * @param None
     * @author Luke Pfeiffer
     */
    
    public String toString(){
    	String returnString = "Regional Manager\n";
    	Task[] taskList = super.getTaskList();
    	Employee[] employees = this.getSubordinates();
    	returnString += "Name: " + super.getName() + "\n";
    	returnString += "ID: " + super.getIDNumber() + "\n";
    	returnString += "Task List: \n";
    	
    	// Iterate through all of the tasks of this class and add them to the returnString
    	for(int i = 0; i < taskList.length; ++i){
    		returnString += taskList[i].toString() + "\n";
    	}
    	
    	returnString += "Region Number: " + this.getRegionNum() + "\n";
       	returnString += "Minimum Task Level: " + this.getMinimumTask() + "\n";
       	returnString += "Employees: \n";
       	
       	// Iterate through all the RegionalManager's employees and add them to the returnString.
       	for(int i = 0; i < employees.length; ++i){
       		if( i != employees.length -1){
       		    returnString += employees[i].toString() + "\n";
       		} else {
           		returnString += employees[i].toString();
       		}
       	}
    	
    	return returnString;
    }
	//equals method. Do not edit!
	public boolean equals(RegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getRegionNum() == RegionNum);
		equal = equal && (r.getMinimumTask() == minimumTask);
		for(int i = 0; i < subordinates.length; i++){
			equal = equal && (subordinates[i].equals(r.getSubordinates()[i]));
		}
		return equal;
	}
}