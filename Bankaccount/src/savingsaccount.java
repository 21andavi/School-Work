public class savingsaccount extends bankaccount{
	private String name;
	private double balance;
	private int id;
	final double interest = 0.015;
	private int idnum = 16482;


	public savingsaccount () {
		name = "";
		balance = 0.0;
		id = 0;
	}

	public savingsaccount (String nme, double ble, int ID ){
		name = nme;
		balance = ble;
		id = ID; 
	}
	//methods
	public double getBalance(){
		return balance;
	}
	public void addInterest()
	{
		balance = balance + (balance * interest);
	}

	public void deposit(double money){
		balance = money + balance;
	}
	public boolean security(int idnumb) {
		if(idnumb == idnum) {
			return true;
		}
		else
			return false; 
	}
	public void withdraw(double money) {
		balance = balance - money;
	}
	public String toString(){
		String str = "name " + name + "\nBalance " + balance + "\nID Number " + id;
		return str;
	} 
	public boolean check(String str) {
		if(str.equals("deposit"))
			return true;
		else
			return false;
	}
}