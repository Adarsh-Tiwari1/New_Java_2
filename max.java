import java.util.Scanner;
public class max {
    public static void main(String args[]){
      /*   int a=10,b=20;
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }   */

        int a,b;
        System.out.println("enter two number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
       // System.out.println(a);
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }   
    }
   

    
}
