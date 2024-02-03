package operatorDemo;

import java.util.Scanner;

public class addscanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a,b,add;
        System.out.println("enter a value");
        a=sc.nextInt();

        System.out.println("Enter value of b");
        b=sc.nextInt();

        add=a+b;
        System.out.println("add is  "+add);
    }

}
