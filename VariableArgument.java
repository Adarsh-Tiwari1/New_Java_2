// Variable Argument : (...) : 
// argument must be integer type .
// internally array ka concept use karta hai. ek bar me ek he data type use kar skte hai
// 
/*
class VariableArgument {   
    public static void add(int...x){
        int sum = 0;
        for(int a:x){
            sum = sum+a;
        }
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        add();
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
    }
}
*/


/*
class VariableArgument {   
    public static void add(int z,int...x){ 
        int sum = 0;
        for(int a:x){
            sum = sum+a;
        }
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        add(8); // ek argument pass karna he padega.
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
    }
}
*/

/*
class VariableArgument {   
    public static void add(int x,int y,int...z){
        int sum = 0;
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        add(1,2); 
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
    }
}
*/


