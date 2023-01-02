/**
 * Programmer: Annikken
 * Program Description: This program simulates a dice game by using JOptionPane panels. It keeps track of points, doubles, and rolls done.
 * Issues: None
 */
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class diceGameAB {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		ImageIcon icon = new ImageIcon("dice.png");
		Random generator = new Random();

		int roll1;
		int roll2;
		int response;
		int begin;
		int point = 0;
		int doubleStreak = 0;
		int doublesRolled = 0;
		int timesRolled = 0;


		begin = JOptionPane.showConfirmDialog(null, "<html><h2 align='center'>Welcome to SUPER AWESOME Dice Game!!</h2><font color='blue'>Let's try to get 100 points! </p> </html>\nDo you want to play?", "Window Name", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

		//entrance to the loop
		while (begin == JOptionPane.YES_OPTION) {

			JOptionPane.showMessageDialog(null, "<html><h3>Rolling first dice...</h3></html>"); 

			roll1 = generator.nextInt(6)+1; //randomly choosing a number between 1 and 6
			point = point + roll1;
			timesRolled++; //keeps track of roll

			String titlePoint=Integer.toString(point); //titlePoint makes the points show up in the title 

			JOptionPane.showMessageDialog(null, "<html><h2>You rolled a " + roll1 + "!</h2></html>", "Points: " + titlePoint, JOptionPane.QUESTION_MESSAGE, icon); 

			JOptionPane.showMessageDialog(null, "<html><h3>Rolling second dice...</h3></html>"); 


			roll2 = generator.nextInt(6)+1;
			point = point + roll2;
			timesRolled++;

			titlePoint=Integer.toString(point);

			JOptionPane.showMessageDialog(null, "<html><h2>You rolled a " + roll2 + "!</h1></html>", "Points: " + titlePoint, JOptionPane.QUESTION_MESSAGE, icon);

			//if both rolls add up to 7 (unlucky 7)
			if (roll1 + roll2 == 7) {
				point-=7;
				titlePoint=Integer.toString(point);

				JOptionPane.showMessageDialog(null, "<html><h1 color='green'> Unlucky 7!!!</h1> <h2> Minus 7 points!<h2> </html>", "Points: " + titlePoint, JOptionPane.QUESTION_MESSAGE, icon);

			}

			//if double
			if (roll1 == roll2) { 
				doublesRolled++; //keeps track of doubles
				doubleStreak++;
				if (roll1 == 1) { //if roll1 is 1 (so they are both 1) then it is snake eyes
					point+=5;
					titlePoint=Integer.toString(point);

					JOptionPane.showMessageDialog(null, "<html><h1 color='yellow'> You rolled snake eyes!</h1> <h2> +5 points </h2> </html>", "Points: " + titlePoint, JOptionPane.QUESTION_MESSAGE, icon);

				}
				point++;
				titlePoint=Integer.toString(point);

				JOptionPane.showMessageDialog(null, "<html><h1 color='purple'> You rolled a double!</h1> <h2> +1 point! <h2> </html>", "Points: " + titlePoint, JOptionPane.QUESTION_MESSAGE, icon);

			}

			//if not a double
			else if (roll1 != roll2) {
				doubleStreak = 0; //the double streak gets reset back to 0
			}
			//if a double
			else {
				//if 3 doubles in a row
				if (doubleStreak == 3) {
					point-=5;
					titlePoint=Integer.toString(point);

					JOptionPane.showMessageDialog(null, "<html><h1 align='center'> 3 Doubles in a Row (Too many!)!! -5 points </h1></html>", "Points: " + titlePoint, JOptionPane.QUESTION_MESSAGE, icon);

				}
			}	


			response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Window Name", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

			//yes or no option box
			if (response == JOptionPane.NO_OPTION) {
				System.out.println("NO button clicked");
				break;
			}
			else if (response == JOptionPane.YES_OPTION) {
				System.out.println("YES button clicked");
			}
			else if (response == JOptionPane.CLOSED_OPTION) {
				System.out.println("CLOSE button clicked");
				break;
			}

		}

		if (begin == JOptionPane.YES_OPTION) {
			//<br> works the same as \n and keeps the html formatting!!
			JOptionPane.showMessageDialog(null, "<html><h1 align='center'>RESULTS:</h1><br>TOTAL POINTS: " + point + "<br>AMOUNT OF DICE ROLLED: " + timesRolled + "<br>DOUBLES ROLLED: " + doublesRolled, "Thank you for playing!", JOptionPane.QUESTION_MESSAGE, icon); 
		}

		reader.close(); //closed the reader

	}
}
