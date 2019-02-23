package andengradsligning;

import java.util.Scanner;

public class Andengradsligning {

    public static void main(String[] args) {

        // double d = a.sqrt(2) + bx + c;      
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv værdien for A");
        double a = scanner.nextDouble();

        System.out.println("skriv værdien for B");
        double b = scanner.nextDouble();

        System.out.println("skriv værdien for C");
        double c = scanner.nextDouble();

        double d = (Math.pow(b, 2) - (4 * a * c));
        System.out.println(d);

        if(d == 0){
            double e = -b / 2 * a;
            System.out.println("x er lige med :");
            System.out.println(e);            
        }else if(d > 0){
            double f = (-b + (d)) / 2 * a;
            System.out.println("x1 er lige med:");
            
            System.out.println(f);       
    
            double g = (-b - (d)) / 2 * a;
            System.out.println("x2 er lige med:");
            System.out.println(g);
        }else if (d < 0 ){
            System.out.println("der ingen reelle rødder, men derimod to konjugerede komplekse rødder.");
        }
    }

}
