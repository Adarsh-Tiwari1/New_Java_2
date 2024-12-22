

/*
class Str{
    public static void main(String[] args){
        String str = "Adarsh Tiwari";
        System.out.println(str.substring(5));
        System.out.println(str.substring(7));
        System.out.println(str.substring(0,7));  // Return Type: String
        System.out.println(str.substring(1,7));
        System.out.println(str.substring(2,6));
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "Adarsh Tiwari";
        System.out.println(str.subSequence(1,5));  // Return Type: CharSequence
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "Adarsh Tiwari";
        System.out.println(str.length()); // Return Type: int
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        int string = 10;
        int String = 100;
        System.out.println(string);
        System.out.println(String);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "00,00100";
        System.out.println(str.length());
        System.out.println(str);

    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = "java"; // creating string by java string literal
        char[] ch = {'j','a','v','a'};
        String s2 = new String(ch); // converting char array to string
        String s3 = new String("example");// creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        char ch[] = {'A','D','A','R','S','H'};
        ch[0] = 'X';
        String str = new String(ch);
        System.out.println(ch);
        System.out.println(ch.length);
        System.out.println(ch[0]);
        System.out.println(ch);
    }
}
*/

/*     // Compile Time Error .
class Str{
    public static void main(String[] args){
        char ch[] = {'a','d'};
        int str = new int(ch); // Primitive types (like int) cannot be instantiated with the new keyword. 
        System.out.println(ch); 
    }
}
*/

// Java StringBuilder class is used to create mutable (modifiable) String.

// StringBuilder()	: It creates an empty String Builder with the initial capacity of 16 .

//  In Java, a StringBuilder is a mutable sequence of characters, which allows you to modify a string without creating a new object

// StringBuilder append() method

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Adarsh");
        System.out.println(sb.append(" Tiwari"));
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Adarsh");
        sb.append(" Kumar Tiwari");
        System.out.println(sb);
    }
}
*/

// StringBuilder replace() method
/*
class Str {
    public static void main(String[] args) {
        StringBuilder se = new StringBuilder("hello");
        se.replace(1,3,"java");
        System.out.println(se);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(0,3,"Ada");
        System.out.println(sb);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Adarsh Kumar Tiwari");
        sb.replace(0,sb.length(),"Hello Java");
        System.out.println(sb);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java is fun");
        String replaced = sb.toString().replaceAll("Java", "Hello");
        sb = new StringBuffer(replaced);
        System.out.println(sb);
    }
}
*/

// replaceAll() method used in String .

/*
class Str {
    public static void main(String[] args) {
        String str = "Hello Java";
        str = str.replaceAll("Hello", "Hii"); // Capture the modified string
        System.out.println(str); 
    }
}
*/

// StringBuilder delete() method
/*
class Str {
    public static void main(String[] args) {
        StringBuilder se = new StringBuilder("hello");
        StringBuilder sb = new StringBuilder("hello");
        se.delete(1,3);
        sb.delete(0,3);
        System.out.println(se);
        System.out.println(sb);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(0,3);
        System.out.println(sb);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "Hello";
        str = str.substring(3);
        System.out.println(str);
    }
}
*/


//StringBuilder insert() method
/*
class Str {
    public static void main(String[] args) {
        StringBuilder se = new StringBuilder("adarsh");
        se.insert(5," java ");
        System.out.println(se);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Adarsh Tiwari ");
        sb.insert(6," Kumar");
        System.out.println(sb);
    }
}
*/


// StringBuilder reverse() method
/*
class Str {
    public static void main(String[] args) {
        StringBuilder se = new StringBuilder("adarsh");
        se.reverse();
        System.out.println(se);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java is fun");
        String replaced = sb.toString().replaceAll("Java", "Hello");
        sb = new StringBuffer(replaced);
        System.out.println(sb);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello Adarsh");
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}
*/


// StringBuilder capacity() method 

