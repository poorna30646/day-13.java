import java.util.*;
class library
{
    public void student()
    {
        System.out.println("Hello Student! the no of books you can buy is : 3 ");
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter how many books do you want?:");
        int a=sc1.nextInt();
        int b=3-a;
        if(a>3){
            System.out.println("You can't buy books! ");
        }
        else{
            System.out.println("you was borroud the " + a + " books");
        }
        if(b<=0){
            System.out.println("your limit was exceeded!");
        }
        else{
            System.out.println("the remaining books you can buy is:"+b);
        }

    }
}
class teacher extends library{
    public void teacher1(){
        System.out.println("Hello Teacher!the no of books you can buy is : 10  ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many books do you want?:");
        int c=sc.nextInt();
        int d=10-c;
        if(c>10){
            System.out.println("You can't buy books!");
        }
        else{
            System.out.println("you was borroud the " + c + " books");
        }
        if(d<=0){
            System.out.println("your limit was exceeded!");
        }
        else{
            System.out.println("the remaining books you can buy is:"+d);
        }

        

    }
}
class Main{
    public static void main(String args[])
    {
        teacher f=new teacher();
        f.student();
        f.teacher1();
    }
}
