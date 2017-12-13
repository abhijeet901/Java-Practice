
public class MethodOverloading
{
int area;int a;int b;
void draw(int a) 
{
System.out.println("circle radius"+a);
System.out.println("Area of circle is"+a*a);
}
void draw(int a,int b)
{
System.out.println("Area of Rectangle"+a*b);
}
}
class Mainclass
{
public static void main(String args[])
{
MethodOverloading obj=new MethodOverloading();
obj.draw(6);
obj.draw(5,4);
}}