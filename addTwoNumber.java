import java.util.Scanner;
public class addTwoNumber {
    public static void main(String args[]){
        int a,b,sum;
        System.out.println("enter two number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        sum = a+b;
        System.out.println("addition " +(a+b));

    }
}
