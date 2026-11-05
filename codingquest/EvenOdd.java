import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args ){
      Scanner input = new Scanner (System.in);
      
      
    System.out.print("Enter a number: ") ;
    int number = input.nextInt();
    
   
    String evenOrOdd = ( number % 2 == 0 ) ?  "even" : "odd";
  
   System.out.println( number + " is " + evenOrOdd + " . ");
        }
   }
   
   
    
    
