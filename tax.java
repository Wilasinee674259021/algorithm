import java.util.Scanner;
public class tax {
 public static void main(String[]args){
     Scanner salaryScan = new Scanner(System.in);
     System.out.print("Enter your solory : ");
      float salaryEnter = salaryScan.nextFloat();
      float tax = (salaryEnter*10)/100;
      System.out.println("You tax = " + tax);
      salaryScan.close();
    }
}
