package a_Arrays;

public class FamousLocations {
    public static void main(String[] args) {
        String[] locations = {"Eiffel Tower", "Great Wall of China", "Taj Mahal", "Statue of Liberty", "Machu Picchu"};
        String searchLocation = "Taj Mahal";
        boolean found = false;
        
        for (String location : locations) {
            if (location.equals(searchLocation)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println(searchLocation + " is found in the array.");
        } else {
            System.out.println(searchLocation + " is not found in the array.");
        }
    }
}