/*
The capacity() method of StringBuilder class returns the current capacity of the Builder.
 The default capacity of the Builder is 16. If the number of character increases from
 its current capacity, it increases the capacity by (old capacity*2)+2. For example if
 your current capacity is 16, it will be (16*2)+2=34.
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder se = new StringBuilder();
        System.out.println(se.capacity());

        se.append("adarsh");
        System.out.println(se.capacity());

        se.append("hello mr adarsh kumar tiwari");
        System.out.println(se.capacity());
    }
}
*/

// convert StringBuilder to String() .
/*
class Str {
    public static void main(String[] args) {
        StringBuilder se = new StringBuilder();
        System.out.println(se.capacity());

        se.append("adarsh");
        System.out.println(se.capacity());

        se.append("hello mr adarsh kumar tiwari");
        System.out.println(se.capacity());

        String finalString = se.toString(); // convert
        System.out.println(finalString);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.ensureCapacity(100); // allocate capacity
        System.out.println(sb.capacity());
        sb.trimToSize(); //  deallocate capacity
        System.out.println(sb.capacity());
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("adarsh");
        System.out.println(sb.capacity()); // default capacity of 16 characters.

        System.out.println(sb.length());
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.setCharAt(0,'y');
        System.out.println(sb);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Java");
        sb.setCharAt(0,'A');
        sb.setCharAt(1,'A');
        System.out.println(sb);

    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.insert(2,"xxx");         // Indexing in StringBuilder starts from 0
        System.out.println(sb);
        sb.insert(2,1005);  //Supported Data Types: The insert() method can handle various data types such as : Strings, Integers, Characters, Booleans, Floating-point numbers
        System.out.println(sb);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("adarsh adarsh");
        sb.setLength(10);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("adarsh    ");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("adarsh ");
        sb.append("tiwari");
        System.out.println(sb);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        final String sb = new String("adarsh ");       
        System.out.println(sb + "Tiwari");
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = new String("adarsh");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = "adarsh";
        String s2 = s1.toString();
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = new String("adarsh");
        String s2 = new String("adarsh");
        System.out.println(s1==s2);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = ("adarsh");
        String s2 = ("adarsh");
        System.out.println(s1==s2);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = new String("adarsh");
        String s2 = ("adarsh");
        System.out.println(s1==s2);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(args.length);
        System.out.println(arr.length);
       // System.out.println(args.length()); only use String method
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        byte[] b = {97,98,99,100};
        String s1 = new String(b);
        System.out.println(s1);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        byte[] b = {97,98,99,100};
        System.out.println(b);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = ("   adarsh  ");
        System.out.println(s1.length());
        System.out.println(s1.trim().length());
    }
}
*/

// CharAt Example
/*
class Str {
    public static void main(String[] args) {
       String name = "adarsh";
       char ch = name.charAt(4); // returns the char value at the 4th index
        System.out.println(ch);
    }
}
*/


// find first and last character
/*
class Str {
    public static void main(String[] args) {
        String str = "welcome to my home";
        int length = str.length();
        System.out.println("character at 0 index is = " + str.charAt(0));
        System.out.println("character at last index is = " + str.charAt(length-1));
    }
}
*/


// Print odd index using charAt() method
/*
class Str {
    public static void main(String[] args) {
        String str = "welcome";
        for(int i=0;i<str.length()-1;i++){
            if(i%2!=0){
                System.out.println("Char at " + i + " place = " + str.charAt(i));
            }
        }
    }
}
*/


// counting frequency of character
/*
class Str {
    public static void main(String[] args) {
        String str = "adarsh";
        int count = 0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("frequency of a is : " + count);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String str = "adarsh tiwari";
        for (int i = 0; i < str.length()-1; i++) {
            if(i % 2 == 0){
                System.out.println( i + " even index string = " + str.charAt(i));
            }
        }
    }
}
*/

// compareTo()
/*
class Str {
    public static void main(String[] args) {
        String s1 = "adarsh";
        String s2 = "adarsh";
        String s3 = "tiwari";
        System.out.println(s1.compareTo(s1));
        System.out.println(s1.compareTo(s3));
    }
}
*/

// concat()
/*
class Str {
    public static void main(String[] args) {
        String s1 = "adarsh";
        String s2 = " kumar";
        String s3 = " tiwari";
        String s4 = s1.concat(s2).concat(s3);
        System.out.println(s4);

    }
}
*/

