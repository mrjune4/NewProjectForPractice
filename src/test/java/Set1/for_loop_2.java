package Set1;

public class for_loop_2 {
    public static void main(String[] args) {
        String[] cuisines = {"Italian", "Mexican", "Indian"};
        for (int day = 1; day <= 7; day++) {
            System.out.println("Day " + day + ":");
            int randomIndex = (int) (Math.random() * cuisines.length);
            String chosenCuisine = cuisines[randomIndex];

            System.out.println("   - Chosen: " + chosenCuisine);
        }
        }
    }



