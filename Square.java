public class Square extends Shape {
    float side = 0;
    public Square(float x){
        side = x;
    }
    public float area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}
