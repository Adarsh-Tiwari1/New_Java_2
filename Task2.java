/*
import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String[] str = new String[10];
        for(int i=0;i<str.length;i++){
            str[i] = sc.nextLine();
        }
        for(String Name : str){
            if(Name.endsWith("h")){
                System.out.println();
                System.out.println(Name);
            }
        }
    }
}
*/

/*
import java.util.Scanner;
class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String[] str = new String[10];
        for(int i=0;i<str.length;i++){
            str[i] = sc.nextLine();
        }
        for(int i=0;i<str.length;i++){
            if(str[i].endsWith("h")){
                System.out.println(" ");
                System.out.println(str[i]);
            }
        }
    }
}
*/

/*
import java.util.Scanner;
class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 String : ");
        String[] str = new String[10];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        for (int i = 0; i < str.length; i++) {
           if(str[i].contains("he")){
            System.out.println(" ");
            System.out.println(str[i]);
           }
        }
    }
}
*/

/*
class Task2{
    public static void main(String[] args) {
        String str = "this is test string";
        str = str.substring(8,12);
        System.out.println(str);
        System.out.println(str.length());
    }
}
*/

/*
class Task2{
    public static void main(String[] args) {
        String str = "Welcome";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
*/

/*
class Task2{
    public static void main(String[] args) {
        String str = "Welcome";
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
*/

/*
class Task2{
    public static void main(String[] args) {
        String str = "Welcome to Bhopal";
        String[] str1 = str.split(" ");
        for(String Name : str1){
            System.out.println(Name + " : Length : " + Name.length());
        }
        System.out.println("split Length : " + str1.length);
    }
}
*/

