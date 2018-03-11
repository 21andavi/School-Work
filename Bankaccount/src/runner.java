/*
 * David An
 * Bank Account 
 * Mrs. Lint
 * I really spent too much time on this plz give mercy. 
 */

import java.util.*;
public class runner{
    public static void main(String[] args){
    		//declare new accounts with appropreite parameters
    	
        checkingaccount chk = new checkingaccount("David An", 1245.83, 16482);
        creditaccount cred = new creditaccount("David An", 10000, 16482, 2123.69);
        savingsaccount sav = new savingsaccount("David An", 5500.00, 16482);
        

        
        Scanner scanner = new Scanner(System.in);
        boolean transaction = true;
        String choice12;
        
        while(transaction != false) {
        		System.out.println("What kind of account would you like to use? please enter \n 1 for checking \n 2 for savings \n 3 for credit");
        		int choice = scanner.nextInt();
        		//savings account function 
        		if(choice == 1)
        		{
        			System.out.println("What is your ID number");
        			int idnumber = scanner.nextInt();
        			boolean secure = chk.security(idnumber);
        			if( secure == false) {
        				System.out.println("Transaction canceled Try again later. ");
        				break;
        				
        			}
        			
        			while(secure == true){
        				scanner.nextLine();
        				System.out.println("Do You wish to deposit or withdrawl. Your Balance is " + chk.getBalance());
                		choice12 = scanner.nextLine();
                		
                		if(choice12.equals("deposit")) {
                			System.out.println("What is the amount you wish to deposit");
                			double deposit1 = scanner.nextDouble();
                			chk.deposit(deposit1);
                			chk.addInterest();
                			System.out.println("Your updated checking account is");
                			System.out.println(chk);
                			break;
                		}
                		else if(choice12.equals("withdrawl")|| choice12.equals("withdraw")) {
                			System.out.println("What is the amount you wish to withdrawl");
                			double withdrawl = scanner.nextDouble();
                			chk.withdraw(withdrawl);
                			chk.addInterest();
                			System.out.println("Your updated checking account is");
                			System.out.println(chk);
                			break;
                		}
        			}
        	        
            		
        		}
        		//checking account functioon
        		else if(choice == 2)
        		{
        			System.out.println("What is your ID number");
        			int idnumber = scanner.nextInt();
        			boolean secure2 = sav.security(idnumber);
        			if( secure2 == false) {
        				System.out.println("Transaction canceled Try again later. ");
        				break;
        			}
        	        
        			while(secure2 == true) {
        				scanner.nextLine();
        				System.out.println("Do You wish to deposit or withdrawl. Your Balance is " + sav.getBalance());
                		String choice2 = scanner.nextLine();
                	
                		if(choice2.equals("deposit")) {
                			System.out.println("What is the amount you wish to deposit");
                			double deposit2 = scanner.nextDouble();
                			sav.deposit(deposit2);
                			sav.addInterest();
                			System.out.println("Your updated savings account is");
                			System.out.println(sav);
                			break;
                		}
                		else if(choice2.equals("withdrawl")|| choice2.equals("withdraw")) {
                			System.out.println("What is the amount you wish to withdrawl");
                			double withdrawl1 = scanner.nextDouble();
                			sav.withdraw(withdrawl1);
                			sav.addInterest();
                			System.out.println("Your updated savings account is");
                			System.out.println(sav);
                			break;
                		}
        			}
        		}
        		//one choice which is credit
        		else if(choice == 3)
        		{
        			System.out.println("What is your ID number");
        			int idnumber = scanner.nextInt();
        			boolean secure3 = cred.security(idnumber);
        			if( secure3 == false) {
        				System.out.println("Transaction canceled Try again later. ");
        				break;
        			}
        	        //credit maximum
        			while(secure3 == true) {
        				System.out.println("Your credit maxium is $10,000 ");
        				System.out.println("You have spent " + cred.getsum() + "Out of 10,000");
        				scanner.nextLine();
        				System.out.println("Do You wish to deposit or withdrawl. Your Balance that is avalible to spend is " + (10000 - cred.getsum()));
                		
                		String choice3 = scanner.nextLine();
                		if(choice3.equals("deposit")) {
                			System.out.println("What is the amount you wish to deposit");
                			double deposit3 = scanner.nextDouble();
                			cred.deposit(deposit3);
                			cred.addInterest();
                			System.out.println("Your updated credit account is");
                			System.out.println(cred);
                			break;
                		}
                		if(choice3.equals("withdrawl")|| choice3.equals("withdraw")) {
                			System.out.println("What is the amount you wish to withdrawl");
                			double withdrawl3 = scanner.nextDouble();
                			if(withdrawl3 < cred.getBalance() - cred.getsum()) {
                				cred.withdraw(withdrawl3);
                				cred.addInterest();
                				System.out.println("Your updated credit account is");
                				System.out.println(cred);
                				break;
                			}
                		}
        			}
        		}
        		//check for another transaction
        		System.out.println("Do you wish to make another trasaction? \n 1 for yes \n 2 for no");
        		int choice4 = scanner.nextInt();
        		if(choice4 == 1) {
        			transaction = true;
        		}
        		else
        			//friendly UI
        			System.out.println("Have a good day my pleasure");
        			transaction = false;
        }
    }
}