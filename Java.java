
class Java {
    public static void main(String[] sk) {
        System.out.println("A Class");
        Java1.main(sk);
        Java2.main(sk);
        
    }
}
class Java1 {
    public static void main(String[] args) {
        System.out.println("B Class");
    }
}

class Java2 {
    public static void main(String[] args) {
        System.out.println("C Class");
    }
}

