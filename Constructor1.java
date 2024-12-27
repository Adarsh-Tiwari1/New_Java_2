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