// equals
/*
class Str {
    public static void main(String[] args) {
        String s1 = "adarsh";
        String s2 = "adarsh";
        String s3 = "tiwari";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
*/

// equalsIgnoreCase()
/*
class Str {
    public static void main(String[] args) {
        String s1 = "ADARSH";
        String s2 = "adarsh";
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
*/


// replaceAll()
/*
class Str {
    public static void main(String[] args) {
        String s1 = "adarsh";
        String s2 = "10001";
        System.out.println(s1.replaceAll("a","x"));
        System.out.println(s2.replaceAll("0","5"));
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s2 = "10001";
        String s1 = s2.replaceAll("0","5");
        int s3 = Integer.parseInt(s1); // convert string to integer
        System.out.println(s3);
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "01215";
        String str1 = str.replaceAll("0","x");
        int i = Integer.parseInt(str1); // "x1215" is not a valid integer format, this will throw a NumberFormatException.
        System.out.println(i);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String s1 = "java"; // creating string by java string literal
        char[] ch = {'j','a','v','a'};
        String s2 = new String(ch); // converting char array to string
        String s3 = new String("example");// creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a>b && c<d);
        System.out.println(!(a>=b && c<d));
        System.out.println(!((a>b && c>d || a>c)));
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        int x = 5;
        x = 10;
        int y = 10;
        y = 5;
        System.out.println(x);
        System.out.println(y);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        char[] a = {65,66,67,68,69,70};
        char[] b = {97,98,99,100};

        char[] arr = new char[50];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        a = arr;
        System.out.println(a);
    }
}
*/


// String : immutable
// StringBuffer : mutable    // fast
// StringBuilder : mutable

/*
class Str {
    public static void main(String[] args) {
        String s1 = "adarsh";
        s1 = "tiwari";
        System.out.println(s1);
    }
}
*/

/*
import java.util.Scanner;

class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if(i%2==0){
                System.out.println(string.charAt(i));
            }
        }
    }
}
*/

/*
class Str{
    public static void main(String[] are){
        String str = "Adarsh Kumar Tiwari";
        String[] words = str.split(" ");
        for(String word : words){
            System.out.println(word);
        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String string = "adarsh kumar tiwari";
        String string1 = "adarsh, kumar, tiwari";

         String arr[] = string.split(",");
         String arr1[] = string1.split("");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
*/

/*
import java.util.Scanner;
class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String newString = str1.trim()+str2;
        System.out.println(newString.length());

        System.out.println(str1+str2);

    }
}
*/

// string is a most use library class in java .
// in java string is a reference type , any time you are creating a string means you are creating object.

//  is a sequence is a character , string can contain one are mote characters . ex :string gender = "M"
// string class provide different ways to create string , 13 different days to create string . some of the ways are ,

// char[] = {'v','a'}; // char convert to string
// string myName = new string(name)

//2. string email = "adarshrewa45@gmai.com";
// string officialEmail = new String(email);

//3. the third way to equivalent  second way
// String personalEmail = new String("adarshrewa45@gmail.com);

// java provides to different storage area to work with string one string pool and second is heap memory.
// when the creation string using double codes than that string will we string store in pool;
// when we create using new operator when that string will be stored in heap memory.
// new operator se heap memory me store hoti hai, string pool heap ke under bna hai ,

//  String are immutable , means once created it can not be changed.
// the sequence of character that is representing the string can not be changed


/*
class Str {
    public static void main(String[] args) {
        String name = "adarsh";
        String name1 = "adarsh";
        if(name == name1){
            System.out.println("Same name");  // stored in pool
        }else{
            System.out.println("not same");
        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String name = "adarsh";  // stored in pool memory
        String name1 = new String("adarsh") ;  // stored in heap memory
        if(name == name1){
            System.out.println("Same name");
        }else{
            System.out.println("not same");
        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String str = "adarsh tiwari";
        String str1 = "ADARSH TIWARI";
        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(0)); // return the Unicode point at specified index.
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.subSequence(0,10));
        System.out.println(str.substring(5));
    }
}
*/

