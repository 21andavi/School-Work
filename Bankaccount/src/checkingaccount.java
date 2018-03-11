import java.util.*;
public class checkingaccount extends bankaccount{
	private String name;
	public double balance;
	private int id;
	final double interest = 0.20;
	private int idnum = 16482;
	Scanner scanner = new Scanner(System.in);


	public checkingaccount () {
		name = "";
		balance = 0.0;
		id = 0;
	}

	public checkingaccount (String nm, double bl, int ID ){
		name = nm;
		balance = bl;
		id = ID; 
	}
	//methods
	public double getBalance(){
		return balance;
	}
	public void deposit(double money1){
		balance = money1 + balance;
	}
	public void withdraw(double mone){
		balance = balance - mone;
	}
	public void addInterest()
	{
		balance = balance + balance * interest;
	}
	public String toString(){
		String str = "name" + name + "\nBalance" + balance + "\nID Number" + id;
		return str;
	} 
	public boolean security(int idnumb) {
		if(idnumb == idnum) {
			return true;
		}
		else
			return false; 
	}
	public boolean check(String str) {
		if(str.equals("deposit"))
			return true;
		else
			return false;
	}
	
	

}
