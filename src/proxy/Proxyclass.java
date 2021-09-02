package proxy;

public class Proxyclass extends RealSubjectclass
{
	@Override
	public void method() {
		System.out.println("I am proxy ,I will perform authentication checks");
  //
		//if else logic apply here
		System.out.println("calling real method of realsubjectclass");
		super.method();
	}
}
