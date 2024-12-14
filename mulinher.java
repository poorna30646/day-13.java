import java.util.*;//multilevel inheritance 
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
class c extends b{
    public void r1(){
        System.out.println("hello proffessors");
    }
}
class Main{
    public static void main(String args[])
    {
        c f=new c();
        f.pl();
        f.r();
        f.r1();
        
    }
}

