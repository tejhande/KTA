package c_overriding;

public class Dr {

	String drName;
	String drQualification;
	String drSpecialization;	
//	static String hospitalName = "JJ";
	static final String hospitalName = "fsr";
	
	void displayDr() {
		System.out.println("Dr Name= "+drName);
		System.out.println("Dr Qualification= "+drQualification);
		System.out.println("Dr Specialization= "+drSpecialization);
		System.out.println("Hospital Name= "+hospitalName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dr dr1 = new Dr();
		dr1.drName = "Elon";
		dr1.drQualification = "MBBS";
		dr1.drSpecialization = "Brain";
//		hospitalName = "sfd";
		
		dr1.displayDr();
	}

}
