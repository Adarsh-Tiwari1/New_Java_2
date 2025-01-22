
// Final Variable : Once a variable is declared as final, its value cannot be changed .
// Final Method : Once a create as final method, its can't oberride .
// Final class : The Final Class cannot be extended by any other class because it is declared final .
// Final Parameter : A method parameter declared as final cannot be modified within the method.
// Final Static :  A static final variable is a constant shared across all instances of the class, and its value cannot be changed once initialized .


// final variable
/*
class Final{
    public static void main(String[] args){
        final int I=10;
        // i=i+20;
        System.out.println(I);
    }
}
*/

// final method

/*
class Demo{
    final void m1(){    
        System.out.println("i am in class demo");
    }
}
class Final extends Demo{
    void m1(){   // final method kabhi ve override nahi ho sakta hai.
        System.out.println("i am in class final"); 
    }
    public static void main(String[] args){  
    }
}
*/

/*
class Run{
    final void ram(){
        System.out.println("Ram method");
    }
}class Hello extends Run{
    final void son(){
        System.out.println("son method");
    }
}
class Go extends Hello{
    final void ram(int x){
        System.out.println("2nd ram method");
    }
}
class Final{
    public static void main(String[] args) {
        Go h1 = new Go();
        h1.ram();
        h1.son();
        h1.ram(10);
    }
}
*/

/*
final class Hello{
    void run(){
        System.out.println("run method");
    }
}
final class Ram{
    void go(){
        System.out.println("go method");
    }
}
final class Radha extends Ram{  // class is final so can't extend it
    void come(){
        System.out.println("come method");
    }
}
class Final{
    public static void main(String[] args) {
        
    }
}
*/

/*
final class Hello{
    void run(){
        System.out.println("run method");
    }
}
class Final extends Hello{ // parent class is final so it's can't extend it.
    public static void main(String[] args) {
        System.out.println("main method");
    }
}
*/

/*
class Hello{
    void run(){
        System.out.println("run method");
    }
}
final class Hii extends Hello{
    void come(){
        System.out.println("come method");
    }
}
class Final{
    public static void main(String[] args) {
        Hii h1 = new Hii();
        h1.come();
        h1.run();
    }
}
*/




//  String final class hai .

/*
final class Parent{
    public  void show(){
        System.out.println("This is Parent class show method...");
    }
}
class Final extends Parent{ // final can't override .
    public void show(){
        System.out.println("This is child class method...");
    }
    public static void main(String[] args) {
        Parent p1 = new Final();
        p1.show();
    }
}
*/

// final method ko overload kar sakte hai.

