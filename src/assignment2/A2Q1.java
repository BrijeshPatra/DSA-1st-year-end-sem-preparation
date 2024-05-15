package assignment2;

class Person{
    String name;
    int age;

    void setData(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayData(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
public class A2Q1 {
    public static void main(String[] args) {
        Person ob1=new Person();
        Person ob2=new Person();
        ob1.setData("Brijesh",20);
        ob1.displayData();

        ob2.setData("Rahul",22);
        ob2.displayData();

    }
}
