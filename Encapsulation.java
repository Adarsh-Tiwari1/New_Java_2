
class Encapsulation(
    private int x;
    private int y;

    public int getX(){
        return x;
    }
    public void  setX(int x){
        this.x = x;
    }
    public int get Y(){
        return y;
    }
    public void s setY(int y){
        this.y = y;
    }
    public static void main(String[] args){
        Encapsulation obj = new Encapsulation();
        obj.setX(11);
        obj.setY(22);
        System.out.println(obj.getX());
        System.out.println(obj.getY());
    }
)