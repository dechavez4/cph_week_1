package coin_flip_opgaven;

import java.util.Scanner;

public class Coin_flip_opgaven {

    public static void main(String[] args) {
        String stop = "stop";
        while (stop.equals("stop")) {
            int number, guess;
            String guess2;

            // opbevares et tal mellem 1 og 0.
            number = (int) (Math.random() * 2);
            //får brugeren til at vælge et tal mellem 1 og 0 
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);

            System.out.print("vælg mellem plat ellet krone. Enter 0 for plat and 1 for krone: ");
           
            guess2 = input.nextLine();

            // opretter en if statement, der tjekker om man har valgt korrekt. 
            if (guess2.equals(input2)){
                break;  
            } else {
                System.out.println("you lost");
               
            }
        }
    }
}
