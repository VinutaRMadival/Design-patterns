package javaday3;

public abstract class Abstractsc 
{
static double v1=10.6;           //declare static variable v1 and initializing with value 10.6
int x1=10;                       //declare non-static variable v1 and initializing with value 10
public abstract void test();     //abstract method
public static void view()         //static method
{
	System.out.println("view() of demo class");
}
public void display()           //concrete method
{
	System.out.println("this is display method");
}
}
