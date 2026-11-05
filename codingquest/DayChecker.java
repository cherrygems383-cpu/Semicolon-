import java.util.Scanner;

public class DayChecker {
        public static void main (String []   args) {
                Scanner input = new Scanner (System.in);

                System.out.print("Give a day number (1 = Monday ... 7 = Sunday) : ");
                     int weekDay = input.nextInt();

                 int monday = 1;
            
                        if (weekDay  >= 1 && weekDay <= 5 ) {
                         System.out.println("School day. Get ready! ");
                          }
                            
                        if (weekDay == 6 || weekDay ==7) {
                          System.out.println("weekend sleep in");
                          }

                
              
                       if (weekDay < 1 || weekDay > 7){
                        System.out.println("This is not a valid day  ");
                        }
                             

           }
            }
