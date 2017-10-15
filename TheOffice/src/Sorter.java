public class Sorter{
	
	/*
	 * Looks through an array of employees and compares names. Sorts the array by alphabetical names.
	 * @param Employee[]
	 * @author Luke Pfeiffer
	 */
	
	public static Employee[] sort(Employee [] employees){
		int length = employees.length;
		Employee tempEmployee;
		
		// A very basic sort loop. Checks to see if the compare value for the employee name is 
		// greater than 0. If so, put this at the front of the array.
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (employees[j+1].getName().compareTo(employees[j].getName()) < 0) {
					tempEmployee = employees[j];
					employees[j] = employees[j+1];
					employees[j+1] = tempEmployee;
				}
			}
		}
		return employees;
	}
}