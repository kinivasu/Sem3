import java.util.*;

class BankAccount {
	String name;
	int acc_no;
	String type;
	double balance;
	static int rate = 10;

	// Default Constuctor
	BankAccount() {
	}

	// Parameterised Constructor
	BankAccount(String n, int a, String t, double b) {
		name = new String(n);
		acc_no = a;
		type = t;
		balance = b;
	}

	BankAccount AcceptInfo(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter Your Name: ");
		String tempname = sc.nextLine();
		System.out.print("\n\tEnter Existent Balance: ");
		double tempbalance = sc.nextDouble();
		sc.nextLine();// ? DummyStatement Clears buffer for accepting a string type after a numeric
		System.out.print("\n\tEnter Account Type: ");
		String temptype = sc.nextLine();
		BankAccount ob = new BankAccount(tempname, n, temptype, tempbalance);
		return ob;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println("Updated Balance is: " + balance);
	}

	void withdraw(double amount) {
		if (balance < amount)
			System.err.println("\n\nInsufficent Balance");
		else {
			balance -= amount;
			System.out.print("\n\nSuccessfully Withdrew Amount " + amount + " Balance:" + balance);
		}
	}

	void display() {
		System.out.println("\n\n\tYour Account Details\n\n");
		System.out.println("\t\tUser Name : " + name);
		System.out.println("\t\tUser Balance : " + balance);
		System.out.println("\t\tAccount Type : " + type);
		System.out.println("\t\tAccount Number : " + acc_no);
	}

	static void disp_rate() {
		System.out.println("\n\n\t\tPresent Rate of Interest: " + rate);
	}

}

public class BankAccountControl {
	public static void main(String args[]) {
		BankAccount def = new BankAccount();
		System.out.println("\n\n\t\tWelcome!!");
		Scanner sc = new Scanner(System.in);

		BankAccount ob1 = def.AcceptInfo(1);
		int choice = 1;
		do {
			System.out.print(
					"\n\n\tEnter choice:\n\n\t1.Withdraw Money\n\n\t2.Deposit Money\n\n\t3.Show Account Details\n\n\t4.Show Rate of Interest\n\n\tAnything else to exit.\n\n\t\tEnter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.print("\nEnter Amount to be Withdrawn: ");
					double amt = sc.nextDouble();
					ob1.withdraw(amt);
					break;
				case 2:
					System.out.print("\nEnter Amount to be Deposited: ");
					double amount = sc.nextDouble();
					ob1.deposit(amount);
					System.out.print("Successfully Deposited Amount");
					break;
				case 3:
					ob1.display();
					break;
				case 4:
					BankAccount.disp_rate();
					break;
				default:
					System.out.println("\t\tExiting....");
					System.exit(0);
					break;
			}

		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
	}
}