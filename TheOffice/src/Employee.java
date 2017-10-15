
public abstract class Employee {	
	
	private int IDNumber;
    private String name;
    private Task[] taskList;
    
    public Employee(int IDNumber, String name, Task[] taskList){
    	this.IDNumber = IDNumber;
    	this.name = name;
    	this.taskList = taskList;
    }
    
    public Employee(){

    }
    
    // Get IDnumber of employee
    public int getIDNumber(){
    	return this.IDNumber;
    }
    
    // Get IDNumber for employee
    public void setIDNumber(int IDNumber){
    	this.IDNumber = IDNumber;
    }
    
    // Get name for employee
    public String getName(){
    	return this.name;
    }
    
    // Set name for employee
    public void setName(String name){
    	this.name = name;
    }
    
    // Get task list for employee
    public Task[] getTaskList(){
    	return this.taskList;
    }
    
    //Set tasks for employee
    public void setTaskList(Task[] taskList){
    	this.taskList = taskList;
    }
    
    /* Runs through an employee and display relevant info for the employee
     * @param Employee Name, Employee ID, Employee task[]
     * @author Luke Pfeiffer
     */
    
    public String toString(){
    	String returnString = ""; 
    	returnString += "Name: " + this.name + "\n";
    	returnString += "ID: " + this.IDNumber + "\n";
    	returnString += "Task List: \n";
    	
    	// Iterate through all of the task lists and add them to the returnString.
    	for(int i = 0; i < this.taskList.length; ++i){
    		if( i != this.taskList.length - 1){
        		returnString += taskList[i].toString() + "\n";
    		} else {
        		returnString += taskList[i].toString();
    		}
    	}
    	return returnString;
    }
      
    /*
     *  Checks to see if the employee passed to the method is equal to the employee the method
     *  is called on.
     *  @author Luke Pfeiffer
     *  @params Employee
     */
    
	public boolean equals(Employee e){
		boolean equal = true;
		equal = equal && (e.getIDNumber() == IDNumber);
		equal = equal && (e.getName().equals(name));
		for(int i = 0; i < taskList.length; i++){
			equal = equal && (taskList[i].equals(e.getTaskList()[i]));
		}
		return equal;
	}
	
	/*
	 * Returns an integer of the lowest level of the task for an employee
	 * @param none
	 * @author Luke Pfeiffer
	 */



}