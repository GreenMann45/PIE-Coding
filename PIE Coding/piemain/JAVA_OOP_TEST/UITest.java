package piemain.JAVA_OOP_TEST;
//this is very cool! apparently you use a dot to refer to a different folder! did not know that :D

import java.util.Scanner;

public class UITest {
	//loooool that's what we'll do when we eventually work JEJ
	//LET'S GOOOOOOOOOOOOOOOOOOO
	// we gonna have to wait for proudito
	// he usually comes back from work around 7:30 PM (our time cuz we share timezones boobo :D)
	//actually gay and retarded he works on a sunday wtffffffffffffffffff
	//idfk he said he's busy rn D:
	//now we gotta figure out/try to do committing n shit idk
	//I mean do we even need GitHub rn? We could just run the program here iirc lol
	//yee yee i guess it saves on its own
	//try running the program
	//the other one you mean right?
	//this one works too
	//oh aight
	//lemme get a Java compiler first lololol
	//any you recommend?
	//lemme look at my extensions i remember vscode gave me a java pack or smth like that to start out
	//actually, did you see me run it?
	//ye lol
	//actually I gotta sign in with an account hold on
	//hiiiiii
	//this is my most recent coding project :DDDDD i just copy and pasted it from eclipse loloo
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);

		boolean exit = false;
		int selection;
		int kbSet = 0;
		int videoSet;
		String set;
		UIControls c;
		UIVideo v;
        //doesn't need 0 in int selection H
		//initialises the OOP
		c = new UIControls();
		v = new UIVideo();

		//fix this loop
		do {
			selection = 0;
			while (selection < 1 || selection > 4) {

				System.out.println("----------------------");
				System.out.println("Please type in a number below.");
				System.out.println("1. Controls");
				System.out.println("2. Video");
				System.out.println("3. Audio");
				System.out.println("4. Exit");
				System.out.println("----------------------");
				selection = reader.nextInt();

			}

			switch (selection) {
			///////////////////////////////////////////////////////////////////////////////////////////CONTROL SETTINGS///////////////
			case 1:
				while (kbSet > 2 || kbSet < 1) {
					System.out.println("CONTROLS");
					System.out.println("----------------------");
					System.out.println("Current keybindings");
					System.out.println("----------------------");
					System.out.println("Up: " + c.getUp());
					System.out.println("Left: " + c.getLeft());
					System.out.println("Down: " + c.getDown());
					System.out.println("Right: " + c.getRight());

					System.out.println("----------------------");
					System.out.println("Would you like to change your keybindings?");
					System.out.println("1. Yes");
					System.out.println("2. Go Back");
					System.out.println("----------------------");
					kbSet = reader.nextInt();
				}

				if (kbSet == 1) {
					System.out.println("----------------------");
					System.out.println("Set keybindings:");
					System.out.println("----------------------");

					System.out.println("Up:");
					set = reader.nextLine(); reader.next();
					c.setUp(set);

					System.out.println("Left:"); reader.next();
					set = reader.nextLine();
					c.setLeft(set);

					System.out.println("Down:"); reader.next();
					set = reader.nextLine();
					c.setDown(set);

					System.out.println("Right:"); reader.next();
					set = reader.nextLine();
					c.setRight(set);
				}

				else {
					kbSet = 0;
				}
				break;
				///////////////////////////////////////////////////////////////////////////////////////////VIDEO SETTINGS///////////////
			case 2:
				while (kbSet > 2 || kbSet < 1) {
					System.out.println("VIDEO");
					System.out.println("----------------------");
					System.out.println("Current resolution: " + v.getResolution());
					//this is where the OOP comes in
					System.out.println("Texture Quality: " + v.getTexture());
					//this is where the OOP comes in
					System.out.println("Shadow Quality: " + v.getShadow());
					//this is where the OOP comes in
					System.out.println("Particles: " + v.getParticle());
					//this is where the OOP comes in
					System.out.println("----------------------");
					System.out.println("What would you like to change?");
					System.out.println("1. Resolution");
					System.out.println("2. Texture Quality");
					System.out.println("3. Shadow Quality");
					System.out.println("4. Particles");
					System.out.println("5. Go Back");
					System.out.println("----------------------");
					kbSet = reader.nextInt();
				}

				switch (kbSet) {
				case 1:
					System.out.println("----------------------");
					System.out.println("Set Resolution (has to be typed for now):");
					System.out.println("----------------------");
					set = reader.nextLine(); reader.next();
					v.setResolution(set);
				case 2:
					System.out.println("----------------------");
					System.out.println("Set Texture Quality");
					System.out.println("----------------------");
					System.out.println("1. LOW");
					System.out.println("2. MEDIUM");
					System.out.println("3. HIGH");
					System.out.println("4. VERY HIGH");
					videoSet = reader.nextInt(); reader.next();
					switch (videoSet) {
					case 1:
						v.setTexture("LOW");
						break;
					case 2:
						v.setTexture("MEDIUM");
						break;
					case 3:
						v.setTexture("HIGH");
						break;
					case 4:
						v.setTexture("VERY HIGH");
						break;
					default:
						System.out.println("ERROR");
						break;
					}
				case 3:
					System.out.println("----------------------");
					System.out.println("Set Shadow Quality");
					System.out.println("----------------------");
					System.out.println("1. LOW");
					System.out.println("2. MEDIUM");
					System.out.println("3. HIGH");
					System.out.println("4. VERY HIGH");
					videoSet = reader.nextInt(); reader.next();
					switch (videoSet) {
					case 1:
						v.setShadow("LOW");
						break;
					case 2:
						v.setShadow("MEDIUM");
						break;
					case 3:
						v.setShadow("HIGH");
						break;
					case 4:
						v.setShadow("VERY HIGH");
						break;
					default:
						System.out.println("ERROR");
						break;
					}
				case 4:
					System.out.println("----------------------");
					System.out.println("Set Particle Amount");
					System.out.println("----------------------");
					System.out.println("1. NONE");
					System.out.println("2. MINIMAL");
					System.out.println("3. FAIR");
					System.out.println("4. ALL");
					videoSet = reader.nextInt(); reader.next();
					switch (videoSet) {
					case 1:
						v.setShadow("NONE");
						break;
					case 2:
						v.setShadow("MINIMAL");
						break;
					case 3:
						v.setShadow("FAIR");
						break;
					case 4:
						v.setShadow("ALL");
						break;
					default:
						System.out.println("ERROR");
						break;
					}
				case 5:
					kbSet = 0;
					break;
				default:
					break;
				}
				break;
				///////////////////////////////////////////////////////////////////////////////////////////AUDIO SETTINGS///////////////
			case 3:
				System.out.println("AUDIO");
				System.out.println("----------------------");
				System.out.println("Master volume:");
				//this is where the OOP comes in
				System.out.println("Sound volume:");
				//this is where the OOP comes in
				System.out.println("Music volume:");
				//this is where the OOP comes in
				System.out.println("Voice volume:");
				//this is where the OOP comes in
				break;
			case 4:
				System.out.println("You have exited the menu.");
				exit = true;
				break;
				//default case: INACCESSIBLE
			default:
				System.out.println("ERROR");
				break;
				
			}
		} while (!exit);

		System.out.println("CONTROLS:");
		System.out.println(c.getUp());
		System.out.println(c.getLeft());
		System.out.println(c.getDown());
		System.out.println(c.getRight());
		System.out.println("VIDEO:");
		System.out.println(v.getResolution());
		System.out.println(v.getTexture());
		System.out.println(v.getShadow());
		System.out.println(v.getParticle());
		
		System.out.println("Have a nice day!");
		reader.close();
	}

}

