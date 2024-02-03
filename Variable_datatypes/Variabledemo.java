package Variable_datatypes;

import java.util.Scanner;

public class Variabledemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter user name");
        String name =sc.next();

        System.out.println("enter user age");
        int age=sc.nextInt();

        System.out.println("enter user height");
        float height=sc.nextFloat();

        System.out.println("enter user per");
        double per=sc.nextDouble();

        System.out.println("enter user male");
        boolean male=sc.nextBoolean();

        System.out.println("enter user gender");
        String gender=sc.next();

        System.out.println("enter user mobile number");
        long mob=sc.nextLong();

        //name="Anuj";
        //age=19;
        //height=5.55f;
        //per=70.365;

        System.out.println("name is \t"+name);
        System.out.println("age is\t"+age);
        System.out.println("height is\t"+height);
        System.out.println("percentage is\t"+per);
        System.out.println("gender is\t"+gender);
        System.out.println("mobile number is\t"+mob);
        System.out.println("male"+male);
    }
}