// print each character of string
/*
class Str {
    public static void main(String[] args) {
        String name = "adarsh";
        for (int i = 0; i < name.length(); i++) {
            char nameChar = name.charAt(i);
            System.out.print(nameChar);
            if(i !=name.length() - 1){
                System.out.print(", ");
            }

        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String name = "adarsh";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < name.length(); i++) {
            char nameChar = name.charAt(i);
            System.out.print(nameChar);
            if(i !=name.length() - 1){
                System.out.print(" ");
            }
        }
    }
}
*/


// wap to check the given character is present is the given string.
/*
import java.util.Scanner;
class Str{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        System.out.println("enter find search character");
        char ch = sc.nextLine().charAt(0);
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                System.out.println("found");
            }else{
                System.out.println("not found");
            }
        }
    }
}
*/

/*
import java.util.Scanner;
class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        System.out.println("search the char to search in string");
        char searchEle = sc.nextLine().charAt(0);
        boolean isFound = false;
        for (int i = 0; i < input.length(); i++) {
            if(searchEle == input.charAt(i)){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }
    }
}
*/



// wap to count the occurrence of given character in the String
/*
import java.util.Scanner;
class Str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to count: ");
        char charToCount = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToCount) {
                count++;
            }
        }
        System.out.println("The character '" + charToCount + "' appears " + count + " times in the string.");
    }
}
*/

// wap to print the last index of given character in the String
/*
class Str {
    public static void main(String[] args) {
        String input = "java ka baba";
        char given = 'a';
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==given){
                System.out.println("index=" + i );
            }
        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String input = "java ka baba";
        char given = 'a';
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==given){
                index=i;
            }
        }
        System.out.println(index);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String input = "java ka baba";
        char given = 'b';
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==given){
                index=i;
                break;
            }
        }
        System.out.println(index);
        System.out.println(input.indexOf('b')); 
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "Hello I Am Adarsh Kumar Tiwari";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String str = "Hello I Am Adarsh Kumar Tiwari";
        String[] str1 = str.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i] + str1.length());
        }
    }
}
*/


// wap to find the smallest String form the given
/*
public class Str {
    public static void main(String[] args) {
        String[] names = {
            "Piyush Sahu", "Harish Chourasiya", "Anjali Prajapati", "Gauri Dahake",
            "Ankita Bobde", "Shiddharth Patel", "Madhur Sahu", "Aaditya Rajawat",
            "Akshay Mishra", "Devansh Sharma", "Kanishka singh kushwaha",
            "Anushka Shrivastava", "Devanshi Choudhary", "Devanshi bamaliya",
            "Divyansh Malviya", "Adarsh Tiwari", "Aatmik kushwaha", "Ankit Gujre",
            "Shanawaz Alam", "Raman Jatav", "Aditya Tanwani", "Mohd Nadir Ansari",
            "Deepika Patel", "Megha Thakre", "Dharam Singh"
        };
        String smallest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() < smallest.length()) {
                smallest = names[i];
            }
        }
        System.out.println("The smallest string is: " + smallest);
    }
}
*/

// wap to count all the String those are starting with vowels from the given
/*
class Str {
    public static void main(String[] args) {
        String[] names = {"Piyush Sahu", "Harish Chourasiya", "Anjali Prajapati"
                , "Gauri Dahake",
                "Ankita Bobde", "Shiddharth Patel",
                "Madhur Sahu", "Aaditya Rajawat", "Akshay Mishra", "Devansh Sharma",
                "Kanishka singh kushwaha", "Anushka Shrivastava",
                "Devanshi Choudhary",
                "Devanshi bamaliya", "Divyansh Malviya", "Adarsh Tiwari",
                "Aatmik kushwaha", "Ankit Gujre",
                "shanawaz alam", "Raman Jatav", "Aditya Tanwani", "Mohd Nadir Ansari", "Deepika Patel", "Megha thakre",
                "Dharam singh" };
        int count = 0;
        for (String element : names) {  // for each jab index ke use na ho tab use for each loop
            if (element.startsWith("a") ||
                    element.startsWith("e") ||
                    element.startsWith("i") ||
                    element.startsWith("o") ||
                    element.startsWith("u") ||
                    element.startsWith("A") ||
                    element.startsWith("E") ||
                    element.startsWith("I") ||
                    element.startsWith("O") ||
                    element.startsWith("U")
            ) {
                count++;
                System.out.println(element);
            }
        }
        System.out.println("count = " + count);
    }
}
*/


