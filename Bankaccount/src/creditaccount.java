
public class creditaccount extends bankaccount{
	private String name;
	private double balance;
	private int idnum;
	final double interest = 0.0899;
	private int id = 16482;
	private double amountSpent;

	public creditaccount () {
		name = "";
		balance = 0.0;
		idnum = 0;
		amountSpent = 0;
	}
	//method
	public creditaccount (String nme, double ble, int ID, double amtS){
		name = nme;
		balance = ble;
		idnum = ID; 
		amountSpent = amtS;
	}
	public double getBalance(){
		return balance;
	}
	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public void deposit(double money){
		amountSpent = money + amountSpent;
	}
	public boolean security(int idnumb) {
		if(idnumb == id) {
			return true;
		}
		else
			return false; 
	}
	public void withdraw(double money) {
		amountSpent = amountSpent + money;
	}
	public String toString(){
		String str = "Name " + name + "\nBalance " + balance + "\nID Number " + id;
		return str;
	} 
	public double getsum() {
		return amountSpent;
	}
	public boolean check(String str) {
		if(str.equals("deposit"))
			return true;
		else
			return false;
	}


}
