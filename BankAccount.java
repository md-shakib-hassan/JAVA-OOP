import java.util.Scanner;

public class BankAccount {
  
     public static void main(String[] args) {
    Bank p1 = new Bank();
	
	p1.Balance=10000.00;
	
	p1.deposit(1000.00);
	
	p1.withdraw(1000.00);

	p1.display();
                 
        }
	
}

 class Bank{
	String Account;
	double Balance;

	void deposit(double d){
      Balance +=d;
	}
	
	void withdraw(double w){
        if(w>0 && w<=Balance){
		 Balance -= w;
	}
}
	
	void display(){
	 System.out.println("Current Balance: "+Balance);
	}
}
