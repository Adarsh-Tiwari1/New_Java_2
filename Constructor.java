// static ko compile time me memory milti hai. heap ko run time per memory milti hai .

// default constructor 
/*
class Example{
    int x;

    // default constructor
    Example(){
        x = 0;
    }
    void display(){
        System.out.println(x);
    }
}
class Constructor{
    public static void main(String[] args){
        Example obj = new Example();
        obj.display();
    }
}
*/

// parameterized constructor
/*
class Example{
    int x;
    // parameterized constructor
    Example(int value){
        x = value;
    }
    void display(){
        System.out.println(x);
    }
}
class Constructor{
    public static void main(String[] args){
        Example obj = new Example(10);
        obj.display();
    }
}
*/

// copy constructor 
/*
class Example{
    int x;
    // parameterized constructor
    Example(int num){
        x = num;
    }
    // copy constructor
    Example(Example obj){
        x = obj.x;
    }
    void display(){
        System.out.println(x);
    }
}
class Constructor{
    public static void main(String[] args){
        Example obj = new Example(10);
        Example obj2 = new Example(obj); // copy constructor
        obj2.display();
    }
}
*/

// constructor overloading 
/*
class Example{
    int x;
    String y;
    // default constructor
    Example(){
        x = 0;
        y = "Default";
    }
    // parameterized constructor
    Example(int value){
        x = value;
    }
    // anoter parameterized constructor
    Example(int value,String text){
        x = value;
        y = text;
    }
    void display(){
        System.out.println(x + " " + y);
    }
}
class Constructor{
    public static void main(String[] args){
        Example obj = new Example();
        Example obj1 = new Example(10); // constructor with one parameter
        Example obj2 = new Example(30,"Java"); // constructor with two parameter

        obj.display();
        obj1.display();
        obj2.display();
    }
}
*/