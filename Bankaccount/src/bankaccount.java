
public abstract class bankaccount {
	protected String name;
	protected double balance;
	protected int idNum;
	

	
	public bankaccount() {
		name = "";
		balance = 0.0;
		idNum = 0;
	}
	public bankaccount(String nm, double Bl, int ID) {
		name = nm;
		balance = Bl;
		idNum = ID;
	}
	//abstract classes here succesfully implenmented 
	
	public abstract double getBalance();
	public abstract void deposit();
	
}
