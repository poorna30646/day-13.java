import java.util.*;
class fire
{
    public void pl()
    {
        System.out.println("hello students");

    }
}
class b extends fire{
    public void r(){
        System.out.println("hello teachers");

    }
}
class Main{
    public static void main(String args[])
    {
        b f=new b();
        f.pl();
        f.r();
        
    }
}
