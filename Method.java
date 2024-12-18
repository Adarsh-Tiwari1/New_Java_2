
import java.util.Scanner;

class Method{
    public void add(){
        int a,b,c;
        System.out.println("Add Function is Called");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A : ");
        a = sc.nextInt();
        System.out.println("Enter Value of B : ");
        b = sc.nextInt();
        c = a+b;
        System.out.println("Addition :" + c);
    }
    public static void main(String[] args){
        Method obj = new Method();
        obj.add();
    }
}