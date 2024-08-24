package default_1;

class Students{
	int adNo;
	String sName;
	int batchCode;
	static String institute = "JBK";						// Class variable..
	
	Students(int adNo, String sName, int batchCode){		// Parameterized constructor..
		this.adNo = adNo;
		this.sName = sName;
		this.batchCode = batchCode;		
	}
	
	public void displayData() {								// Method to display data..
		System.out.println("Admission Number:- "+adNo);
		System.out.println("Students Name:- "+sName);
		System.out.println("Batch Code:- "+batchCode);
		System.out.println("Institute:- "+institute);
		System.out.println();
	}
	
	static void show() {									// Creating Static method
		System.out.println("Intstitute name with static method "+institute);
	}
}


public class Static_Example {

	public static void main(String[] args) {	
		// Creating Objects..
		Students s1 = new Students(001, "Tejas", 1197);
		Students s2 = new Students(002, "John", 1197);
		Students s3 = new Students(002, "Elon", 1198);
		Students s4 = new Students(002, "Ratan", 1199);
	
		// Displaying all info of the objects..
		s1.displayData();
		s2.displayData();
		s3.displayData();
		s4.displayData();
		
		Students.institute = "Java By Kiran";
		// Displaying all info of the objects After Changing value of class variable
		s1.displayData(); 
		s2.displayData();
		s3.displayData();
		s4.displayData();
		
		// Displaying Static Method
		Students.show();			
	}

}
