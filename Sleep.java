/*
class Sleep {
    public static void main(String[] args) throws Exception { 
        for(int i=1;i<=5;i++){
            Thread.sleep(10000);
            System.out.println(i);
        }
    }
}
*/

/*
class Sleep{
    public static void main(String[] args) {
        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
*/


/*
class Sleep extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Sleep s1 = new Sleep();
        s1.start();
    }
}
*/

/*
class Sleep extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Sleep s1 = new Sleep();
        s1.start();

        Sleep s2 = new Sleep();
        s2.start();
    }
}
*/

/*
class Sleep extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Sleep s1 = new Sleep();
        s1.run();  // run() method hai .

        Sleep s2 = new Sleep();
        s2.run();
    }
}
*/