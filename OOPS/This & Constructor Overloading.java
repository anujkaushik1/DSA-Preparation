package OOPS;

public class Complex {
    private int a,b;

    private Complex(){

    }
    private Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    private Complex(int i){
        this(i,i);
    }

    public String toString(){
        System.out.println("when called");
        return a + "+" + b;
    }

    public static void main(String[] args) {
//        Complex c = new Complex(10,20);
//        System.out.println(c);   //10+20
//
//        Complex c1 = new Complex(89);
//        System.out.println(c1);   // 89+89
//
//        Complex c2 = new Complex();
//        System.out.println(c2);  // 0 + 0


        Complex c3 = new Complex(189); // kuch bhi print nai hoga
        System.out.println(c3);
    }
}
