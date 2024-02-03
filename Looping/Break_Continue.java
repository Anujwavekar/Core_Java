package Looping;

public class Break_Continue {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=20;i++)
        {
            if(i==6)
            {
                break;
            
            }
            System.out.println(i);

        }
        System.out.println("for loop with continue");

        //for loop witj continue
        for(i=1;i<=20;i++)
        {
            if(i==5)
            continue;
            System.out.println(i);
        }
        
    }
}
