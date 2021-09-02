package javaday3;

public class Abstractsc3 {

	public static void main(String[] args)
	{
		
	
		System.out.println(Abstractsc.v1);  //static members of abstract class declare with classname with dot operator
		Abstractsc.view();
		Abstractsc2 a2=new Abstractsc2();//non-static members of abstract class can be accesses by creating the objects of its any of the subclass
		a2.display();                   //through reference variable calling display method
		a2.test();                        //through reference variable calling test method
		
	}

}
