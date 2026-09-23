import java.util.Scanner;

public class Rank {
public static void main (String []   args) {
Scanner input = new Scanner (System.in);

System.out.print (" Your points : ") ;
int points = input.nextInt ();

if (points >= 1000) {
        System.out.println ( " Rank: Legend ") ;
        } else if (points >=500) {
        System.out.println (" Rank: Champion") ;
        } else if (points >= 100) {
        System.out.println(" Rank: Player") ;
        } else {
        System.out.println("Rank: Rookie") ;
        }



      }
          }
    
