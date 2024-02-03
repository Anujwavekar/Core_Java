package Switch_break;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println("enter yoour favourate color");
        Scanner sc=new Scanner(System.in);
        String color=sc.next();
        switch (color){
            case "B":
                System.out.println("you like black color");
                break;
            case "R":
                System.out.println("ypu like red color");
                break;
            case "G":
                System.out.println("you like green color");
                break;
            default:
                System.out.println("you dont like any color");
                break;
            

        }
    }
}
