// return type are required .
// method name wiitten  CamelCase .
// formal argument . 

// Taking nothing Returning nothing 


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

// static ke under static method direct access ho sakte hai aur nahi ho sakte hai.
// call default constructor automatically
// jvm call meain method : phir main call add method  : 
// stack : temperory : ram 