package composite;

public class SavingsAccount extends Account{
	private String accountNo;
	private float accountBalance;
	
	

	
	public SavingsAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}




	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}

}



