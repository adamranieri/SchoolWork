public class Task {
    private String name;
	private int level;
	
	public Task(String name, int level){
		this.name = name;
		this.level = level;
	}
	
	//Get name of task
	public String getName(){
    	return this.name;
    }
	
	//Set name of task
	public void setName(String name){
		this.name = name;
	}
	
	//Get level of task
	public int getLevel(){
		return this.level;
	}
	
	// Set level of task
	public void setLevel(int level){
		this.level = level;
	}
	
	/* 
	 * Checks to see if the task is equal to the task passed to the method
	 * @params Task3
	 */
	public boolean equals(Task t){
		return ((t.getLevel() == level) && (t.getName().equals(name)));
	}
	
	/*
	 * Returns a string of the tasks
	 * @author Luke Pfeiffer
	 */
	
	public String toString(){
		String returnString = "\tTask: " + this.name + "\t" + "Level: " + this.level;
		return returnString;
	}
}