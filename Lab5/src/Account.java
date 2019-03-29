
public class Account {

	String name;
	char type;
	double balance;
	String description;
	
	Account(String name,char type)
	{
		this.name=name;
		this.type=type;
		balance=0;
	}
	Account(String name, char type, double balance)
	{
		this.name=name;
		this.type=type;
		this.balance=balance;
	}
	void setBalance(double balance)
	{
		this.balance=balance;
	}
	double getBalance()
	{
		return balance;
	}
	String getDescription()
	{
		if (type=='d') {
			description="Domestic account with owner "+name+" has current balance $"+balance;
		}
		else {
			description="International account with owner "+name+" has current balance $"+balance;
		}
		return description;
	}
	void transferTo(Account acc,double amount)
	{
		this.withdraw(amount);
		acc.deposit(amount);
	}
	void deposit(double amount)
	{
		if (type=='i') {
			balance+=amount*0.9;
		}
		else {
			balance+=amount;
		}
	}
	void withdraw(double amount)
	{
		if (type=='i') {
			balance-=amount*0.9;
		} 
		else {
			balance-=amount;
		}
	}
}
