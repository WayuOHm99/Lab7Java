package shape;

public class Square extends Shape {
    double side = 0;
    public Square(double x){
        side = x;
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}
