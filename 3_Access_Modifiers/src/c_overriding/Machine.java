package c_overriding;

//Machine.java
class Machine {
 // Instance variables
 int machineId;
 String machineName;

 // Method to show type of work
 void typeOfWork() {
     System.out.println("Machine performs some work.");
 }
}

//PrintingMachine.java
class PrintingMachine extends Machine {
 // Overriding the typeOfWork method
 @Override
 void typeOfWork() {
     System.out.println("Printing Machine prints documents.");
 }

 public static void main(String[] args) {
     // Creating an object of PrintingMachine
     PrintingMachine pm = new PrintingMachine();
     pm.machineId = 1;
     pm.machineName = "Canon Printer";

     // Displaying the type of work
     pm.typeOfWork();  // This will call the overridden method
 }
}
