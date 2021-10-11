package h2_Part1;

public class Square extends Shape{

    public int side;

    public int getSide(){
        return side;
    }
    public int getArea() {
        return side*side;
    }
    public int getPerimeter() {
        return 4*side;
    }
    public void setSide(){
        this.side = side;
    }
    public Square(int side){
        this.side = side;
    }
    public Square(String name, String color, int side){
        this.name = name;
        this.color = color;
        this.side = side;
    }
}
