/**
 * 
 */
package it211;

/**
 * @author Oscar
 *
 */
import java.util.Scanner; 



public class Money_converter { 

 

     public static void main(String args[]) {    

      Scanner scanner = new Scanner(System.in); 

       

      System.out.println("Enter Amount:");  

      double cash = scanner.nextDouble(); 

 

System.out.println("Select: 1 = CAD| 2 = Mex. Peso| 3 = UK Pounds| 4 = Yen| 5 = Francs| ");  

      double dom = scanner.nextDouble(); 

 

       

       

      if (dom == 1) { 

            double conv = cash * (1/1.468); 

            System.out.println("Amount in USD: " + conv); 

        } else if (dom == 2) { 

            double conv = cash * (1/9.5085); 

            System.out.println("Amount in USD: " + conv); 

        } else if (dom == 3) { 

            double conv = cash * 1.6433; 

            System.out.println("Amount in USD: " + conv); 

        } else if (dom == 4) { 

            double conv = cash * (1/104.92); 

            System.out.println("Amount in USD " + conv); 

        } else if (dom == 5) { 

            double conv = cash * (1/6.2561); 

            System.out.println("Amount in USD " + conv); 

 

 

        } else { 

             

            System.out.println("Error! Invalid Selection " ); 

        } 

       

     }
     
}