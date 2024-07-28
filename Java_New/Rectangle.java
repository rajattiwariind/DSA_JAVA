
import java.util.Scanner;
class rectangle
{
double area;
void area(int l,int b)
{
area=l*b;
System.out.println("Area of rectangle:"+area);
}
void area(float base,float height)
{
area=base*height*0.5;
System.out.println("Area of Triangle:"+area);
}
void area(int s)
{
area=s*s;
System.out.println("Area of Square:"+area);
}
}
class result1
{
public static void main(String args[])
{
int l,b,s;
float ba,h;
rectangle r=new rectangle();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Length:");
l=sc.nextInt();
System.out.println("Enter Breadth:");
b=sc.nextInt();
r.area(l,b);
System.out.println("Enter Base:");
ba=sc.nextFloat();
System.out.println("Enter Height:");
h=sc.nextFloat();
r.area(ba,h);
System.out.println("Enter side of Square:");
s=sc.nextInt();
r.area(s);
}
}
