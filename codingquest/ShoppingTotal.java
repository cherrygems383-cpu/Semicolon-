import java.util.Scanner;

public class ShoppingTotal{
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);   
        int total = 0 ;
        int items = 0;         
        
        System.out.print("Enter item price (0 to finish) :  ");
        int price = input.nextInt();  
        
        while (price != 0) {
        total += price ;
        items++;
        System.out.print("Enter item price (0 to finish) : ");
        price = input.nextInt();
        }        
        
        System.out.println("Items : " + items);
        System.out.println("Total: " + total );
    }
}


