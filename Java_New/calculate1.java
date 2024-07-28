import java.util.Scanner;
abstract class base
{
protected float r,vol;
public void read(float x)
{
r=x;
}
public abstract void cal();
public void display()
{
System.out.println("Volume:"+vol);
}
}
class sphere extends base
{
public void cal()
{
vol=3.14f*r*r*r*4/3;
}
}
class hemisphere extends base
{
public void cal()
{
vol=3.14f*r*r*r*2/3;
}
}
class calculate1
{
public static void main(String args[])
{
float y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Radius:");
y=sc.nextFloat();
sphere s=new sphere();
System.out.println("sphere");
s.read(y);
s.cal();
s.display();
hemisphere hem=new hemisphere();
System.out.println("hemisphere");
hem.read(y);
hem.cal();
hem.display();
}
}
