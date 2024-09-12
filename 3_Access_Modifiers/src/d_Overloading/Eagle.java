package d_Overloading;

//Subclass Eagle extending Bird
class Eagle extends Bird {
@Override
void fly() {
   System.out.println("Eagle soars high in the sky.");
}

@Override
void makeSound() {
   System.out.println("Eagle screeches with a high-pitched call.");
}
}