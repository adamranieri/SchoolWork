public class Receptionist extends Employee{
	
	private AssistantRegionalManager supervisor;
    private int maxTaskComplexityLevel;
    
    public Receptionist(int IDNumber, String name, Task[] taskList, AssistantRegionalManager supervisor, int maxTaskComplexityLevel){
    	super.setName(name);
      	super.setIDNumber(IDNumber);
      	super.setTaskList(taskList);
     	this.supervisor = supervisor;
    	this.maxTaskComplexityLevel = maxTaskComplexityLevel;    	
    }
    
    public AssistantRegionalManager getSupervisor(){
    	return supervisor;		
    }
    
    public void setSupervisor(AssistantRegionalManager supervisor){
    	this.supervisor = supervisor;
    }
       
    public int getMaxTaskComplexity(){
    	return maxTaskComplexityLevel;
    }
    
    public void setMaxTaskComplexityLevel(int maxTaskComplexityLevel){
    	this.maxTaskComplexityLevel = maxTaskComplexityLevel;
    }
    
    public String toString(){
    	String returnString = "Receptionist\n";
    	Task[] taskList = super.getTaskList();
    	returnString += "Name: " + super.getName() + "\n";
    	returnString += "ID: " + super.getIDNumber() + "\n";
    	returnString += "Task List: \n";
    	
    	// Iterate through all of the tasks of this class and add them to the returnString
    	for(int i = 0; i < taskList.length; ++i){
    		returnString += taskList[i].toString() + "\n";
    	}
    	
    	returnString += "Assistant Regional Manager: " + this.getSupervisor().getName() + "\n";
       	returnString += "Max Task Level: " + this.getMaxTaskComplexity();
       	
       	// Iterate through all the RegionalManager's employees and add them to the returnString.

    	return returnString;
    }
}