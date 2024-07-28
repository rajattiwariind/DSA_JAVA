import java.util.Scanner;
class rectangle
{
int l,b;
int area;
rectangle()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length:");
l=sc.nextInt();
System.out.println("Enter breadth:");
b=sc.nextInt();
}
void rect_area()
{
area=l*b;
System.out.println("The area of rectangle is:"+area);
}
}
class tester1
{
public static void main(String args[])
{
rectangle r=new rectangle();
r.rect_area();
}
}
