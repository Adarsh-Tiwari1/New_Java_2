import java.util.Scanner;
public class areaOfSquare {
    public static void main(String[] args) {
        
    
    int side ,area;
    System.out.println("enter side square");
    Scanner r=new Scanner(System.in);
    side=r.nextInt();
    area=side*side;
     System.out.println("area of square "+area);
    
    }
}
