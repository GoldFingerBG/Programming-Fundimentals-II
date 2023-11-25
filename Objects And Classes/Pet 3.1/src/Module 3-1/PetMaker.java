/*******************
  Nathaniel Bucknor-Smartt
  09/19/2023
  Module 3.1
  This program will take in info about a pet and display
  information about that pet.
**********************/
import java.util.*;

public class PetMaker {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name, type, sound = "";

        Pet p1 = new Pet();
        p1.setName("Chris");
        p1.setPetType("Dog");
        p1.setSound("Arf");

        System.out.println(p1.getName());
        System.out.println(p1.getPetType());
        System.out.println(p1.getSound());
        System.out.println();
        System.out.println();

        System.out.println("Give me a pet name: ");
        name = scan.nextLine();
        System.out.println("Give me a pet type: ");
        type = scan.nextLine();
        System.out.println("What sound does it make?: ");
        sound = scan.nextLine();
        scan.close();
        System.out.println();
        System.out.println();

        Pet p2 = new Pet(name, type, sound);
        System.out.println(p2.getName());
        System.out.println(p2.getPetType());
        System.out.println(p2.getSound());

    }
}   






