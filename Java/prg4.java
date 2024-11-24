    /*
        inputs :
            42
            3.1415
            Welcome to HackerRank's Java tutorials!
        output :
            String: Welcome to HackerRank's Java tutorials!
            Double: 3.1415
            Int: 42 
        */

import java.util.Scanner;
        
public class prg4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    
        int intValue = scanner.nextInt(); 
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); 
        String stringValue = scanner.nextLine();

  
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
        
        scanner.close(); 
    

      
    }
}