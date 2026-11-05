import java.util.Scanner;

public class OneLiner {
    public static void main (String[] args ){
      Scanner input = new Scanner (System.in);
      
      
      System.out.print ("How many item in your cart? ");
      int items = input.nextInt();
      
      String word = (items == 1)  ? "item"  :  "items";
      System.out.println("You have " + items + " " + word + ".");
      
      
      System.out.println("Enter two numbers:  ");
      int a = input.nextInt ();
      int b = input.nextInt ();
      int bigger = (a > b ) ?  a : b ;
      System.out.println("The bigger number  is " + bigger );
      
               }
        }
        
