package piemain;
/*Programmer: Green Mann
Purpose: This is a very sassy program that only knows people who are in pie. I decided to code it because I was bored! :D
Issues: None, cuz i am epic progrmamr!
*/
import java.util.Scanner;

public class IamProgrammingBecauseitsFun {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String name; //only variable needed B)

        System.out.println("Hello kid! What's your name?");

        name = reader.nextLine();
        name = name.toLowerCase();
        //makes user input name and then converts that name lower case 4 loop'n'switch

        while (name.contains("kid")) {
            System.out.println("----------------------------------");
            System.out.println("Just cuz I called you a kid doesn't mean that it's your name!");

            System.out.println("Let's try again.");
            System.out.println("----------------------------------");
            System.out.println("Hello! What's your name?");

            name = reader.nextLine();
            name = name.toLowerCase();
        }

        //ayyyyyyy I didn't know you could do switch with string, sick!
        switch (name) {
            case ("max"):
                System.out.println("Hola PENE (H burped)");
                break;
            case ("proud"):
            case ("prouddom"):
                System.out.println(":japanese_goblin:");
                break;
            case ("h"):
                System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
                break;
            case ("green"):
            case ("green mann"):
                System.out.println("IT'S ME");
                break;
            default:
                System.out.println("I DON'T KNOW YOU BUDDY!");
                break;
        }
        reader.close(); //closed the reader
    }
}
