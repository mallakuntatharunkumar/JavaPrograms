package exceptionHandling;

class InsufficentBankBalanceException extends RuntimeException {
	public InsufficentBankBalanceException() {
		super("Insufficent balnce");
	}

	InsufficentBankBalanceException(String s) {
		super(s);
	}
}

class Account {
	int bal;

	public Account(int bal) {
		this.bal = bal;
	}

	public void withdraw(int amt) throws InsufficentBankBalanceException {
		if (amt <= bal) {
			System.out.println(amt + " withdraw");
			bal -= amt;
		} else {
			InsufficentBankBalanceException a = new InsufficentBankBalanceException("Less money");
			throw a;
		}
	}
}

public class Example8 {
	public static void main(String[] args) {
		Account a = new Account(2000);
		try {
			a.withdraw(2001);
		} catch (InsufficentBankBalanceException e) {
			System.out.println("Handled");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
