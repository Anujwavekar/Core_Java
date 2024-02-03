package DataType;

public class typecasting {
    public static void main(String[] args) {
        int a;
        a=10;
        //b=20;
        //float div=a/b;

       // System.out.println("division is "+div);

       //value of implicit (int--->float)
       System.out.println("a value is  \t"+a);
       float b=a;
       System.out.println("value of b is\t "+b);

       //code for explicit conversion(float--->int)
       float c=10.00f;
       System.out.println("float value is "+c);
       int d=(int)c;
       System.out.println("int d value "+d);
    }
    
}


