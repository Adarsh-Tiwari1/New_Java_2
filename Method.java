// Method 
/*
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
*/

/*
import java.util.Scanner;

class Method{
    public void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args){
        Method object = new Method();
        object.Sum();
    }
}
*/


/*
import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i < number; i++) { 
                if (number % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
*/
