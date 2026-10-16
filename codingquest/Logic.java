import java.util.Scanner;

public class Logic  {
        public static void main (String []   args) {
                Scanner input = new Scanner (System.in);

                    System.out.print("Age:  ") ;
                    int age = input.nextInt() ;
                    System.out.print("Do you have a ticket ?  (true / false):   ") ;
                    boolean hasTicket = input.nextBoolean () ;

                          if (age >= 12 &&  hasTicket) {
                          System.out.println("Enjoy the show ! ");
                          }

                          if (age  <  5 || age  >  65)  {
                          System.out.println("You get a free snack.  ");
                          }
                          if (! hasTicket ){
                          System.out.println("Please buy a ticket first .  ");
                          }

                          if (age >= 13  && age  <= 19) {
                                System.out.println("Teen discount applied.  ") ;
                            
        }
           }
            }
