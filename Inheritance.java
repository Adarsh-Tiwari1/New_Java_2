// inheritance : extends : java does not support multiple inheritance using class 
// Parent not be private .
/*
class inheritance{
	public int x;
	public int y;	
	
	public inheritance(){
	System.out.println("Point class Defalut Constructor is Called");
	}

	public inheritance (int x, int y){
	this.x = x;
	this.y = y;
	System.out.println("Point class Parameterized Constructor is Called");
	}
	public static void main(String[] args){
        inheritance p1 = new inheritance();
        inheritance p2 = new inheritance(10,20);
	}

	}
	class Circle extends inheritance{

	}
}
*/

/*
class Point{
	public int x;
	public int y;//instance variable
	public int z=101;
	public Point(){
	System.out.println("Point class Default Constructor is called");
	}
	public Point(int x,int y){
	this.x=x;
	this.y=y;
	System.out.println("Point class Parameterized Constructor is called");
	}
	void showData(){
	System.out.println("X_CO : "+x);
	System.out.println("Y_CO : "+y);
	}
	void hi(){
	System.out.println("Hi... Method is Called");
	int x=111;
	int y=222;
	System.out.printf("\nx=%d  Y=%d ",this.x,this.y);
	}
	}
	class Circle extends Point{
	float r;
	int z=102;
	public Circle(){
	System.out.println("Circle class Default Constructor");
	}
	public Circle(int x,int y,float r){
	super(x,y);//call  parent class constructor
	this.r=r;
	System.out.println("Circle class Parameterized Constructor");
	}
	void showData(){
	super.hi();
	System.out.println("X_CO : "+x);
	System.out.println("Y_CO : "+y);
	System.out.println("Radius is : "+r);
	System.out.println("circle z= : "+z);
	System.out.println("Point class z= : "+super.z);
	}
	public static void main(String args[]){
	//Circle c1=new Circle();
	//Point class default constructor (1)and Circle class default constructor(2)
	Circle c2=new Circle(11,22,5.6f);
	c2.showData();
	}
}
*/

