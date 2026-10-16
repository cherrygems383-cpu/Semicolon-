import java.util.Scanner;

public class DayChecker {
        public static void main (String []   args) {
                Scanner input = new Scanner (System.in);

                System.out.print("Give a day number: ");
                     int weekDay = input.nextInt();

                 int monday = 1;
            


                    if (weekDay < 1 || weekDay > 7) { 
                    System.out.println("This is not a valid day  ");
                    }

                    if (weekDay == 6 || weekDay ==7) {
                    System.out.println("weekday sleep in");

                    } 
                    else {
                    System.out.print("School day. Get ready !");
                    }



           }
            }
