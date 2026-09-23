import java.util.Scanner;

public class Weather {
public static void main (String []   args) {
Scanner input = new Scanner (System.in);

System.out.print (" Temperature : ") ;
int temperature = input.nextInt ();

if (temperature <=0) {
        System.out.println ( " Freezing : stay indoors ") ;
        } else if (temperature <=15) {
        System.out.println ("Cold : wear a jacket") ;
        } else if (temperature <=25) {
        System.out.println("Pleasant : enjoy your day") ;
        } else if (temperature <=35){
        System.out.println( " warm : drink water ") ;
        } else {
        System.out.println("Hot : find some shade ") ;
        }



      }
          }
    
