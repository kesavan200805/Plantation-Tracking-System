import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Plant> plants = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Plantation Tracking System =====");
            System.out.println("1. Add Plant");
            System.out.println("2. View Plants");
            System.out.println("3. Search Plant");
            System.out.println("4. Update Plant");
            System.out.println("5. Delete Plant");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPlant();
                    break;

                case 2:
                    viewPlants();
                    break;

                case 3:
                    searchPlant();
                    break;

                case 4:
                    updatePlant();
                    break;

                case 5:
                    deletePlant();
                    break;

                case 6:
                    System.out.println("Thank you for using Plantation Tracking System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    static void addPlant() {

        System.out.print("Enter Plant ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Plant Name: ");
        String plantName = scanner.nextLine();

        System.out.print("Enter Species: ");
        String species = scanner.nextLine();

        System.out.print("Enter Location: ");
        String location = scanner.nextLine();

        System.out.print("Enter Planting Date: ");
        String plantingDate = scanner.nextLine();

        Plant plant = new Plant(
                id,
                plantName,
                species,
                location,
                plantingDate
        );

        plants.add(plant);

        System.out.println("Plant added successfully!");
    }

    static void viewPlants() {

        if (plants.isEmpty()) {
            System.out.println("No plants found.");
            return;
        }

        System.out.println("\n===== Plant Records =====");

        for (Plant plant : plants) {
            System.out.println("ID: " + plant.getId());
            System.out.println("Name: " + plant.getPlantName());
            System.out.println("Species: " + plant.getSpecies());
            System.out.println("Location: " + plant.getLocation());
            System.out.println("Planting Date: " + plant.getPlantingDate());
            System.out.println("-------------------------");
        }
    }

    static void searchPlant() {

        System.out.print("Enter Plant ID to search: ");
        int id = scanner.nextInt();

        for (Plant plant : plants) {

            if (
