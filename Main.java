import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Plant> plants = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== Plantation Tracking System =====");

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

        System.out.println("\nPlant added successfully!");
        System.out.println("Plant Name: " + plant.getPlantName());
        System.out.println("Species: " + plant.getSpecies());
        System.out.println("Location: " + plant.getLocation());
        System.out.println("Planting Date: " + plant.getPlantingDate());
    }
}
