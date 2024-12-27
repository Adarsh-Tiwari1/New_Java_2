// 1 - (a)
/*
class string{
    public static void main(String[] args){
        String str = "Betty got a bit of bitter better butter";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='b'){
                System.out.print("Index of " + str.charAt(i) + " = " + i + "\t");
            }
            else if(str.charAt(i)=='t'){
                System.out.print("Index of " + str.charAt(i) + " = " + i + "\t");
            }
        }
    }
}
*/

// 1 - (b)
/*
class string{
    public static void main(String[] args){
        String str = "Betty got a bit of bitter better butter";

        String[] str1 = str.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i] + " =  " + str1[i].length());
        }
    }
}
*/




// 3
/*
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10]
        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        
        System.out.println("\nNames containing 'he':");
        boolean found = false;
        for (String name : names) {
            if (name.toLowerCase().contains("he")) {
                System.out.println(name);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No names contain 'he'.");
        }

        scanner.close();
    }
}
*/




// 4
/*
class string{
    public static void main(String[] args) {
        String str = "Welcome";
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString(); 
        System.out.println(str1); 
    }
}
*/



// 5
/*
class string{
    public static void main(String[] args){
        String str = "Welcome To Bhopal";
        boolean flag = false;
        String[] str1 = str.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.println(" String Word Length is :" + str1.length);
            flag = true;
            break;
        }
    }
}
*/


// Palindrom String .


class string{
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static boolean isPalindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "adarsh";
        System.out.println(isPalindrom(str));
    }
}