package h2_Part1;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getArea(){
        return width*height;
    }
    public int getPerimeter() {
        return 2*(width+height);
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public Rectangle(int side){
        this.width = side;
        this.height = side;
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle( String name, String color, int width, int height){
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }
}
