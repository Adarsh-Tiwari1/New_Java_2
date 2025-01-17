
// pre-define data ko hum direct use nahi kar sakte hai, to hum class ka use karte hai.
// 

/*
import java.util.Scanner;

class Class{
    int l;
    int b; // instance member, member data, state
    
    void student (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        l = sc.nextInt();
        System.out.println("Enter Breadth :");
        b = sc.nextInt();
    }

    void showData(){
        System.out.println("Length is : " + l);
        System.out.println("Breadth is : " + b);
    }

    void getArea(){
        System.out.println("Area : " + (l*b));
    }
    void getPira(){
        System.out.println("Pirameter of Rectangle : " + 2*(l+b));
    }
    public static void main(String[] args){
        Class obj = new Class();
        obj.student ();
        obj.showData();
        obj.getArea();
        obj.getPira();
    }
}
*/

// static ke under only static directly acces ho sakte hai. method name se.

/*
import java.util.Scanner;

class Class{
    float r;
    void student (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        r = sc.nextInt();
    }
    void showData(){
        System.out.println("Radius : " + r);
    }
    void getArea(){
        System.out.println("circumface of Circle : " + 2*3.14*r); 
    }
    void getCircle(){
       // System.out.println("Area of Circle : " + 3.14*r*r);
        System.out.println("Area of Circle : " + Math.PI*Math.pow(r,2)); // java.leng package : all wrapper class
    }
    public static void main(String[] args){
        Class obj = new Class();
        obj.student ();
        obj.showData();
        obj.getArea();
        obj.getCircle();
    }
}
*/

/*
import java.util.Scanner;

class Class{
    String name,enroll;
    int phy,che,mat,eng,hin;
    void student (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Enrollment Number : ");
        String enroll = sc.nextLine();
        System.out.println("Enter Physice Marks : ");
        int phy = sc.nextInt();
        System.out.println("Enter Chemistry Marks : ");
        int che = sc.nextInt();
        System.out.println("Enter Math Marks : ");
        int mat = sc.nextInt();
        System.out.println("Enter Hindi Marks : ");
        int hin = sc.nextInt();
        System.out.println("Enter English Marks : ");
        int eng = sc.nextInt();
    }
    void showData(){
        System.out.println("Name is : " + name);
        System.out.println("Enter Enrollment Number : " + enroll);
        System.out.println("Physice Marks : " + phy);
        System.out.println("Chemistry Marks : " + che);
        System.out.println("Math Marks : " + mat);
        System.out.println("Hindi Marks : " + hin);
        System.out.println("English Marks : " + eng);
    }
    void getTotalMarks(){
        System.out.println("Total Marks is : " + phy + che + mat + hin + eng); 
    }
    void getPercentage(){
        System.out.println("Perecntage is : "  );
    }
    public static void main(String[] args){
        Class obj = new Class();
        obj.student();
        obj.showData();
        obj.getTotalMarks();
    }
}
*/

/*
import java.util.Scanner;

class Class{
    String name;
    int employNo;
    float sal;
    void acceptData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Employ No. : ");
        employNo = sc.nextInt();
        System.out.println("Enter Salary : ");
        sal = sc.nextFloat();
    }
    void showData(){
        System.out.println("Name : " + name);
        System.out.println("Employee No. : " + employNo);
        System.out.println("Salary : " + sal);
    }
    double getHRA(){
        return (sal*0.2);
    }
    double getDA(){
        return (sal*0.1);
    }
    double getTA(){
        return (sal*0.2);
    }
    double grossSalary(){
        return sal+getHRA()+getDA()+getTA();
    }
    double getTotalCentive(){
        return getHRA()+getDA()+getTA();
    }
    public static void main(String[] args){
        Class obj = new Class();
        obj.acceptData();
        obj.showData();
        System.out.println("HRA : " + obj.getHRA());
        System.out.println("HRA : " + obj.getDA());
        System.out.println("HRA : " + obj.getTA());
        System.out.println("Total Centive : " + obj.getTotalCentive());
        System.out.println("gross Salary : " + obj.grossSalary());
    }
}
*/


// best acces specifier protected








// Class.java
/*
class Class {
    public static void main(String[] args) {
        System.out.println("class");
        B.main(args);
    }
}
class B{
    public static void main(String[] args) {
        System.out.println("B");
    }
}
class C{
    public static void main(String[] args) {
        System.out.println("c");
    }
}
class D{
    public static void main(String[] args) {
        System.out.println("D");
    }
}
*/

/*
class A{
    public static void main(String[] args) {
        System.out.println("A");
    }
}class B{
    public static void main(String[] args) {
        System.out.println("B");
    }
}class C{
    public static void main(String[] args) {
        System.out.println("C");
    }
}class Class{
    public static void main(String[] args) {
        System.out.println("Main class");
        A.main(args);
        B.main(args);
    }
}class D{
    public static void main(String[] args) {
        System.out.println("D");
    }
}
*/

/*
class A{
    public static void main(String[] args) {
        System.out.println("A");
    }
}
class B{
    public static void main(String[] args) {
        System.out.println("B");
    }
}
class C{
    public static void main(String[] args) {
        System.out.println("C");
    }
}
class Class{
    public static void main(String[] args) {
        System.out.println("Class");
        A.main(args);
        B.main(args);
        C.main(args);
    }
}
*/

/*
class Hello{
    public static void fix(){
        System.out.println("Hello i am static method");
    }
}
class Class{
    public static void main(String[] args) {
        System.out.println("Main method");
        Hello.fix();
    }
}
*/