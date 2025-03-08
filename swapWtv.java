import java.util.Scanner;
public class swapWtv {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two number");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();
        b=ref.nextInt();
        System.out.println("before swappint "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping "+a+" "+b);
    }
}
