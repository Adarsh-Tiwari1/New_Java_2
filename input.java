import java.util.Scanner;
public class input {
    public static void main(String args[]){
    int a ,b;
    System.out.println("enter two number");
    Scanner obj = new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("addition = " + (a+b));
}
}
