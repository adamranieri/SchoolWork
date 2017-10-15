
public class BankAccount {
	
	private String name = "";
	private double balance = 0.0;
	
	
	
		public BankAccount(String name, double balance) {			
			this.name = name;
			this.balance = balance;
			
		}
		
		public String getCustomerName(){
			
			return name;		
			
		}
		public void setCustomerName(String s){
			name = s;
		}
		
		
	
	
	
	

}
