import java.util.Scanner;

public class SecretWord {
        public static void main (String []   args) {
                Scanner input = new Scanner (System.in);

          System.out.print (" Guess the secret word : ") ;
          String guess  = input.next();
          
          if (guess.equals("java")) {
          System.out.println("Correct ! You checked it.") ;
          } else { 
                  System.out.println("Wrong word . Try again later. ") ;
                  }
                  if (guess.equalsIgnoreCase ("JAVA")) {
                          System.out.println("(Ignoring capitals, that matches too.)");
          }                

        }
}
    
