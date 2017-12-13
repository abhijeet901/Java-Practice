

abstract class MaheshPhone
{
public void call(){
System.out.println("Calling...");
}
public abstract void camera();
public abstract void game();
public abstract void youtube();}
abstract class RameshPhone extends MaheshPhone
{
public void camera()
{
System.out.println("Camera..");
}}
class SureshPhone extends RameshPhone
{
public void game()
{
System.out.println("Gaming..");
}
public void youtube()
{
System.out.println("Youtubing..");;
}}

	