// returns a positive number, negative number, or 0.
//
//if s1 > s2, it returns positive number
//if s1 < s2, it returns negative number
//if s1 == s2, it returns 0

/*
public class Str4 {
    public static void main(String[] args) {
        String first = "vaibhav";
        String second = "vivek";
       int compareTO =  first.compareTo(second);
        System.out.println("compareTO = " + compareTO);
        // how to identify smaller or bigger
        if(compareTO == 0){
            System.out.println("both strings are same");
        }else if(compareTO < 0){
            System.out.println("first string" + first + "is smaller");
        }else {

            System.out.println("Second string" + second + "is begger");
        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String[] names = {
                "Piyush Sahu", "Harish Chourasiya", "Anjali Prajapati", "Gauri Dahake",
                "Ankita Bobde", "Shiddharth Patel", "Madhur Sahu", "Aaditya Rajawat",
                "Akshay Mishra", "Devansh Sharma", "Kanishka Singh Kushwaha",
                "Anushka Shrivastava", "Devanshi Choudhary"
        };
        for (String name : names) {
            if (name.startsWith("A") || name.startsWith("E") || name.startsWith("I") ||
                    name.startsWith("O") || name.startsWith("U") ||
                    name.startsWith("a") || name.startsWith("e") || name.startsWith("i") ||
                    name.startsWith("o") || name.startsWith("u")) {
                System.out.println(name);
            }
        }
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String[] names = {"Piyush Sahu", "Harish Chourasiya", "Anjali Prajapati"
                , "Gauri Dahake",
                "Ankita Bobde", "Shiddharth Patel",
                "Madhur Sahu", "Aaditya Rajawat", "Akshay Mishra", "Devansh Sharma",
                "Kanishka singh kushwaha", "Anushka Shrivastava",
                "Devanshi Choudhary",
                "Devanshi bamaliya", "Divyansh Malviya", "Adarsh Tiwari",
                "Aatmik kushwaha", "Ankit Gujre",
                "shanawaz alam", "Raman Jatav", "Aditya Tanwani", "Mohd Nadir Ansari", "Deepika Patel", "Megha thakre",
                "Dharam singh" };
        int count = 0;

//            if (element.startsWith("a") ||
//                    element.startsWith("e") ||
//                    element.startsWith("i") ||
//                    element.startsWith("o") ||
//                    element.startsWith("u") ||
//                    element.startsWith("A") ||
//                    element.startsWith("E") ||
//                    element.startsWith("I") ||
//                    element.startsWith("O") ||
//                    element.startsWith("U")
//            )

        for (String element : names) {
            String temp = element.toLowerCase();
            if (temp.startsWith("a") || temp.startsWith("e") || temp.startsWith("i")
                    || temp.startsWith("o") || temp.startsWith("u")) {
                count++;
                System.out.println(temp);
                System.out.println(element);
            }
        }
        System.out.println("count = " + count);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String[] names = {"Piyush Sahu", "Harish Chourasiya", "Anjali Prajapati"
                , "Gauri Dahake",
                "Ankita Bobde", "Shiddharth Patel",
                "Madhur Sahu", "Aaditya Rajawat", "Akshay Mishra", "Devansh Sharma",
                "Kanishka singh kushwaha", "Anushka Shrivastava",
                "Devanshi Choudhary",
                "Devanshi bamaliya", "Divyansh Malviya", "Adarsh Tiwari",
                "Aatmik kushwaha", "Ankit Gujre",
                "shanawaz alam", "Raman Jatav", "Aditya Tanwani", "Mohd Nadir Ansari", "Deepika Patel", "Megha thakre",
                "Dharam singh" };
        int minLength = names[0].length();
        String smallestString = names[0];
        for (String element : names) {
            if (minLength > element.length()) {
                minLength = element.length();
                smallestString = element;
               // System.out.println(element);
            }
        }
        System.out.println("smallestString = " + smallestString);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        String[] names = {
                "Piyush Sahu", "Harish Chourasiya", "Anjali Prajapati", "Gauri Dahake",
                "Ankita Bobde", "Shiddharth Patel", "Madhur Sahu", "Aaditya Rajawat",
                "Akshay Mishra", "Devansh Sharma", "Kanishka singh kushwaha",
                "Anushka Shrivastava", "Devanshi Choudhary", "Devanshi bamaliya",
                "Divyansh Malviya", "Adarsh Tiwari", "Aatmik kushwaha", "Ankit Gujre",
                "Shanawaz Alam", "Raman Jatav", "Aditya Tanwani", "Mohd Nadir Ansari",
                "Deepika Patel", "Megha Thakre", "Dharam Singh"
        };
        // Initialize the smallest string as the first string in the array
        String smallest = names[0];
        // Loop through the array to find the smallest string by length
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() < smallest.length()) {
                smallest = names[i]; // Update smallest if a shorter string is found
            }
        }
        // Output the smallest string
        System.out.println("The smallest string is: " + smallest);
    }
}
*/

