/*
class Yield extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        Yield y1 = new Yield();
        y1.start();

        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
*/

/*
class Yield extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        Yield y1 = new Yield();
        y1.start();

        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
*/

/*
class Yield extends Thread{
    public void run(){
        //Thread.yield(); // ye karne se main thread pahle execute hoga , phir last me ye hota

        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        Yield y1 = new Yield();
        y1.start();

        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
*/

