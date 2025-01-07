// 2
/*
import java.util.Scanner;
class ArrayTask{
   public static void main(String[] args) {
    int sum = 0;
    float ave = 0;
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter Element : ");
        arr[i] = sc.nextInt();
    }
    System.out.println("Output : ");
    for(int i=0;i<arr.length;i++){
        sum = arr[i] + sum;
    }
    System.out.println("Sum of the Array Element is : " + sum);
    System.out.println("Average of the Array Element is : " + (float)(sum / arr.length));
   }
}
*/

// 5
/*
import java.util.Scanner;
class ArrayTask{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Output : ");
        System.out.println("Even element in Array : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Odd element in Array : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
*/

// 6
/*
class ArrayTask{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13,14,15};
        int[] newArray = new int [arr.length + arr2.length];
        for(int i=0;i<arr.length;i++){
        newArray[i] = arr[i];
    }
        for(int i=0;i<arr2.length;i++){
        newArray[arr.length + i] = arr2[i];
    }
    for(int i=0;i<newArray.length;i++){
        System.out.print(newArray[i] + " ");
    }
    }
}
*/

// 12
/*
class ArrayTask{
    public static void main(String[] args) {
        int[] arr = {45,25,69,40};
        int smallestNum = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallestNum){
                smallestNum = arr[i];
            }
        }
        System.out.println("Smallest number in Array Element : " + smallestNum);
    }
}
*/

/*
class ArrayTask{
    public static void main(String[] args) {
        int[] arr = {20,-10,15,00,4,-85,0};
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] <= 0){
                negative++;
            }
            else if(arr[i] >= 0){
                positive++;
            }
        }
        System.out.println("Positive Number are : " + positive);
        System.out.println("Negative Number are : " + negative);
        System.out.println("Zero are : " + zero);
    }
}
*/

/*
class ArrayTask{
    public static void main(String[] args) {
        char[] ch = {'A','B','C','D','E','F'};
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
*/
