// instance jab sub ke liye kuch common stote karna ho .
// static variable shairable hota hai. static variable ko direct class ke naam se access kar sakte hai .
// static block always execute before main method .

/*
class Static {
    int x;
    int y; // instance bariable 
    static int count;

    public Static(){
        count++;
    }
    public static void main(String[] args) {
        Static s1 = new Static();
        Static s2 = new Static();
        Static s3 = new Static();
        Static s4 = new Static();
        Static s5 = new Static();
        System.out.println("Number of object is created : " + count);
        System.out.println("Number of object is created : " + Static.count);
    }
}
*/


// static method
/*
class Static {
    int x;
    int y; // instance bariable 
    static int count;

    public Static(){
        count++;
    }
    public static int getCtr(){
        return count;
    }
    public static void main(String[] args) {
        Static s1 = new Static();
        Static s2 = new Static();
        Static s3 = new Static();
        Static s4 = new Static();
        Static s5 = new Static();
        System.out.println("Number of object is created : " + count);
        System.out.println("Number of object is created : " + Static.count);

        System.out.println("=================static methods call======================");
        System.out.println("No. of object Created : " + s1.getCtr());
        System.out.println("No. of object Created : " + Static.getCtr());
        System.out.println("No. of object Created : " + getCtr());
    }
}
*/

//static block 


class Static {
    int x;
    int y; // instance bariable 
    static int count;
    static{
        count=100;
        System.out.println("This is Static Block 1 here");
    }

    public Static(){
        count++;
    }
    public static int getCtr(){
        return count;
    }
    static{
        count=300;
        System.out.println("This is Static Block 3 here");
    }
    public static void main(String[] args) {
        System.out.println("This is main method here");
        Static s1 = new Static();
        Static s2 = new Static();
        Static s3 = new Static();
        Static s4 = new Static();
        Static s5 = new Static();
        System.out.println("Number of object is created : " + count);
        System.out.println("Number of object is created : " + Static.count);

        System.out.println("=================static methods call======================");
        System.out.println("No. of object Created : " + s1.getCtr());
        System.out.println("No. of object Created : " + Static.getCtr());
        System.out.println("No. of object Created : " + getCtr());
    }
}
