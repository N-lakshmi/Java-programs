package static1;
public class Static1 
{
    static int a=10;
    static int b;
    static void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
    static 
    {
        System.out.println("Static...");
        b=a*20;
    }
    public static void main(String[] args) 
    {
        System.out.println("main");
        print();
    }
    
}