
class mathoperation
{
static float mul(float x,float y)
{
return x*y;
}
static float div(float x,float y)
{
return x/y;
}
}

class demo_static1
{
public static void main(String args[])
{
float a=mathoperation.mul(35f,45f);
float b=mathoperation.div(5f,53f);
System.out.println("Multiplication:"+a);
System.out.println("Division:"+b);
}
}
