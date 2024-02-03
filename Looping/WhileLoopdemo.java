package Looping;

public class WhileLoopdemo {
    public static void main(String[] args) {
        int i=1;
        while (i<=100) {
            if (i%2==0) 
            {
                System.out.println("\tthe given is even number\t"+i);   
                
            }
            else
            {
                System.out.print("\tthe given odd number is\t"+i);
            }
            i++;
        }

    }
    
}
