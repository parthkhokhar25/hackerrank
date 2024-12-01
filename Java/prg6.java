/*
Sample Input :
    2
    0 2 10
    5 3 5

Sample Output :

    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 98

*/

import java.util.*;
import java.io.*;

class prg6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
         
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            
            int currentValue = a;
           
            for (int j = 0; j < n; j++) {
                currentValue += (int)Math.pow(2, j) * b; 
             
                System.out.print(currentValue + " ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}

