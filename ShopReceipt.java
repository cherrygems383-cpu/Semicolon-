public class ShopReceipt {
public static void main (String []   args) {

  String item = "Bread, Milk";
  int bread = 2;
  int milk = 1;
  double  Bread = 350.00;
  double  Milk = 900.00;
  
    System.out.printf("%-10s%5s%10s%n", "Item", "Qty", "Cost") ;
    System.out.printf("%-10s%3d%12.2f%n", "Bread", bread, Bread) ;
    System.out.printf("%-10s%3d%12.2f%n", "Milk", milk, Milk) ;
    System.out.printf("%-15s%10.2f","Total", Bread * bread + Milk) ;
    
    
    

      }
          }
    
