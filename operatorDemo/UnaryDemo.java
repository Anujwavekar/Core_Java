package operatorDemo;

public class UnaryDemo {
    public static void main(String[] args) {
        int a=10;
        //prefix increament
        System.out.println("original value of a is \t"+a);
        System.out.println("after pre increament a value is\t "+(++a));
        System.out.println("after updating value \t"+a);



        //postfix increament
        int b=10;
        
        System.out.println("original value of b is \t"+b);
        System.out.println("after post increament b value is\t "+(b++));
        System.out.println("after updating value b\t"+b);
        System.out.println("____________________________________");

        //prefix decreament
        int c=10;
        
        System.out.println("original value of c is "+c);
        System.out.println("after pre increament c value is "+(--c));
        System.out.println("after updating value "+c);

        //postfix decreament
        int d=10;
    
        System.out.println("original value of d is "+d);
        System.out.println("after pre increament d value is "+(d--));
        System.out.println("after updating value "+d);
        
    }
}
