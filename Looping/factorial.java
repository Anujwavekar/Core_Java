package Looping;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,fact=1;
        System.out.println("enter number");
        int num= sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);        
    }
    

    
}
