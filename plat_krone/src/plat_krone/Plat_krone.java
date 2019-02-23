package plat_krone;
import static java.lang.System.currentTimeMillis;
import java.util.Scanner;
public class Plat_krone {

    public static void main(String[] args) {
                  //Scanner input = new Scanner(System.in);
                  System.out.print("Current Time in milliseconds = ");
            while(true){      
            int number = (int)(currentTimeMillis() % 2);
            Scanner scanner = new Scanner(System.in);
            
            if("true". equals("scanner") break){
        if(number == 0){
            System.out.println(number);
            System.out.println("Plat");
            
        }else{
            System.out.println(number);
            System.out.println("Krone");
        }
            }
       }
    }

  }
