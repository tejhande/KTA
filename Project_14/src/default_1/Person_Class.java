package default_1;
// 1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person {
    String name;
    int age;

    void displayData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Person_Class {
    public static void main(String[] args) {
        // Create two instances of the "Person" class
        Person person1 = new Person();
        person1.name = "Tejas";
        person1.age = 21;
        person1.displayData();
        
        Person person2 = new Person();
        person2.name = "John";
        person2.age = 18;
        person2.displayData();

}
}


