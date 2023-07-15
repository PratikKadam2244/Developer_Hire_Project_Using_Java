import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.login.LoginContext;


class p1
{
    public void reg()
    {
        System.err.println("=======reg======");
        Scanner sc=new Scanner(System.in);
        System.err.println("enter name");

        ArrayList a= new ArrayList();
        a.add(sc.next());
        


        System.err.println("enter pass");
        ArrayList p= new ArrayList();
        p.add(sc.next());

        System.err.println(a);
        System.err.println(p);


       System.err.println("=======log======");
        System.err.println("enter name");
        ArrayList y= new ArrayList();
        y.add(sc.next());

        System.err.println("enter pass");
        ArrayList h= new ArrayList();
        h.add(sc.next());

        //p1 obj = new p1();
        if(h.contains(p))
        {
            System.err.println("sucess");
        }
        else
        {
            System.err.println("faild");
        }
    }  
}
public class Driver{
    public static void main(String[] args) 
    {
         p1 rr=new p1();
         rr.reg();
        //p2 ref =new p2();
        

        //ArrayList b=new ArrayList();

    }

        // public static void Login() 
        // {
        //     Scanner 
        //     String d=sc.next();
            
        //     System.err.println("enter un");
        //     if(a.contains(c))
        //     {
        //     System.err.println("sucess");
        //     }
        //     else
        //     {
        //         System.err.println("invalid ");
        //     }
        // }
    
}
