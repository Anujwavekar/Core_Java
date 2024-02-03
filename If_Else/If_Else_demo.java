package If_Else;

import java.util.Scanner;


public class If_Else_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("enter your marks");
        marks =sc.nextInt();

        if(marks>=70){
            System.out.println("grade o");
        }
        else if(marks<70 && marks>60)
        {
        System.out.println("grde a");
        }else if(marks<60 && marks>50)
        {
            System.out.println("grade b");
        }else if(marks<50 && marks>40)
        {
            System.out.println("grade is c");
        }
        else 
        {
            System.out.println("grade f");
        }
        
    }
}
