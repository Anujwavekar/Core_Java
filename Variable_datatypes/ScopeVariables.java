package Variable_datatypes;

public class ScopeVariables {

    //scope global for pi
    float pi=3.14f;
    int result;

    void circleArea(int r)
    {
        //scope local for area
        float area = pi * r * r;
        System.out.println("Area of circle is"+area);
    }
    void add(int a, int b)
    {
        result = a+b;
        System.out.println("result is"+result);
    }
    void div(int a, int b)
    {
        result = a/b;
        System.out.println("div is"+result);
    }

    void display()
    {
        System.out.println("Pi value is"+pi);
        //System.out.println(area);
    }
    public static void main(String[] args) {

        ScopeVariables scopeVariables = new ScopeVariables();
        scopeVariables.display();
        scopeVariables.circleArea(10);
        
    }
}
