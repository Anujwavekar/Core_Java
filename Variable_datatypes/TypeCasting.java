package Variable_datatypes;

public class TypeCasting {
    public static void main(String[] args) {

        //explicit conversion
        
        double pi = 3.14;
        System.out.println("Original pi value is\t"+pi);

        int i = (int)pi;
        System.out.println("After double to int updated value is"+i);

        /*
         * 
         * implicit conversion
         */
        int a=34;
        System.out.println("original a value is"+a);
        double d = a;
        System.out.println("After int to double updated value is"+d);
        /*
        
        16-01-24
        Explicit conversion: 1. double to float 2. double to long
        Implicit conversion: 1. int to long 2. int to float 3. long to double
        */
    }
}
