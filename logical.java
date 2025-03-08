public class logical {
    public static void main(String args[]){
        System.out.println("Logical and");
        System.out.println((10>5) &&(2>1));
        System.out.println((10>5) &&(2<1));
        System.out.println((10<5) &&(2<1));

        System.out.println("Logical or");
        System.out.println((10>5) ||(2>1));
        System.out.println((10>5) ||(2<1));
        System.out.println((10<5) ||(2<1));

        System.out.println("Logical not");
        System.out.println(!(10>5));
        System.out.println(!(10<5));
    }
}
