public class Square{
    int side;
    
    public Square(int side){
        this.side=side;
        
    }
    
    public static void main(String[]args){
        Square square = new Square(4);
        square.calculateArea();
        square.calculatePerimeter();
        
        
    }
    
    public void calculateArea(){
        int area = side * side;
        System.out.println("Area of the square is " + area);
        
    }
    
    public void calculatePerimeter(){
        int perimeter = 4 * side;
        System.out.println("Perimeter of the square is " + perimeter);
    }
}
