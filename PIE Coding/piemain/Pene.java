package piemain;

public class Pene {
    public static void main(String[] args) {

		int digit = 1; //tens digit
		int digit2 = 0; //ones digit
		int total = 0;

		for (int i=0;i<90;i++) { //there are 90 total double digits so it will loop 90 times

			total = digit + digit2; //where both digits are added together

			System.out.println(digit + "" + digit2 + ", " + digit + " + " + digit2 + " = " + total);

			digit2 = digit2 + 1; //adds 1 to the ones digit

			if (digit2 > 9) { 
				//if the ones digit goes above 9, then it will reset and the tens digit will go up by 1

				digit = digit + 1;//hola :D D D D 
				digit2 = 0;//hiii :D (im gonna brb and draw yeaaaaaa)
				//Gonna watch some Java tutorials now cuz I've never used this lmfao Ayoooo ;D;D;D;D;D;;D;D;D;D;D;D;q2ef

				//I can teach u boo boo ;  D D D
			}
		}
		//NIGGERS ARE DELICIOUS!!! !!!!!!I!!!UTtiathsnfnagjkbgajrgnrnla 
		System.out.println("Have a nice day!!"); //managed to figure it out, hooray!! 
		//H was here
    }
}