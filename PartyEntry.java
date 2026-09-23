import java.util.Scanner;

public class PartyEntry {
public static void main (String []   args) {
Scanner input = new Scanner (System.in);

System.out.print (" Your age  : ") ;
int age = input.nextInt ();
System.out.print ( " Money in your wallet ");
int money = input.nextInt ();

if (age >= 18) {
        if (money >= 2000) {
            System.out.println("Welcome in!") ;
       }  else {
            System.out.println ("Sorry, entry costs 2000.") ;
            }
  } else {
        System.out.println("Sorry, 18 and over only.") ;
        }
  




      }
          }
    
