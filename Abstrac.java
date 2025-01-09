// Abstraction : we can't create an object of abstract class . 
// interface me consturctor nahi hota hai. isme abstract method hota hai.
// abstrace method ko compulsary override karna he padega.
// 


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