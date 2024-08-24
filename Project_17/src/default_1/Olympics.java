package default_1;

public class Olympics {
    // Variables
    int id;
    String sportName;
    String sportsmanName;
    int rank;
    String country;
//    static String john;

    // Constructor 1 No arg
    public Olympics() {
        this.id = 0;
        this.sportName = "NA";
        this.sportsmanName = "NA";
        this.rank = 0;
        this.country = "NA";
    }

    // Constructor 2 with id and sportName
    public Olympics(int id, String sportName) {
        this.id = id;
        this.sportName = sportName;
        this.sportsmanName = "NA";
        this.rank = 0;
        this.country = "NA";
    }

    // Constructor 3 with all var
    public Olympics(int id, String sportName, String sportsmanName, int rank, String country) {
        this.id = id;
        this.sportName = sportName;
        this.sportsmanName = sportsmanName;
        this.rank = rank;
        this.country = country;
    }

    // display details method
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Sport Name: " + sportName);
        System.out.println("Sportsman Name: " + sportsmanName);
        System.out.println("Rank: " + rank);
        System.out.println("Country: " + country);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating objects
        Olympics olympics1 = new Olympics(); // Using no arg constructor
        Olympics olympics2 = new Olympics(1, "Swimming"); // Using constructor with id and sportName
        Olympics olympics3 = new Olympics(2, "Running", "Usain Bolt", 1, "Jamaica"); // Using constructor with all variables
        Olympics olympics4 = new Olympics(3, "Gymnastics", "Simone Biles", 1, "USA"); // Another object with all variables

        // Displaying details of each object
        olympics1.displayDetails();
        olympics2.displayDetails();
        olympics3.displayDetails();
        olympics4.displayDetails();
    }
}
