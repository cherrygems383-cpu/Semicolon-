import java.util.Scanner;
public class ClassAverage{
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
      
    int total = 0; 
    int counter = 1; 
      
      while (counter <=4){
      
          System.out.print("Deposit for  day " + counter + ": ");
                int deposit = input.nextInt ();
                total = total + deposit ;
                      counter ++;
                      
                    
                
      
      
      }
        double average = total / 4.0;
        
        System.out.println("Total  saved : " + total );
        System.out.printf("Averrage per day : %.1f %n", average  );
     
    }
}


