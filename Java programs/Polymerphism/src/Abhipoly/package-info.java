/**
 * 
 */
/**
 * @author USER
 *
 */
package Abhipoly;
class A
{
int a;
A()
{
System.out.println("Parent class constructor");
}
A(int a)
{
this.a = a;
}
void display()
{
System.out.println("A is" +a);
}
}
class B extends A
{
int b=10;
B()
{ }
B(int b)
{
	this.b=b;
}
void display()
{
System.out.println("B is"+b);
}}
class Main
{
public static void main(String[]args)
{
	B obj=new B(10);
	obj.display();
}
}