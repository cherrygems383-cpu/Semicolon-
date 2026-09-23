import java.util.Scanner;

public class ExamResult {
public static void main (String []   args) {
Scanner input = new Scanner (System.in);

System.out.print ("Exam mark (0-100):") ;
int mark = input.nextInt () ;
System.out.print ("Attendance percentage:") ;
int attendance = input.nextInt ();

if (mark >=50) {
        if (attendance >=75) {
            System.out.println("Pass");
            } else {
            System.out.println("Pass, but attendance is too low.");
             }
        } else {
        System.out.println ("Fail") ;
        }





      }
          }
    
