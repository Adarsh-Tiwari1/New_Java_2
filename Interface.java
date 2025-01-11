// Ingerface L achieve 100% % abstraction , : interface is the collection of method 
// interface can't create an object 

interface IA {
    void a();
}
class Interface implements IA{
    public void a(){
        System.out.println("This is IA ingerface a method");
    }
    public void Hello(){
        System.out.println("This is test class Hello method");
    }
    public static void main(String[] args) {
        // IA obj = new IA();
        // Interface obj = new IA();
        IA obj = new Interface();
        obj.a();
        // obj.Hello();
        Interface i = new Interface();
        i.a();
    }
}


/*
interface IA {
    void a();
}
interface IB {
    void b();
}
interface IC extends IA, IB{
    void c();
}
class Interface implements IC{
    public void a(){
        System.out.println("This is IA ingerface a method");
    }
    public void b(){
        System.out.println("This is IB ingerface a method");
    }
    public void c(){
        System.out.println("This is IC ingerface a method");
    }
    public void Hello(){
        System.out.println("This is Hello method");
    }
    public static void main(String[] args) {
        // IA obj = new IA();
        // Interface obj = new IA();
        IA obj = new Interface();
        obj.a();
        // obj.Hello();
        Interface i = new Interface();
        i.a();
        i.b();
        i.c();
        i.Hello();
    }
}
*/