package inheritance;

class Shape{
    String color;
    public void setColor(String color){
        this.color = color;
    }
}

// Hierarchical inheritance 
class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
}

// Hierarchical inheritance 
// Single level inheritance
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of triangle: " + (0.5 * l * h));
    }
}

// Multi level inheritance
class Equilateral extends Triangle{ 
    public void area(int s){
        System.out.println("Area of equilateral:"+ " " + s);
    }
}

public class Inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.setColor("red");
        System.out.println(t1.color);
    }
}
