/*
class Task5 {
    public static void main(String[] args) {
        String str = "this is a test string";
        String[] str1 = str.split(" ");
        for(String name : str1){
            System.out.println(name);
        }
    }
}
*/

/*
class Task5{
    public static void main(String[] args) {
        String str = "this is a test string";
        String[] str1 = str.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]);
        }
    }
}
*/

/*
import java.util.Scanner;
class Task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println();
        String[] str1 = str.split(" ");
        for(String Name : str1){
            System.out.println(Name);
        }
    }
}
*/


/*
class Task5{
    public static void main(String[] args) {
        String str = "be glad to see the back of";
        String str1 = str.replaceAll(" ", "*");
        System.out.println(str1);
    }
}
*/

/*
import java.util.Scanner;
class Task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter String : ");
        String str = sc.nextLine();
        System.out.println("Before Changing String : ");
        System.out.println(str);
        System.out.println(" ");
        String str1 = str.replaceAll(" ", "*");
        System.out.println("After Changed : ");
        System.out.println(str1);
    }
}
*/

/*
class Task5{
    public static void main(String[] args) {
        String str = "THE QUICK BROWN FOX JUMPSOVER THE LAZY DOG";
        String str1 = str.toLowerCase();
        System.out.println(str1);
    }
}
*/

/*
import java.util.Scanner;
class Task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println();
        String str1 = str.toLowerCase();
        System.out.println(str1);
    }
}
*/

/*
class Task5{
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a'&&ch[i]<='z'){
                ch[i] = (char)(ch[i]-32);
            }
        }
        System.out.println(new String(ch));
    }
}
*/

/*
import java.util.Scanner;
class Task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println(str);
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] =  (char)(ch[i]-32);
            }
        }
        System.out.println(ch);
    }
}
*/

/*
class Task5{
    public static void main(String[] args) {
        String str = "It is a string with smallest and largest word";
        String[] str1 = str.split(" ");
        String smallest = str1[0];
        for(int i=1;i<str1.length;i++){
            if(str1[i].length() < smallest.length()){
                smallest = str1[i];
            }
        }
        System.out.println(smallest);
    }
}
*/

