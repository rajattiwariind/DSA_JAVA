public class Rectangle extends Shape {
    private int length;
    private int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    protected void calculateArea() {
        int area = length*breadth;
        System.out.println("Area of rectangle is "+ area);
    }
}
