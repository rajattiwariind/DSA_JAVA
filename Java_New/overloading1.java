import java.util.Scanner;
class MathArea
{
    Scanner sc=new Scanner(System.in);
    int l,b,h,base;
    double area;
    MathArea()
    {
        System.out.println("Enter the length,breadth of rectangle:");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the height,base of triangle:");
        h=sc.nextInt();
        base=sc.nextInt();
    }
    void area()
    {
        area=l*b;
        System.out.println("area of rectangle:"+area);
    }
    void area(int h,int base)
    {
        area=0.5*h*base;
        System.out.println("area of triangle:"+area);
    }
    void area(int l)
    {
        area=l*l;
        System.out.println("area of square:"+area);
    }
}
class overloading1
{
    public static void main(String args[])
    {
        MathArea a=new MathArea();
        a.area();
        a.area(a.h,a.base);
        a.area(a.l);
        
    }
}
