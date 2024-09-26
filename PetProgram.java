package petcode;

import java.util.ArrayList;
import java.util.Scanner;

public class PetProgram {
    public static void main(String[] args) {
//Initialize a scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
//Prompt the user for the number of pets they own.
        System.out.println("How many pets do you own?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();
//Create an empty list to store the pets.
        ArrayList<Pets> pets = new ArrayList<>();
//Iterate through the number of pets:
//Prompt for pet type and name.
//Create a Pet object based on the type (e.g., Dog, Cat, Bird).
//Add the pet to the list.
        for (int i = 0; i < numberOfPets; i++) {
            System.out.printf("Enter details for pet #%d:\n", (i + 1));
            System.out.print("Type (dog, cat, bird, etc.): ");
            String type = scanner.nextLine().toLowerCase();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            Pets pet;
            switch (type) {
                case "dog" -> pet = new Dog(name);
                case "cat" -> pet = new Cat(name);
                case "bird" -> pet = new Bird(name);
                default -> {
                    System.out.println("Unknown pet type. Creating generic Pet.");
                    pet = new Pets(name);
                }
            }

            pets.add(pet);
        }
//Print a list of all pets and their corresponding sounds.
        System.out.println("\nYour pets:");
        for (Pets pet : pets) {
            System.out.println(pet.getName() + ": ");
            pet.speak();
        }
    }
}