
import java.util.Scanner;

public class Factors{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print(" Enter any number ");
int number=input.nextInt();
//     start         stop     step
for(int count=1; count <= number; count++){
  if (number % count == 0){
    System.out.print(count + " ");
}
 }
  }
   }


