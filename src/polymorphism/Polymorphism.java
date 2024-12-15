package polymorphism;

class Student{
    String name;
    int age;

    public void showInfo(String name){
        System.out.println(name);
    }

    public void showInfo(String name, int age){
        System.out.println(name + " " + age);
    }

    public void showInfo(int age){
        System.out.println(age);
    }
}

public class Polymorphism {
    public static void main(String[] args){
       Student s1 = new Student();
       s1.age = 23;
       s1.showInfo(s1.age);
    }
}
