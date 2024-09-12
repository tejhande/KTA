package d_Overloading;

//Subclass Hawk extending Bird
class Hawk extends Bird {
@Override
void fly() {
   System.out.println("Hawk glides smoothly.");
}

@Override
void makeSound() {
   System.out.println("Hawk emits a sharp, piercing scream.");
}
}
