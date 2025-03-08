import java.util.Scanner;
public class oddNumber {
    public static void main(String args[]){
        int n;
        System.out.println("enter number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.print(i +" ");
        }

    }
}