/*
import java.util.Scanner;
class Str {
    public static void main(String[] args) {
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        String small = str[0];
        for (int i = 0; i < str.length; i++) {
            if(str[i].length() < str[0].length()){
                small = str[i];
            }
        }
        System.out.println(small);
    }
}
*/

// String builder :
// is a class  that provides mutable implementation of String , that means you can change the sequence of character that are present in the String
// String builder implements and underline character array , this means there will be some initial capacity of the string builder object  16 character hod kar sakta hai

// constructor to create StringBuilder .
// StringBuilder stringBuilder = new StringBuilder("String");

// but default stringBuilder have a capacity of 16 character

// int length : this method will return total number of character , present in the stringBuilder object , not the capacity

/*
import java.util.Scanner;
class Str {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("adarsh");
        Scanner sc = new Scanner(System.in);
        int length = stringBuilder.length();
        System.out.println(length);
        // this method will return the current capacity of the stringBuilder object
        int capacity = stringBuilder.capacity();
        System.out.println(capacity);
        stringBuilder.append("Tiwari");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        for (int i = 0; i < 15; i++) {
            stringBuilder.append(sc.nextLine());
            System.out.println("capacity = " + stringBuilder.capacity());
            // when ever the capacity of StringBuilder reaches at max value it will increase by  (capacity+1)*2
        }
       //  void append(String anotherString);
        // append method will append or add or concatenate the given String to the axistin String builder
        // stringBuilder.replace()
        stringBuilder.replace(0,9,"Ram");
    }
}
*/

/*
import java.util.Scanner;
class Str {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Vaibhav");
        Scanner scanner = new Scanner(System.in);
        int length = stringBuilder.length();
        System.out.println(length);
        int capacity = stringBuilder.capacity();
        System.out.println(capacity);
        stringBuilder.append("Diwan");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
//       for (int i = 65; i < 122; i++) {
//            stringBuilder.append((char)i);
//            System.out.println("capacity = " + stringBuilder.capacity());
//            scanner.nextLine();
//        }
//       /* char[] a = {65, 66, 67, 68, 69,70};
//        char[] b = {97,98,99,100,101};
//
//        char[] crr = new char[48];
//        for (int i = 0; i < a.length; i++) {
//            crr[i] = a[i];
//        }
//        a = crr;
//        System.out.println("a.length = " + a.length);
//        System.out.println("b.length = " + b.length);
        System.out.println(stringBuilder);
        stringBuilder.replace(0, 12, "Ramesh");
        System.out.println(stringBuilder);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        // this will create an empty stringBuilder with initial capacity of 16 character
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuiler.capacity()  = " + stringBuilder.capacity());
        stringBuilder.append('a');
        stringBuilder.append("word");
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuiler.capacity()  = " + stringBuilder.capacity());
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        // this will create a StringBuilder with given string and initial capacity of 16 character + string.length()
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuiler.capacity()  = " + stringBuilder.capacity());
        StringBuilder stringBuilder2 = new StringBuilder(32); // ye empty hai and capacity create 32 char
        System.out.println("stringBuilder2 = " + stringBuilder2.capacity());
        // void ensureCapacity(int minimumCapacity)
        stringBuilder2.ensureCapacity(16);  // pahle se 32 define hai so
        System.out.println("stringBuilder2.ensureCapacity = " + stringBuilder2.capacity());
        // wap to check and show increase in capacity of stringBuilder by appending
        // multiple character.also check and show decrease in capacity of StringBuilder
        // by using the deleteChar() method
        // delete or remove character from StringBuilder
        stringBuilder1.delete(0,1);
    }
}
*/

