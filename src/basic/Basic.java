class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("I'm writing with my " + this.color + " " + this.type + " pen.");
    }

    public void printColor(){
        System.out.println("My pen color is " + this.color + ".");
    }
}

class Student{
    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    // Default constructor (no parameters)
    Student(){

    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Basic{
    public static void main(String[] args) {

        Student student1 = new Student("john", 25);
        Student student2 = new Student(student1);
        student1.printInfo();
        student2.printInfo();
    }
}