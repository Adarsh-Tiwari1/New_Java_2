// return type are required .
// method name wiitten  CamelCase .
// formal argument . 

// Taking nothing Returning nothing 

/*
import java.util.Scanner;

class Method1{
    void add(){
        System.out.println("===Enter Addition Function===");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value A :");
        a = sc.nextInt();
        System.out.println("Enter Value A :");
        b = sc.nextInt();
        c = a+b;
        System.out.println("Addition :"+ c);
        System.out.println("===Exit Addition Function===");
    }
    public static void main(String[] ares){
        Method1 obj = new Method1();
        obj.add();
    }
}
*/


// static ke under static method direct access ho sakte hai aur nahi ho sakte hai.
// call default constructor automatically
// jvm call meain method : phir main call add method  : 
// stack : temperory : ram 

// taking something returning nothing.
/*
import java.util.Scanner;

class Method1{
    void add(int a,int b){ // formal parameter
    int c = a+b;
    System.out.println("Addition " + c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 ");
        int num2 = sc.nextInt();
        Method1 obj = new Method1();
        obj.add(num1,num2); //actual parameter
    }
}
*/

// taking nothing returning something

/*
import java.util.Scanner;
class Method1{
    int add(){ // formal parameter
    int num1,num2;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2 ");
        num2 = sc.nextInt();
        int c = num1+num2;
        return c;
    }
    public static void main(String[] args){
        Method1 obj = new Method1();
        int r = obj.add();
        System.out.println("Add " + r);
    }
}
*/

// taking something returning nothing 
/*
import java.util.Scanner;

class Method1{
    int add(int num1,int num2){ // formal parameter
    int c = num1+num2;
    return c;
    }
    public static void main(String[] args){
        Method1 obj = new Method1();
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2 ");
        num2 = sc.nextInt();

        int r = obj.add(num1,num2);
        System.out.println("Add : " + r);
    }
}
*/

// H.W. : wap to check given number is palindrom number or not using function . 
// H.W. : wap to check given number is even or not using function .
// H.W. : wap to check given number is strong number or not . 1!+4!+5! = 145
// H.W. : wap to check given string is anagram or not . Enter str1 : listen , Enter str2 : slient
// H.W. : wap to check given String is panagram or not . : all abcdefghijklmnopqrstuvwxyz : check length 


/*
import java.util.Scanner;

class Method1{
    void strong(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int num = sc.nextInt();

        int m = num;
        int res = 0;
        while(num!=0){
            int r = num%10;
            res = res*10+r;
            num = num/10;
        }
        if(m==res){
            System.out.println("This is Palindrome num");
        }else{
            System.out.println("This is not Palindrome num");
        }
    }
    public static void main(String[] args){
        Method1 obj = new Method1();
        obj.strong();
    }
}
*/

/*
import java.util.Scanner;
class Method1{
    int Odd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if(num%2==0){
            return num;
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        Method1 obj = new Method1();
        int r = obj.Odd();
        
        if(r==-1){
            System.out.println("Num id Odd");
        }else{
            System.out.println("Num id Even");
        }
    }
}
*/

/*
import java.util.Scanner;

class Method1{
    void strong(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong Number.");
        } else {
            System.out.println(originalNum + " is not a Strong Number.");
        }
    }
    public static void main(String[] args){
        Method1 obj = new Method1();
        obj.strong();
    }
}
*/

/*
import java.util.Scanner;
class Method1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean isFalse = false;
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter String : ");
        String str1 = sc.nextLine();
        if(str.length()==str1.length()){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==str1.charAt(i)){
                    System.out.println("Valid");
                    isFalse = true;
                    break;
                }
            }
        }else{
            System.out.println("not Valid");
        }
    }
}
*/