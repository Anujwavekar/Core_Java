package Variable_datatypes;
//variable scope 1.local
//                 2.global
//type variable  1.local variable
//               2.instance variable
public class scope {
    //instance variable   and   global scape
    float pi=3.14f;

    void circleArea()
    {
        //LOcal variable ,local scope
    int r=10;
    float area=pi*r*r;
    System.out.println("area of circle is "+area);
    }

    public static void main(String[] args) {
        {
            scope sd=new scope();
            sd.circleArea();
            sd.area();
        }
    }
    void area()
    {
        System.out.println("pi of circle is "+pi);

    }
    
}
