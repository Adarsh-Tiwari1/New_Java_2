
// Abstract.java

// Abstract : abstract class are declared using the abstract keyword . and they can have abstract methods , (without a body) and concrete methods (with a body).
// Abstract Class : Declared with the abstract keyword . Cannot be instantiated directly . 
// Abstract Method : Declared without a body (no implementation) .
// Must be overridden by subclasses.
// Abstract : abstract class can't create an object .

/*
abstract class Animal{
    abstract void sound(); // Abstract method (does not have a body)
    void sleep(){
        System.out.println("Sleepint...");
    }
}
class Cat extends Animal{
    void sound(){  // Implementing the abstract method sound()
        System.out.println("Hello");
    }
}
class Abstract{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.sleep();
        c1.sound();
    }
}
*/

/*
abstract class Hello{
    abstract void sum();
    public void Hello(){
        System.out.println("Hello method");
    }
}
class Hii extends Hello{
    void sum(){
        super.Hello();
        System.out.println("sum interface");
        this.sum1();
    }
    void sum1(){
        System.out.println("sum1 method");
    }
}
class Abstract {
    public static void main(String[] args) {
        System.out.println("main class");
        Hii h1 = new Hii();
        h1.sum();
    }
}
*/

/*
abstract class Hello{
    abstract void sum();
    public void Hello(){
        System.out.println("Hello method");
    }
}
class Hii extends Hello{
    void sum(){
        super.Hello();
        System.out.println("sum interface");
        this.sum1();
    }
    void sum1(){
        System.out.println("sum1 method");
    }
}
class Abstract {
    public static void main(String[] args) {
        System.out.println("main class");
        Hello h1 = new Hii();
        h1.sum();
    }
}
*/

/*
abstract class Hello{
    abstract void sleep();
    void sount(){
        System.out.println("Hello Sound");
    }
}
class Hii extends Hello{
    void sleep(){
        System.out.println("Sleeping");
    }
}
class Abstract{
    public static void main(String[] args) {
        Hii h1 = new Hii();
        h1.sleep();
        h1.sount();
    }
}
*/

/*
abstract class Vehicle{
    abstract void start();
    void stop(){
        System.out.println("Stoped");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("startion");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike is startion");
    }
}
class Abstract{
    public static void main(String[] args) {
        Vehicle Car = new Car();
        Car.start();
        Car.stop();

        Vehicle Bike = new Bike();
        Bike.start();
    }
}
*/

/*
abstract class Hello{
    void Hello(){
        System.out.println("Hello Method");
    }
}
class Hii extends Hello{
    void Sount(){
        System.out.println("Sound Method");
    }
}
class Abstract extends Hii{
    public static void main(String[] args) {
        Hii h1 = new Hii();
        h1.Hello();
        h1.Sount();
    }
}
*/

/*
abstract class Shape {
    abstract void draw();  // Abstract method
    void display() {  // Concrete method
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {  // Concrete class extending abstract class
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
class Rectangle extends Shape {  // Another concrete class extending abstract class
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
class Abstract {
    public static void main(String[] args) {
        Shape circle = new Circle();  // Shape s = new Shape(); // Cannot instantiate abstract class
        Shape rectangle = new Rectangle();
        circle.display();
        circle.draw(); // Calls Circle's draw method
        rectangle.display();
        rectangle.draw(); // Calls Rectangle's draw method
    }
}
*/

/*
abstract class Hello {
    abstract void method();
    public void A() {
        System.out.println("A Method");
    }
}
abstract class Hii extends Hello {
    abstract void Hii();
    public void method() {
        System.out.println("B Method");
    }
}
class ConcreteHii extends Hii {
    public void Hii() {
        System.out.println("Hii Method");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Hii h1 = new ConcreteHii(); 
        h1.A(); 
        h1.method(); 
        h1.Hii(); 
    }
}
*/

/*
abstract class Hello{
    public void run(){
        System.out.println("run method");
    }
}
abstract class Come extends Hello{
    public void fast(){
        System.out.println("fast method");
    }
}
class Abstract extends Come{
    public static void main(String[] args) {
        Come c1 = new Come();  // Abstract classes cannot be instantiated directly.
        c1.fast();
    }
}
*/

/*
abstract class Hello{
    public static void run(){
        System.out.println("run method");
    }
}
abstract class Come extends Hello{
    public static void fast(){
        System.out.println("fast method");
    }
}
class Abstract extends Come{
    public static void main(String[] args) {
        Abstract a1 = new Abstract();
        Hello.run();
        Come.fast();
    }
}
*/

/*
abstract class Hello {
    public void run() {
        System.out.println("run method");
    }
}
abstract class Hii extends Hello {
    public void come() {
        System.out.println("come method");
    }
}
abstract class Good extends Hii {
    public void fast() {
        System.out.println("fast method");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Good g = new Good() {};  // Anonymous class extending Good
        g.run(); 
        g.come(); 
        g.fast(); 
    }
}
*/

