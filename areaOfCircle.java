import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
       final double pi=3.14 ,area;
       int r;
       System.out.println("enter radius of circle");
       Scanner ref=new Scanner(System.in);
       r=ref.nextInt();
       area=pi*r*r;
       System.out.println("area of circle "+area);

    }
    
}
