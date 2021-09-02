package proxy;

public class RealSubjectclass implements Subject{

	@Override
	public void method() {
		System.out.println("I am an actual implementation of subject rest of all are proxies");
		
	}
	

}
