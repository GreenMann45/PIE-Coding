package piemain;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Calendar;

//while (!good){
// System.out.println("Please enter a number: ");
// try {
// num = reader.nextInt();
//  good = true;
//  }
//  catch(InputMismatchException e){
//  System.out.println ("Hey I said a number please!");
//  reader.nextLine();
//   }
//    }

//this shit better work


public class PIElearnsJAVA {
    //HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
    //ADDING A COMMENT TO TEST GREENS GUMB CODE	
    private static boolean isSetup = false;
    private static Calendar calendar;

    public static boolean isChristmas() {
        doSetup();

        return (calendar.get(Calendar.MONTH) == Calendar.DECEMBER) && (calendar.get(Calendar.DAY_OF_MONTH) == 25);
    }

    private static void doSetup() {
        if (!isSetup) {
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
        }
    }
    
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);

        boolean verifier = isChristmas();
        String response;

        if (verifier == true) {
            System.out.println("Merry Christmas!");
            response = reader.nextLine();
            //user input (user will say)
            response = response.toLowerCase();
            // lower(string ) = HELLO -> hello
            if(response.contains("merry") || response.contains("christmas")){
                //MAX WE USE .CONTAINS NOT .equalsIgnoreCase :DDDDDD
                System.out.println("Thanks.");
            }
            else{
                System.out.println("Ha gay");
            }
        }

        else{
            System.out.println("Fuck Hanukkah");
        }

        //WE DID IT!!!!!!!!!!!!

        reader.close();
	}
}
    
        // upper(string ) = hello -> HELLO
        //we do that christmas slender kid code <- DONE
        //start on christmas <- DONE
        //he starts out by saying "Merry Christmas!" <- DONE
        //you get a prompt [STRING]
        //strcmp(responde, "pene");
        //if you saying merry christmas ---> "Thanks."
        //end program <3
		//rememeber to throw excpetion if it aint christmas dumdum

        //selection = reader.nextLine(); reader.next();
        //C++: cout << "hbdsafjkhbaskdbf" << pene << endl;
        // c - out <<  
        // System.out.println("sadsadadadsasd") System.out.print("!1")
        //Python: print(f:"@kmasda")
        //if you see x's in the terminal then it's proud because he is a push to talk GRODY DUMDUM H
        //Green is a criminal H
        //We took the christmas code sharing is the christmas spirit after all H
        //this code is a trojan H

