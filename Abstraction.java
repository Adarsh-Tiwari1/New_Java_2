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
    public abstract void copyCheck(){
        System.out.println("This is copy check method of rgpv and this is non abstract method");
    }
}
