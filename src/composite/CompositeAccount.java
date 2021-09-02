package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account {
	
	private float totalBalance;
	private List<Account> accountlist=new ArrayList<Account>();
	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		totalBalance=0;
		for(Account f:accountlist)
		{
			totalBalance=totalBalance+f.getBalance();
		}
		return totalBalance;
	}
	public void addAccount(Account acc)
	{
		accountlist.add(acc);
	}
	public void removeAccount(Account acc)
	{
		accountlist.add(acc);
	}


}
