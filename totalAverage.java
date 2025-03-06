import java.util.Scanner;
public class totalAverage {
    public static void main(String[] args) {
        int a,b ,c,d,e;
        System.out.println("enter marks");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        d=r.nextInt();
        e=r.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("total marks "+sum);
        double average =sum/5.0;
        System.out.println("Average marks" +average);
    }
}