/*
abstract class Hello{
    abstract void run();
    public void come(){
        System.out.println("come method");
    }
}
abstract class Hii extends Hello{
    abstract void running();
    public void run(){
        System.out.println("come method");
    }
}
abstract class Byy extends Hii{
    public void running(){
        System.out.println("running method");
    }
}
class Abstract {
    public static void main(String[] args) {
        Byy b1 = new Byy() {};
        b1.come();
    }
}
*/

/*
abstract class Animal {
    String name;  // Constructor
    Animal(String name) {
        this.name = name;
    }
    abstract void makeSound(); // Abstract method
    void sleep() {  // Concrete method
        System.out.println(name + " is sleeping.");
    }
}
// Concrete class for Hello
class Hello extends Animal {
    Hello(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
class Cat extends Animal {  // Concrete class for Cat
    Cat(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}
class Cow extends Animal {  // Concrete class for Cow
    Cow(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Moo Moo!");
    }
}
class Abstract {
    public static void main(String[] args) {
        Animal Hello = new Hello("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal cow = new Cow("Daisy");
        Hello.makeSound();
        Hello.sleep();

        System.out.println();

        cat.makeSound();
        cat.sleep();

        System.out.println();

        cow.makeSound();
        cow.sleep();
    }
}
*/

/*
abstract class Hello{
    String name;
    Hello(String name){
        this.name = name;
    }
    abstract void run();
    public void A(){
        System.out.println("A method");
    }
}
abstract class Hii extends Hello{
    Hii(String name){
        super(name);
    }
    public void run(){
        System.out.println("run method");
    }
}
public class Abstract {

    public static void main(String[] args) {
        Hii h = new Hii("Ram"){};
        h.A();
        
    }
}
*/
// aagar kisee ve class ke under abstract method aata hai to o class abstract home complusery hai .
// koi ve class aager abstract class ko extends karta hai to uss class ka under abstract method ke body banana compelusry hai .

/*
abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{ 
    void start(){
        System.out.println("car start with key");
    }
}
class Abstraction extends Vehicle{
    void start(){
        System.out.println("stooter start with key");
    }
    public static void main(String[] args){
       Car c = new Car();  // Vehicle v = new Vehicle(); // abstract class ka object create nahi kar sakte  .
       c.start();

       Abstraction a = new Abstraction();
       a.start();
    }
}
*/

/*
abstract class Hello{
    abstract void ho();
    public void sim(){
        System.out.println("Sim Method");
    }
}
class Lap extends Hello{
    public void ho(){
        System.out.println("Lap method");
    }
}
class Mob extends Hello{
    public void ho(){
        System.out.println("Mob method");
    }
}
class Abstract{
    public static void main(String[] args) {
        Hello Lap = new Lap();
        Lap.ho();
        Lap.sim();
    }
}
*/

/*
abstract class Hello{
    abstract void run();
    public void go(){
        System.out.println("run method");
    }
}
abstract class Hello1 extends Hello{
    public void go(){
        System.out.println("goo method");
    }
}
abstract class Hello2 extends Hello1{
    public void go(){
        System.out.println("go method");
    }
}
class Abstract{
    public static void main(String[] args) {
        Hello2 h = new Hello2(){
            void run(){
                System.out.println("run method");
            }
        };
        h.go();
        h.run();
    }
}
*/

/*
abstract class Hello{
    abstract void run();
    public void A(){
        System.out.println("A");
    }
}
abstract class Hello2 extends Hello{
    public void run(){
        System.out.println("run method");  // How to call class Hell2
    }
}
abstract class Hello3 extends Hello2{
    public void run(){
        System.out.println("run2 method");
    }
}
class Abstract{
    public static void main(String[] args) {
        Hello3 h = new Hello3(){};
        h.A();
        h.run();
    }
}
*/



// Abstraction : we can't create an object of abstract class . 
// interface me consturctor nahi hota hai. isme abstract method hota hai.
// abstrace method ko compulsary override karna he padega.
// 

/*
abstract class RGPV{
    public RGPV(){
        System.out.println("This is rgpv class constructor");
    }
    public abstract void lab();
    public abstract void cctv();
    public void copyCheck(){
        System.out.println("This is copy check method of rgpv and this is non abstract method");
    }
}
class Abstrac extends RGPV{   
    public Abstrac(){
        System.out.println("This is college class constructor");
    }
    public void cctv(){
        System.out.println("This is rgpv cctv method");
    }
    public void lab(){
        System.out.println("This is rgpv lab method");
    }
    public void staff(){
        System.out.println("This is college staff");
    }
    public static void main(String[] args) {
        RGPV r1 = new Abstrac();
        r1.cctv();
        r1.lab();
        r1.copyCheck();

        Abstrac r = new Abstrac();
        r.cctv();
        r.lab();
        r.copyCheck();
        r.staff();
    }
}
*/