public class AssistantRegionalManager extends Employee{
	private int minimumTask;
	private RegionalManager manager;

	public AssistantRegionalManager(int IDNumber, String name, Task[] taskList, RegionalManager manager, int minimumTask){
		super.setIDNumber(IDNumber) ;
		super.setName(name);   	
		super.setTaskList(taskList);
		this.minimumTask = minimumTask;
		this.manager = manager;
	}
	
	public RegionalManager getManager(){
		return manager;
	}

	public void setRegionalManager(RegionalManager supervisor){
		this.manager= supervisor;
	}

	public int getMinimumTask(){
		return minimumTask;
	}

	public void setMinimumTask(int minimumTask){
		this.minimumTask= minimumTask;
	}

	/*
	 * Returns a string of the Employee name, ID, taskList, regional manager, and min task level
	 * @params None
	 * @author Luke Pfeiffer
	 * @see Employee#toString()
	 */
	
	public String toString(){
		
		String returnString = "Assistant Regional Manager\n";
    	Task[] taskList = super.getTaskList();
    	
    	returnString += "Name: " + super.getName() + "\n";
    	returnString += "ID: " + super.getIDNumber() + "\n";
    	returnString += "Task List: \n";
    	
    	// Loop through all of the tasks the employee has and add them to the string.
    	for(int i = 0; i < taskList.length; ++i){
    		returnString += taskList[i].toString() + "\n";
    	}
    	
    	returnString += "Regional Manager: " + this.manager.getName() + "\n";
    	returnString += "Minimum Task Level: " + this.getMinimumTask();
    	
		return returnString;
	}

	//equals method. Do not edit!
	public boolean equals(AssistantRegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getMinimumTask() == minimumTask);
		equal = equal && (r.getManager().equals(manager));
		return equal;
	}
}