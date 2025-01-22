

// Constructor1.java

/*
class Constructor1{
    public Constructor1(){
        System.out.println("No Argument Constructor");
        System.out.println("First Class Constructor");
    }
    public Constructor1(int x){
        System.out.println("Second Class Constructor " + x);
    }
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        Constructor1 c2 = new Constructor1(10);
    }
}
*/

/*
class Parent{
    int age;
    public Parent(int age){
        this.age = age;
        System.out.println("Parent class");
    }
}
class Constructor1 extends Parent{
    String name;
    public Constructor1(int age,String name){
        super(age);
        this.name = name;
        System.out.println("Main Class");
    }
    public static void main(String[] args) {
        Constructor1 c = new Constructor1(100, "Ram");
        System.out.println(c.age + " " + c.name);
    }
}
*/

/*
class Hello {
    int age;
    public Hello(int age) {
        this.age = age; 
        System.out.println("Hello method");
    }
}
class Constructor1 extends Hello {
    String name;
    public Constructor1(String name, int age) {
        super(age);  
        this.name = name;  
    }
    public static void main(String[] args) {
        Constructor1 c = new Constructor1("Raj", 100);
        System.out.println(c.age + " " + c.name);  
    }
}
*/

/*
class Hello{
    int age;
    public Hello(int age){ // do not write this so find 0 value
        System.out.println("hello method");
    }
}
class Constructor1 extends Hello{
    String name;
    public Constructor1(int age, String name){
        super(age);
        this.name = name;
    }
    public static void main(String[] args) {
        Constructor1 c = new Constructor1(1000, "Raja");
        System.out.println(c.age + " " + c.name);
    }
}
*/

/*
class Hello{
    int age;
    public Hello(int age){ // do not write this so find 0 value
        this.age = age;
        System.out.println("hello method");
    }
}
class Constructor1 extends Hello{
    String name;
    public Constructor1(int age, String name){
        super(age);
        this.name = name;
    }
    public static void main(String[] args) {
        Constructor1 c = new Constructor1(1000, "Raja");
        System.out.println(c.age + " " + c.name);
    }
}
*/

/*
class Const1{
    Const1(){
        System.out.println("Const1 i am Const");
    }
    Const1(){  //  The code will not compile due to a constructor overloading issue.
        System.out.println("Const1 i am Const2");
    }
    public static void main(String[] args){
        Const1 h1 = new Const1();
        Const1 h2 = new Const1();
    }
}
*/

/*
class Constructor1{
    public Constructor1(){
        System.out.println("Main class");
    }
    public Constructor1(int x){
        System.out.println("Second Main Class " + x);
    }
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        Constructor1 c2 = new Constructor1(2);
    }
}
*/

/*
class Constructor1{
    int age = 20;
    String name = "Ram";
    public Constructor1(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1(0, null);
    }
}
*/

/*
class Constructor1{
    int age = 10;
    String name = "Adarsh";
    Constructor1(int age, String name){
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Constructor1 c = new Constructor1(100, "Raj");
        System.out.println(c.age + " " + c.name);
    }
}
*/

/*
class Constructor1{
    int age = 101;
    String name = "Ram";
    public Constructor1(){
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
    }
}
*/

/*
class Constructor1{
    static int count = 0;{ // static variable shared among all instances of the Constructor1 class
        count++;
    }
    Constructor1(){
        System.out.println("Hello");
    }
    Constructor1(int x){
        System.out.println("Parameterized const");
    }
    Constructor1(double y){
        System.out.println("Doulbe con");
    }
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        Constructor1 c2 = new Constructor1(10);
        Constructor1 c3 = new Constructor1(1.0);
        System.out.println(count);
    }
}
*/


// class level me jo data delclre hota hai to wah member data kahte hai.
/*
class Constructor1{
    int x;
    int y; // member data
    public Constructor1(){
        x = 1;
        y = 2;
        System.out.println("Default Constructor is Called :");
    }
    public static void main(String[] args){
        Constructor1 p1 = new Constructor1(); 
        Constructor1 p2 = new Constructor1();  // Point class default constructor called
        Constructor1 p3 = new Constructor1(); 
    }
}
*/

/*
class Constructor1{
    int x;
    int y; // member data
    public Constructor1(){
        x = 1;
        y = 2;
        System.out.println("Default Constructor is Called :");
    }
    public void showData(){
        System.out.println("x Value : " + x);
        System.out.println("y Value : " + y);
    }
    public static void main(String[] args){
        Constructor1 p1 = new Constructor1(); // Point class default constructor called
        Constructor1 p2 = new Constructor1(); 
        Constructor1 p3 = new Constructor1(); 
        p1.showData(); 
        p2.showData();
        p3.showData();
    }
}
*/

// Parameterized constructor. 

/*
class Constructor1{
    int x;
    int y; // member data
    public Constructor1(){
        x = 1;
        y = 2;
        System.out.println("Default Constructor is Called :");
    }
    public Constructor1(int a,int b){
        x = a;
        y = b;
        System.out.println("Parameterized Constructor is called ");
    }
    public void showData(){
        System.out.println("x Value : " + x);
        System.out.println("y Value : " + y);
    }
    public static void main(String[] args){
        Constructor1 p1 = new Constructor1(); // Point class default constructor called
        Constructor1 p2 = new Constructor1(); 
        Constructor1 p3 = new Constructor1(); 
        p1.showData(); 
        p2.showData();
        p3.showData();
        Constructor1 p4 = new Constructor1(121,122);
        p4.showData();
        Constructor1 p5 = new Constructor1(10,20);
        p5.showData();
    }
}
*/


