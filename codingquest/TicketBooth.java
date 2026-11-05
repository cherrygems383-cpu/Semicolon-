import java.util.Scanner;

public class TicketBooth {
    public static void main (String[] args ){
      Scanner input = new Scanner (System.in);
     
     String category;
     int ticket;
    
          System.out.print("Your age: ");
          int age = input.nextInt();
        System.out.println("Snacks:  1)  Popcorn 300  2)   Drink 200   3) None ");
        System.out.print("Your Choice: ");
       int choice = input.nextInt();
     
     
           
     
       
         
               if (age < 13) {
               category = "Child";
                  ticket = 500;
          }
            else if  (age < 18){
              category = "Teenager";
                ticket = 800;
          }
           else if 
               (age < 60 ){
                category = "Adult";
                ticket = 1200;
        }
          else {
           category = "Senior";
              ticket = 600;
              
              
     }           
     
     System.out.println("----  RECEIPT ----");
     
     System.out.println(category + " " +  "ticket : " + ticket);
       
       switch (choice) {
              case 1:
               
                  System.out.printf("Popcorn : %s%n%s%d%n ", "300", "Total : ", ticket + 300 );
                  break;
            case 2:
                 
                System.out.printf("Drink :  %s%n%s%d%n ",  "200", "Total : ", ticket + 200 );
                break;
            case 3: 
              System.out.printf("None : %s%n%s%d%n ", "0", "Total : ", ticket + 0 );
                break;
        default :
            System.out.print("Invalid Choice, no snack added. ");
            
            }
            
            
    }
 }          
         

