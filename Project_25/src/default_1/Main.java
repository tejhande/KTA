package default_1;

//Main class to test the implementation
public class Main {
public static void main(String[] args) {
   Bird eagle = new Eagle();
   Bird hawk = new Hawk();

   // Call methods on Eagle
   eagle.fly();
   eagle.makeSound();

   // Call methods on Hawk
   hawk.fly();
   hawk.makeSound();
}
}