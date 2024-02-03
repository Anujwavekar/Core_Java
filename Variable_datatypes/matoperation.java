package Variable_datatypes;

import java.util.Scanner;

public class matoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number for addition");
        int a=sc.nextInt();
        System.out.println("enter 2nd number for addition");
        int b=sc.nextInt();
        System.out.println("addition\t"+(a+b));
        System.out.println("sub\t"+(a-b));
        System.out.println("mul\t"+(a*b));
        System.out.println("divi\t"+(a/b));

    }
}
