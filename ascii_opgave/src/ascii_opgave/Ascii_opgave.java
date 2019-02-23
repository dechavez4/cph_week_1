package ascii_opgave;

import java.util.Scanner;

public class Ascii_opgave {  
    public static void main(String[] args) {
        String stop = "stop";
        while("stop".equals(stop)){
        Scanner bogstaver = new Scanner(System.in);
        System.out.println("indtast et tegn");
        
        char bogstav = bogstaver.nextLine().charAt(0);

        System.out.println("det indtastet bogstav er " + bogstav);

        if(bogstav >64 && bogstav <91 ) {

            System.out.println("det er et stort bogstav");

        }else if(bogstav >96 && bogstav <123 ) {
            
            System.out.println("det er et lille bogstav bogstav");
        }else if(bogstav >47 && bogstav <58){
            
            System.out.println("dette er et tal");
        }else if(bogstav =='#' || bogstav =='!' || bogstav == '+' || bogstav == '\\'){
        
            System.out.println("tegnet er ikke kendt af dette program");
        }
        }
    }
}
