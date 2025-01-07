
    class Encapsulation{
    private int x;
    private int y;  // member data

    public int getx(){
        return x;
    }
    public void  setx(int x){
        this.x = x;
    }
    public int gety(){
        return y;
    }
    public void  sety(int y){
        this.y = y;
    }
    public Encapsulation(){
        x = 1;
        y = 1;
        System.out.println("Default Constructor is Called");
    }
    public Encapsulation(int a, int b){
        x = a;
        y = b;
        System.out.println("Parameter Constructor is Called ");
    }
    public void showData(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(" ");
    }
    public static void main(String[] args){
        Encapsulation obj = new Encapsulation();
        obj.setx(11);
        obj.sety(22);
        System.out.println(obj.getx());
        System.out.println(obj.gety());
    }
}
