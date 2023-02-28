package controlstatement;
	abstract class BankAccount{
		int account_number=5456565;
		int balance= 30000;
		abstract void deposit();
		abstract void withdraw();
	}
	class CheckingAccount extends BankAccount{
		void deposit() {
			int deposit=1000;
			System.out.println("Ammount deposit"+" "+(balance+deposit));
		}
		void withdraw() {
			int withdraw=500;
			System.out.println("Ammount withdraw"+" "+(balance+withdraw));
		}
	}
public class AbstractMethod2 {
		public static void main(String[] args) {
			BankAccount obj = new CheckingAccount();
			obj.deposit();
			obj.withdraw();
		}
	}

