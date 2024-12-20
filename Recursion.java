// Recursion memoey allocate more than using loop 
// factorial using recursion

/*
class Recursion{
    int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Recursion r = new Recursion();
        System.out.println(r.fact(5));
    }
}
*/

// fibo using recursing 

/*
class Recursion{   
    static int n1=0,n2=1,n3=0;
    static void Fibo(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3 + "\t");
            Fibo(count-1);
        }
    }   
    public static void main(String[] args){
        int term=5;
        System.out.print(0+" "+1 + " ");
        Fibo(term-2);
    }
}
*/