/*
class Str {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //this will create an empty StringBuilder with initial capacity of 16 characters
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());

        stringBuilder.append('a');
        stringBuilder.append(" World");
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());

        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        //this will create a StringBuilder with given string and
        // initial capacity of 16 characters + string.length()
        System.out.println("stringBuilder.length() = " + stringBuilder1.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder1.capacity());
        StringBuilder stringBuilder2 = new StringBuilder(32);

        //this will create an empty StringBuilder
        // with initial capacity of equal to the given capacity
        System.out.println("stringBuilder.length() = " + stringBuilder2.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder2.capacity());

        //void ensureCapacity(int minimumCapacity)
        stringBuilder2.ensureCapacity(16);
        System.out.println("stringBuilder.capacity() = " + stringBuilder2.capacity());

        // delete or remove a character from StringBuild
        System.out.println("stringBuilder1 = " + stringBuilder1);   // Hello
        // 01234
        stringBuilder1.delete(2,2);
        System.out.println("stringBuilder.length() = " + stringBuilder1.length());
        System.out.println("stringBuilder1 = " + stringBuilder1);
        System.out.println("stringBuilder.length() = " + stringBuilder1.length());

        //stringBuilder1.deleteCharAt(6);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        //int indexOf(String str)
        StringBuilder stringBuilder3 = new StringBuilder("The quick brown fox jumps over the lazy dog");
        // 0 1 2 3 4
        // T h e   q
        for (int i = 0; i < stringBuilder3.length(); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < stringBuilder3.length(); i++) {

            System.out.print(stringBuilder3.charAt(i) + " ");
            if(i >= 10)
                System.out.print(" ");
        }
        System.out.println();
    }
}
*/

/*
import java.util.Scanner;

public class StringQuestion{
    public static void main(String[] args) {
        String[] str = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        System.out.println("Array length: " + str.length);
    }
}
 */

/*
public class StringQuestion {
    public static void main(String[] args) {
        char[] name = {'a','d','a','r','s','t'};
        String str = new String(name);
        System.out.println(str);
    }
}
 */


/*
public class StringQuestion {
    public static void main(String[] args) {
        String str = "adarsh kumar tiwari";
        char[] ch = str.toCharArray();
        System.out.println(ch);
        System.out.println(ch + " ");
        for(char c : ch){
            System.out.print(c + " ");
        }
    }
}
 */

/*
import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(str.length());
    }
}
 */

/*
public class SubString {
    public static void main(String[] args) {
        String str = "adarsh";
        System.out.println(str.substring(0,4)); // first index include , last index not include
    }
}
 */

/*
public class SubString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("adarsh");
        System.out.println(sb.substring(0,4));
    }
}
 */

/*
public class subString{
    public static void main(String[] args){
        String str = "adarsh kumar tiwari";
        String str1 = str.substring(7,12);
        System.out.println(str1);
    }
}
 */

/*
class Str {
    public static void main(String[] args) {
        String s1 = "adarsh";
        char[] ch = s1.toCharArray();  // convert String to char
        int len = ch.length;    // Array length
        System.out.println(len);
        for(int i=0;i<len;i++){
            System.out.println(ch[i]);
        }
    }
}
*/

/*
class Str{
    public static void main(String[] args){
        String str = "adarsh kumar tiwari";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if(i!=str.length()-1){
                System.out.print(", ");
            }
        }
    }
}
*/