// array ke under length ek property hoti hai, String ke under length()  ek function hota hai.

/*
class Str{
    public static void main(String[] args){
        String str = "Java"; // SCP
        String str2 = "Java"; // SCP
        System.out.println(str == str2);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "Java"; // SCP
        String str2 = "Java"; // SCP
        System.out.println(str.equals(str2));
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = new String("Java");  // heap area
        String str2 = new String("Java"); 
        System.out.println(str == str2);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = new String("Java");  // heap area
        String str2 = new String("Java"); 
        System.out.println(str.equals(str2));
    }
}
*/

/*
import java.util.Scanner;
class Str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter String : ");
        String str2 = sc.nextLine();
        if(str == str2){
            System.out.println("String are equal ");
        }else{
            System.out.println("String are Not equal ");
        }
    }
}
*/

/*
import java.util.Scanner;
class Str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter String : ");
        String str2 = sc.nextLine();
        if(str.equals(str2)){
            System.out.println("String are equal ");
        }else{
            System.out.println("String are Not equal ");
        }
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "Hello I Am Adarsh 99 And My Email Id @adarsh.com7";
        int CharCount = 0;
        int DigitCount = 0;
        int SpecialChaarCoutn = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i) <= 'z' 
            || str.charAt(i)>='A' && str.charAt(i) <= 'Z'){
                CharCount++;
            } else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                DigitCount++;
            } else{
                SpecialChaarCoutn++;
            }
        }
        System.out.println("Number of Alphabets in the string is : " + CharCount);
        System.out.println("Number of Digits in the string is : " + DigitCount);
        System.out.println("Number of Special characters in the string is : " + SpecialChaarCoutn);
    }
}
*/

/*
import java.util.Scanner;
class Str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter string : ");
        String str = sc.nextLine();
        int CharCount = 0;
        int DigitCount = 0;
        int SpecialChaarCoutn = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i) <= 'z' 
            || str.charAt(i)>='A' && str.charAt(i) <= 'Z'){
                CharCount++;
            } else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                DigitCount++;
            } else{
                SpecialChaarCoutn++;
            }
        }
        System.out.println("Number of Alphabets in the string is : " + CharCount);
        System.out.println("Number of Digits in the string is : " + DigitCount);
        System.out.println("Number of Special characters in the string is : " + SpecialChaarCoutn);
    }
}
*/


/*
import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the string: ");
        String inputString = scanner.nextLine();

        int alphabets = 0;
        int digits = 0;
        int specialChars = 0;
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }
        System.out.println("The string is: " + inputString);
        System.out.println("Number of alphabets: " + alphabets);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of special characters: " + specialChars);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "Welcome to w3resource.com";
        int vowelCount = 0;
        int consoCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
            str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                vowelCount++;
            }else if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
              str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                continue;
            }
            consoCount++;
            }
        }
        System.out.println("The total number of vowel in the string is : " + vowelCount);
        System.out.println("The total number of consonant in the string is : " + consoCount);
    }
}
*/

/*
import java.util.Scanner;
class Str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int vowelCount = 0;
        int consoCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
            str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                vowelCount++;
            }else if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
              str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                continue;
            }
            consoCount++;
            }
        }
          System.out.println(vowelCount);
          System.out.println(consoCount);
    }
}
*/


/*
class Str{
    public static void main(String[] args) {
        String str = "This is a test string";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='i'){
                count++;
            }
        }
        System.out.println("The frequency of i is : " + count);
    }
}
*/
