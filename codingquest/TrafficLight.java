import java.util.Scanner;

public class TrafficLight {
    public static void main (String[] args ){
      Scanner input = new Scanner (System.in);
       
       
       System.out.println("Light colour (R, Y, or G):");
       String light = input.nextLine();
        
        switch (light.toUpperCase()) {
            case "R": 
                System.out.println("Stop!");
                break;
            case "Y":
                System.out.println("Ready!");
                  break;
            case "G": 
              System.out.println("Go");
                break;
          default :
              System.out.println("That is not a traffic light colour. ");
       
      
              }
        }
}
    
    
