import java.util.Scanner;
public class voteEligible {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        if(age>=18){
            System.out.println("eligible for votes");
        }
        else{
            System.out.println ("not eligible for vote");
        }
    }
}
