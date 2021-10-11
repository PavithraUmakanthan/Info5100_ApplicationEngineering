package h2_Part1;

public class Shape {
    public String name;
    public String color;
    public int area;
    public int perimeter;

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getArea(){
        return area;
    }
    public int getPerimeter(){
        return perimeter;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    public Shape(){
    }
    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    public Shape(String name, String color, int area, int perimeter){
        this.name = name;
        this.color = color;
        this.area =area;
        this.perimeter = perimeter;
    }
    public String printShape(){
        return "The "+name+" has a "+color+" color";
    }
}


