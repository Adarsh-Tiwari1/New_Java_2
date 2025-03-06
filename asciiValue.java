import java.util.Scanner;
public class asciiValue {
    public static void main(String args[]){
        char ch;
        System.out.println("enter character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        int a=ch;
        System.out.println("ascii value of " +ch +"is "+a);



    }
}
