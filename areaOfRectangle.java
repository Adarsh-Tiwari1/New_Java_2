import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args) {
        int l,b,area;
        System.out.println("enter value of side");
        Scanner r=new Scanner(System.in);
        l=r.nextInt();
        b=r.nextInt();
        area=l*b;
        System.out.println("area of rectangle "+area);
    }
    
}
