public class Receipt {
public static void main (String []   args) {

  String item = "Jellof rice";
  int plates = 3;
  double price = 1250.5;
  
  System.out.printf("Item:  %s%n",  item) ;
  System.out.printf("Plates: %d%n", plates) ;
  System.out.printf("Price: %.2f%n", price) ;
  System.out.printf("Total: %.2f%n", plates * price) ;
  System.out.println() ;
  System.out.printf( "%-12%5s%10s%n",  "Item", "Qty", "Cost" ) ;
  System.out.printf( "%-12%5s%10s%n",  item, plates, plates * price) ;
      }
          }
    
