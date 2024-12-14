import java.util.*;//heirarhical inheritance
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
class c extends fire{
    public void r1(){
        System.out.println("hello boys");
    }
}
class Main{
    public static void main(String args[])
    {
        b f=new b();
        f.pl();
        f.r();
        c h=new c();
        h.r1();
        
    }
}

