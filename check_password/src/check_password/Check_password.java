package check_password;

import java.util.Scanner;

public class Check_password {

    public static void main(String[] args) {
        Scanner kode = new Scanner(System.in);
        System.out.println("skriv kode");
        String kodenavn = kode.nextLine();
        System.out.println("koden er " + kodenavn);
        System.out.println("længden på koden er " + kodenavn.length());

        if (kodenavn.length() <= 4 || kodenavn.length() >= 9) {
            System.out.println("koden skal være på 4-9 tegn");
        } else {
            System.out.println("koden er ok");
        }
        
        
        
        
    }
}
