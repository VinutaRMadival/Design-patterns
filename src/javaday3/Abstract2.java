package javaday3;



public class Abstract2 extends Abstract1 {

	@Override                              //This annotation compares superclass method with subclass method.
	void run() {                            //overriding the abstract method
		System.out.println("running safely"); 
		
		
	}

	public static void main(String[] args) {
		
		
		Abstract2 obj=new Abstract2();           //creating the object
	    obj.run();                       //calling run method
	  
	}
	}


