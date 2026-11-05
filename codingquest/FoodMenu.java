import java.util.Scanner;

public class FoodMenu {
    public static void main (String[] args ){
      Scanner input = new Scanner (System.in);
       
      System.out.println("1. Jellof rice ") ;
      System.out.println("2. Suya") ;
      System.out.println("3. Puff-puff") ;
      System.out.print("Pick a number :  ") ;
      int choice = input.nextInt ();
      
        switch (choice) {
            case 1 : 
                System.out.println("Jellof rice : 1500") ;
                break;
            case  2 : 
                System.out.println("Suya :  800") ;
                break;
            case 3 :
              System.out.println("Puff-puff:  300") ;
              break;
          default :
            System.out.println("Sorry, we do not have that . ") ;
          }
      }
}
        

    
    
