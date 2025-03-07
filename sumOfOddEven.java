import java.util.Scanner;
public class sumOfOddEven {
    public static void main(String args[]){
        int n,sum=0;
        System.out.println("enter number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0){
            for(int i=0;i<=n;i++){
                sum=sum+1;
            }
            System.out.println("sum of even number "+ sum);

        }

    }
}
