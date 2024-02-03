package DataType;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi,r,area;
        pi=3.14f;
        System.out.println("enter value of r");
        r=sc.nextInt();
        area=pi*r*r;
        System.out.println("enter value of r\t"+area);

    }
}
