public class Math {
public static void main (String []   args) {

int Total = 3725 ;
int hours = 3725 / 3600 ;
int remainder = 3725 % 3600 ;
int minutes = remainder / 60 ;
int seconds = remainder % 60 ;

    
System.out.printf("%d%6s%n ", hours, "hours" ) ;
System.out.printf("%3d%6s%n", minutes, "minutes" ) ;
System.out.printf("%d%6s", seconds, "seconds" ) ;
      }
          }
    
