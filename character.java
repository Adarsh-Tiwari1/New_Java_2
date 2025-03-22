import java.util.Scanner;
public class character {
    public static void main(String args[]){
        char ch;
        System.out.println("please enter character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(4);
        System.out.println(ch);

    }
}
