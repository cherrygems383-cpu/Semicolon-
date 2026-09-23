import java.util.Scanner;

public class Greeter {
public static void main (String []   args) {
Scanner input = new Scanner (System.in) ;

System.out.print ("what is your name ? " ) ;
String name = input.nextLine ();

System.out.print ("How old are you ? ");
int age = input.nextInt ();

System.out.print ("Your height in meters ? ");
double height = input.nextDouble ();


System.out.println ("Hello " + name + "! Next year you will be " + (age + 1 ) + ".");
System.out.printf("You are %.2f m tall.%n", height);








      }
          }
    
