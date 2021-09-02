package composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CompositeAccount component=new CompositeAccount();
     component.addAccount(new DepositeAccount("VA001",100));
     component.addAccount(new DepositeAccount("VA002",150));
     component.addAccount(new SavingsAccount("SA001",200));
     
     float totalBalance=component.getBalance();
     System.out.println("total balance:"+totalBalance);
	}

}
