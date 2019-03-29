
public class AccountTester {
	public static void main(String[] args) {
		
		/* Create an international account with owner initial balance */
		Account acc1 = new Account("Suyeon", 'i', 100.0);
		/* Create a domestic account with owner initial balance */
		Account acc2 = new Account("Yuna", 'd', 200.0);
		System.out.println("=================(1)");
		/* inquire about the account's current balance */
		double balance = acc1.getBalance();
		System.out.println("acc1 current balance: " + balance);
		/* inquire about the account's current description */
		String description = acc1.getDescription();
		System.out.println(description);
		
		System.out.println("acc2 current balance: " + acc2.getBalance());
		System.out.println(acc2.getDescription());
		
		/* Create an international account with owner with default initial balance 0.0 */
		Account acc3 = new Account("Heeyeon", 'i');
		/* Create a domestic account with owner with default initial balance 0.0 */
		Account acc4 = new Account("Jiyoon", 'd');
		
		System.out.println("=================(2)");
		System.out.println("acc3 current balance: " + acc3.getBalance());
		System.out.println(acc3.getDescription());
		
		System.out.println("acc4 current balance: " + acc4.getBalance());
		System.out.println(acc4.getDescription());
		
		acc3.setBalance(300.0);
		acc4.setBalance(400.0);
		
		System.out.println("=================(3)");
		System.out.println("acc3 current balance: " + acc3.getBalance());
		System.out.println(acc3.getDescription());
		
		System.out.println("acc4 current balance: " + acc4.getBalance());
		System.out.println(acc4.getDescription());
		
		System.out.println("=================(4)");
		System.out.println("acc1 current balance: " + acc1.getBalance());
		/* deposit into an international account */
		acc1.deposit(50.0);
		System.out.println("after deposit...");
		System.out.println("acc1 current balance: " + acc1.getBalance());
		
		System.out.println("=================(5)");
		System.out.println("acc2 current balance: " + acc2.getBalance());
		/* deposit into a domestic account */
		acc2.deposit(50.0);
		System.out.println("after deposit...");
		System.out.println("acc2 current balance: " + acc2.getBalance());
		
		System.out.println("=================(6)");
		System.out.println("acc3 current balance: " + acc3.getBalance());
		/* withdraw from an international account */
		acc3.withdraw(50.0);
		System.out.println("after withdraw...");
		System.out.println("acc3 current balance: " + acc3.getBalance());
		
		System.out.println("=================(7)");
		System.out.println("acc4 current balance: " + acc4.getBalance());
		/* withdraw from a domestic account */
		acc4.withdraw(50.0);
		System.out.println("after withdraw...");
		System.out.println("acc4 current balance: " + acc4.getBalance());
		
		System.out.println("=================(8)");
		System.out.println(acc2.getDescription());
		System.out.println(acc4.getDescription());
		/* transfer from a domestic account to another domestic account */
		acc2.transferTo(acc4, 20.0);
		System.out.println("after transfer...");
		System.out.println(acc2.getDescription());
		System.out.println(acc4.getDescription());
		
		System.out.println("=================(9)");
		System.out.println(acc1.getDescription());
		System.out.println(acc3.getDescription());
		/* transfer from an international account to another international account */
		acc1.transferTo(acc3, 20.0);
		System.out.println("after transfer...");
		System.out.println(acc1.getDescription());
		System.out.println(acc3.getDescription());
		
		System.out.println("=================(10)");
		System.out.println(acc2.getDescription());
		System.out.println(acc3.getDescription());
		/* transfer from a domestic account to an international account */
		acc2.transferTo(acc3, 30.0);
		System.out.println("after transfer...");
		System.out.println(acc2.getDescription());
		System.out.println(acc3.getDescription());
		
		System.out.println("=================(11)");
		System.out.println(acc1.getDescription());
		System.out.println(acc4.getDescription());
		/* transfer from an international account to a domestic account */
		acc1.transferTo(acc4, 1000.0);
		System.out.println("after transfer...");
		System.out.println(acc1.getDescription());
		System.out.println(acc4.getDescription());
	}
}