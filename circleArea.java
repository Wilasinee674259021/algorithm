import java.util.Scanner;
public class circleArea {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius dagree: ");
        float radius = sc.nextFloat();
        float CircleArea = (3.14159f)*radius*radius;
        System.out.println("Area of circle that has radius "+radius+"meters is "+ CircleArea+"square meters");
        sc.close();
    }
}