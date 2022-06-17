// �ʵ� : �ܰ� (int)
// �޼ҵ� : �Ա�(int) : void
//        ���(int) : void >> ��ݾ��� ���� �ܰ� �̻��� �� ����(������ �ݾ��� ��?)�� �߻����Ѽ� throws...
//        getter() : int
class BankWithdrawException extends RuntimeException {
	private int lack;
	
	public BankWithdrawException(String message, int lack) {
		super(message);
		this.lack = lack;
	}

	public int getLack() {
		return lack;
	}
}

class BankAccount {
	private int balance;
	public BankAccount(int balance) {
		this.balance = balance;
	}
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) throws BankWithdrawException {
		if (balance >= amount) {
			balance -= amount;
		} else {
			throw new BankWithdrawException("�ܰ� ������"
										, amount - balance);
		}
	}
	public int getBalance() {
		return balance;
	}
}

public class Main6 {
	public static void main(String[] args) {
		// ���� ���� ��ü ����
		BankAccount b = new BankAccount(1000);
		// �Ա� / ��� / ���� �׽�Ʈ
		b.deposit(1000);
		try {
			// ��� ȣ�� >> ���� ó�� (try - catch)
			b.withdraw(2500);
			System.out.println(b.getBalance());
		} catch(BankWithdrawException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLack());
		}
	}
}