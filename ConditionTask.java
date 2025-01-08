/*
import java.util.Scanner;
class ConditionTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Number is Positive");
        }else if(num == 0){
            System.out.println("Number is equal by Zero");
        }else if( num < 0){
            System.out.println("Number is Negative ");
        }else{
            System.out.println("Thank You");
        }
    }
}
*/

/*
import java.util.Scanner;
class ConditionTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floating Number : ");
        float num = sc.nextFloat();
        if(num >= 1 && num <= 1000000){
            if(num > 0){
                System.out.println("Numbre is Positive");
            }else{
                System.out.println("Numbre is Negative");
            }
        }
        if(num == 0.0){
            System.out.println("Zero");
        }
    }
}
*/

/*
class ConditionTask {
    public static void main(String[] args) {
        float num1 = 25.586f;
        float num2 = 25.589F;
        if(num1 == num2){
            System.out.println("They are Equal");
        }else{
            System.out.println("They are different");
        }
    }  
}
*/

/*
import java.util.Scanner;
class ConditionTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Months Number");
        int months = sc.nextInt();
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        String monthsName = "";
        int days = 0;
        switch(months){
            case 1:
            monthsName = "january";
            days = 31;
            break;
            case 2:
            monthsName = "February";
            if((year%4==0 && year%100!=0) || (year%400==0)){
                days = 29;
            }else{
                days = 28;
            }
            break;
            case 3:
            monthsName = "March";
            days = 31;
            break;
            case 4:
            monthsName = "April";
            days = 30;
            break;
            case 5:
            monthsName = "May";
            days = 30;
            break;
            case 6:
            monthsName = "June";
            days = 30;
            break;
            case 7:
            monthsName = "July";
            days = 31;
            break;
            case 8:
            monthsName = "August";
            days = 31;
            break;
            case 9:
            monthsName = "September";
            days = 31;
            break;
            case 10:
            monthsName = "October";
            days = 31;
            break;
            case 11:
            monthsName = "Nobember";
            days = 31;
            break;
            case 12:
            monthsName = "December";
            days = 31;
            break;
            default:
            System.out.println("Enter valid menth");
        }
        System.out.println(monthsName + " " + year + " has " + days + " days");
    }    
}
*/

/*
import java.util.Scanner;
class ConditionTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter character : ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='I'){
                System.out.println(ch + " : This is Vowel");
            }else{
                System.out.println(ch + " : this is Consonant");
            }
        } else{
            System.out.println("Error");
        }
    }
}
*/

/*
import java.util.Scanner;
class ConditionTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbre : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println("sum of odd index :  " + sum);
    }
}
*/

