import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

class Register
{
    String name1 ;
    String pass1;
    long phonenumber;
    
    public  void reg()
    {
        System.out.println("==========================================");
        System.out.println("  --------- Registration Page ---------");
        System.out.println("==========================================");

        System.out.println("Enter Full Name: ");
        Scanner sc1=new Scanner(System.in);
        String fullname = sc1.next();
        System.out.println("Enter Phone Number: ");
        Scanner sc2=new Scanner(System.in);

        // Using Try-Catch Block
        try
        {
            long phonenumber = sc2.nextInt();
            //System.err.println("Your PhoneNumber: "+ phonenumber);
        }
        catch(InputMismatchException a)
        {
            System.err.println(">>Invalid Phone Number, Try Again.<<");
            reg();
        }
        
        //System.out.println("Your PhoneNumber: "+ phonenumber);
        // System.out.println("Your Name: "+ fullname);
        System.out.println();

        System.out.println("Enter User Name: ");
        Scanner sc=new Scanner(System.in);
        name1 = sc.next();
        // name=length>5;
    
        System.out.println("Enter pass: ");
        pass1 = sc.next();

        System.err.println();
        System.err.println("<< Your Details >>");
        System.out.println("Your Name: "+ fullname);
        System.out.println("Your PhoneNumber: "+ phonenumber);
        System.out.println("Your UserName: "+ name1);
        login();
    }

    public  void login()
    {
        System.out.println("==========================================");
        System.out.println("  --------- Login Page ----------");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Enter User Name: ");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        // name=length>5;
        
        System.out.println("Enter pass: ");
        String pass = sc.next();

        if(name.equals(name1) && pass.equals(pass1))
        {
    
            System.out.println();
            System.out.println("===============================================");
            System.out.println("====== 🙏WELLCOME TO CODER WORKSHOP🙏 ======");
            System.out.println("===============================================");
            System.out.println();
            info s=new info();
            s.Select();
        }
        else
        {
            System.out.println();
            System.out.println("Invalid Data OR Dont Match The Username And Pass, Please Try Again....");
            login();
        }
    }    
}


//=============Select===============
class info
{
    public void Select()
    {
        System.out.println("=== Which category Trainer By You: ===");
        System.out.println("Enter 1) Developers");
        System.out.println("Enter 2) Testers");
        System.out.println("Enter 3) Network Enginer");
        System.out.println("Enter 4) Specialist Trainer");
        System.err.println(">>> You Can Go To Login Page Then Press 7. <<<");
        System.out.println(" Enter Your Choices: ");

        Scanner o=new Scanner(System.in);
        int option=o.nextInt(); 
        switch (option)
	   {
            case 1 :
            Developers D=new Developers();
            D.Developer();
            break;

            case 2 :
            Testers T=new Testers();
            T.Test();
            break;

            case 3:
            Network N=new Network();
            N.Network_Enginer();
            break;

            case 4:
            programings P=new programings();
            P.programing();
            break;

            case 7:
            Register Pr=new Register();
            Pr.login();
            break;
            
            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            System.out.println();	
            Select();
        }
    }
}

//=================Developers======
class Developers extends info
{
    public static void Developer()
    {
        System.out.println("==========================================");
        System.err.println("       ------ Developers ------");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("=== Which Type Of Developer Choices You: ===");
        System.out.println("Enter 1) Application Developer");
        System.out.println("Enter 2) Website Developer");
        System.out.println("Enter 3) Android Developer");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: ");
        //Scanner d=new Scanner(System.in);
        try
        {
            Scanner d=new Scanner(System.in);
            int option=d.nextInt(); 
            switch (option)
	   {
            case 1 :
            AppDev appdev =new AppDev();
            appdev.ApDeveloper();
            break;

            case 2:
            WebDev WD =new WebDev();
            WD.WebDeveloper();
            break;
            
            case 3:
            AndroidDev AD =new AndroidDev();
            AD.AndroidDeveloper();
            break;

            case 9:
            info ii=new info();
            ii.Select();
            break;

            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            System.out.println();	
            Developer();
        }
        }
        catch(InputMismatchException c)
        {
            System.err.println("Invalid Input/ Only Number");
            Developer();
        }
    //     switch (option)
	//    {
    //         case 1 :
    //         AppDev appdev =new AppDev();
    //         appdev.ApDeveloper();
    //         break;

    //         case 2:
    //         WebDev WD =new WebDev();
    //         WD.WebDeveloper();
    //         break;
            
    //         case 3:
    //         AndroidDev AD =new AndroidDev();
    //         AD.AndroidDeveloper();
    //         break;

    //         case 9:
    //         info ii=new info();
    //         ii.Select();
    //         break;

    //         default :
    //         System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
    //         System.out.println();	
    //         Developer();
    //     }
    }
}


class AppDev 
{
    public static void ApDeveloper()
    {
    System.out.println();
    System.out.println("=== Which Type Of Developer Choices You: ===");
    System.out.println("Enter 1) JAVA Developer");
    System.out.println("Enter 2) PYTHON Developer");
    System.out.println("Enter 3) C# Developer");
    System.err.println(">>> You Can Go Back Then Press 9. <<<");
    System.err.println();
    System.out.println(" Enter Your Choices: ");
    Scanner d=new Scanner(System.in);
    int option=d.nextInt(); 
    switch (option)
	   {
            case 1 :
            java();
            break;

            case 2:
            python();
            break;
            
            case 3:
            Csharp();
            break;

            case 9:
            Developers dd=new Developers();
            dd.Developer();
            break;

            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            System.out.println();	
            ApDeveloper();
        }
    }
    
    public static void java()
    {
        
        System.err.println();
        System.out.println("Details Of JAVA Trainer: ");
        System.out.println("-knowledge of Data Types.");
        System.out.println("-Good of OOPs Concepts.");
        System.out.println("-Experts in JAVA.");
        System.out.println("-Experts in Advanced JAVA.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        // System.err.println();
        System.err.println();
        System.out.println("===Price:- Rs.52000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        // int option=j.nextInt();
        //String no=sc.next();
        String n=sc.next();

        switch(n)
        {
            case "y":
            Jpay jpy=new Jpay();
            jpy.Ppay();
            break;

            case "Y":
            Jpay jpy1=new Jpay();
            jpy1.Ppay();
            break;

            case "n":
            ApDeveloper();
            break;

            case "N":
            ApDeveloper();
            break;

            case "p":
            AppDev aa=new AppDev();
            aa.ApDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            java();
        }
    }
    
    public static void python()
    {
        System.err.println();
        System.out.println("Details Of PYTHON Trainer: ");
        System.out.println("-knowledge of Data Types.");
        System.out.println("-Good knowledge of Modules.");
        System.out.println("-Experts in  OOPs Concepts.");
        System.out.println("-Good in Mongo DB.");
        System.out.println("-Experts in Python.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("===Price:- Rs.48000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n){
            case "y":
            Ppay py=new Ppay();
            py.pPayment();
            break;

            case "Y":
            Ppay pyy=new Ppay();
            pyy.pPayment();
            break;

            case "n":
            ApDeveloper();
            break;

            case "N":
            ApDeveloper();
            break;

            case "p":
            AppDev aa=new AppDev();
            aa.ApDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            python();
        }
    }
    
    public static void Csharp()
    {
        System.err.println();
        System.out.println("Details Of Csharp(C#) Trainer: ");
        System.out.println("-knowledge of Data Types.");
        System.out.println("-Good knowledge of OOPs Concepts.");
        System.out.println("-Experts in Programming.");
        System.out.println("-Experts in C# Language.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("===Price:- Rs.34000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            cpay c=new cpay();
            c.cPayment();
            break;

            case "Y":
            cpay cc=new cpay();
            cc.cPayment();
            break;

            case "n":
            ApDeveloper();
            break;

            case "N":
            ApDeveloper();
            break;

            case "p":
            AppDev aa=new AppDev();
            aa.ApDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Csharp();
        }
    }

}

class Jpay 
{
    public  void Ppay()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                jupi();
                break;

            case 2:
                jnet();
                break;

            case 3:
                jcash();
                break;  
                
            case 9:
                AppDev ap=new AppDev();
                ap.ApDeveloper();
                break;

            default:
                System.err.println();
                Ppay();
                break;
        }
    }

    public void jupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        long u=sc.nextLong();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println("== Price:- Rs.52000/-");
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.JBill();
    }

    public void jnet() 
    {
        System.err.println("===== NetBanking Payments =====");

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Mobile Number: ");
        int b=sc.nextInt();

        System.err.println("Enter Your Bank Name: ");
        String c=sc.nextLine();

        System.err.println("Enter Your Bank Branch Location: ");
        String d=sc.nextLine();

        System.err.println("Enter Your Account Numbwer: ");
        long e=sc.nextLong();

        System.err.println("Your Mobile Number: "+ b);
        System.err.println("Your Bank Name: "+ c);
        System.err.println("Your Bank Branch Location: "+ d);
        System.err.println("Your Account Numbwer: "+ e);
        System.err.println("== Price:- Rs.52000/-");

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.JBill();
    }

//----- private data
    private double money=52000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    public void jcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        PayCash ref=new PayCash();
        //ref.setMoney(150000);
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=48000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            jcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.JBill();
        }
    }

    
}

class Ppay
{
    public  void pPayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Pupi();
                break;

            case 2:
                Pnet();
                break;

            case 3:
                Pcash();
                break;  
                
            case 9:
                AppDev ap=new AppDev();
                ap.ApDeveloper();
                break;

            default:
                System.err.println();
                pPayment();
                break;
        }
    }

    public void Pupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.pBill();
    }

    public void Pnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.pBill();
    }

    private double money=48000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Pcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        Ppay ref=new Ppay();
        //ref.setMoney(150000);
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=45000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Pcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.pBill();
        }
    }

}

class cpay
{
    public  void cPayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                cupi();
                break;

            case 2:
                cnet();
                break;

            case 3:
                ccash();
                break;  
                
            case 9:
                AppDev ap=new AppDev();
                ap.ApDeveloper();
                break;

            default:
                System.err.println();
                cPayment();
                break;
        }
    }

    public void cupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.cBill();
    }

    public void cnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.cBill();
    }

    private double money=34000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
   
    public void ccash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        cpay ref=new cpay();
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=30000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            ccash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.cBill();
        }
    }

}



class WebDev
{
    public static void WebDeveloper()
    {
    System.out.println();
    System.out.println("=== Which Type Of Web Developer Choices You: ");
    System.out.println("Enter 1) HTML And CSS Web Developer");
    System.out.println("Enter 2) JavaScript Web Developer");
    System.out.println("Enter 3) Web FramWork Developer");
    System.err.println(">>> You Can Go Back Then Press 9. <<<");
    System.out.println(" Enter Your Choices: ");
    Scanner d=new Scanner(System.in);
    int option=d.nextInt(); 
        switch (option)
        {
            case 1 :
            html();
            break;

            case 2:
            js();
            break;
            
            case 3:
            framework();
            break;

            case 9:
            Developers dd=new Developers();
            dd.Developer();
            break;

            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            //System.out.println();	
            WebDeveloper();
        }
    }

    public static void html()
    {
        System.err.println();
        System.out.println("Details Of HTML And CSS Trainer: ");
        System.out.println("-knowledge of HTML.");
        System.out.println("-Good of CSS Concepts.");
        System.out.println("-Experts in PHP.");
        System.out.println("-Good in Frontend Developer.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.18,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            Hpay py=new Hpay();
            py.hpay();
            break;

            case "Y":
            Hpay pyy=new Hpay();
            pyy.hpay();
            break;

            case "n":
            WebDeveloper();
            break;

            case "N":
            WebDeveloper();
            break;

            case "p":
            WebDev w=new WebDev();
            w.WebDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            html();
        }
    }

    public static void js()
    {
        System.err.println();
        System.out.println("Details Of JavaScript Trainer: ");
        System.out.println("-knowledge of JavaScript Concept.");
        System.out.println("-Good of JS Code.");
        System.out.println("-Experts in Responsive Website.");
        System.out.println("-Good in Frontend Developer.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.20,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            Jspay js=new Jspay();
            js.jspay();
            break;

            case "Y":
            Jspay jss=new Jspay();
            jss.jspay();
            break;

            case "n":
            WebDeveloper();
            break;

            case "N":
            WebDeveloper();
            break;

            case "p":
            WebDev w=new WebDev();
            w.WebDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            js();
        }
    }

    public static void framework()
    {
        System.err.println();
        System.out.println(" Details Of FrameWork Trainer: ");
        System.out.println("-There are Two Types Of FrameWork Trainers.");
        System.out.println("Enter 1] For Boostrap Trainer.");
        System.out.println("Enter 2] For WordPress Trainer.");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
            Boostrap();
            break;

            case 2:
            WordPress();
            break;

            case 9:
            WebDev w=new WebDev();
            w.WebDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            framework();
        }
    }

    public static void Boostrap()
    {
        System.err.println();
        System.out.println("Details Of Boostrap Framework: ");
        System.out.println("-knowledge of Boostrap Concept.");
        System.out.println("-Good of Boostrap Command.");
        System.out.println("-Experts in Use Boostrap.");
        System.out.println("-Good in Web Design in Boostrap.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.30,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            Bootspay py=new Bootspay();
            py.bootspay();
            break;

            case "Y":
            Bootspay pyy=new Bootspay();
            pyy.bootspay();
            break;

            case "n":
            WebDeveloper();
            break;

            case "N":
            WebDeveloper();
            break;

            case "p":
            WebDev w=new WebDev();
            w.framework();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Boostrap();
        }
    }

    public static void WordPress()
    {
        System.err.println();
        System.out.println("Details Of WordPress Framework: ");
        System.out.println("-knowledge of WordPress Concept.");
        System.out.println("-Good of WordPress Drag And Drop website.");
        System.out.println("-Experts in Use WordPress.");
        System.out.println("-Good in Web Design in WordPress.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.25,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            Wordpay py=new Wordpay();
            py.Wpay();
            break;

            case "Y":
            Wordpay pyy=new Wordpay();
            pyy.Wpay();
            break;

            case "n":
            WebDeveloper();
            break;

            case "N":
            WebDeveloper();
            break;

            case "p":
            WebDev w=new WebDev();
            w.framework();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            WordPress();
        }
    }
}

class Hpay 
{
    public  void hpay()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                hupi();
                break;

            case 2:
                hnet();
                break;

            case 3:
                hcash();
                break;  
                
            case 9:
                WebDev ap=new WebDev();
                ap.html();
                break;

            default:
                System.err.println();
                hpay();
                break;
        }
    }

    public void hupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println("=== Price:- Rs.18,000/-");
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.hBill();
    }

    public void hnet() 
    {
        System.err.println("===== NetBanking Payments =====");

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Mobile Number: ");
        int b=sc.nextInt();

        System.err.println("Enter Your Bank Name: ");
        String c=sc.next();

        System.err.println("Enter Your Bank Branch Location: ");
        String d=sc.next();

        System.err.println("Enter Your Account Numbwer: ");
        int e=sc.nextInt();

        System.err.println("Your Mobile Number: "+ b);
        System.err.println("Your Bank Name: "+ c);
        System.err.println("Your Bank Branch Location: "+ d);
        System.err.println("Your Account Numbwer: "+ e);
        System.err.println("=== Price:- Rs.18,000/-");

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.hBill();
    }

//----- private data
    private double money=18000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    public void hcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        Hpay ref=new Hpay();
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=15000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            hcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.hBill();
        }
    }

    
}

class Jspay 
{
    public  void jspay()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                jupi();
                break;

            case 2:
                jnet();
                break;

            case 3:
                jscash();
                break;  
                
            case 9:
                WebDev ap=new WebDev();
                ap.js();
                break;

            default:
                System.err.println();
                jspay();
                break;
        }
    }

    public void jupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println("=== Price:- Rs.20,000/-");
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.jsBill();
    }

    public void jnet() 
    {
        System.err.println("===== NetBanking Payments =====");

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Mobile Number: ");
        int b=sc.nextInt();

        System.err.println("Enter Your Bank Name: ");
        String c=sc.next();

        System.err.println("Enter Your Bank Branch Location: ");
        String d=sc.next();

        System.err.println("Enter Your Account Numbwer: ");
        int e=sc.nextInt();

        System.err.println("Your Mobile Number: "+ b);
        System.err.println("Your Bank Name: "+ c);
        System.err.println("Your Bank Branch Location: "+ d);
        System.err.println("Your Account Numbwer: "+ e);
        System.err.println("=== Price:- Rs.20,000/-");

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.jsBill();
    }

//----- private data
    private double money=20000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    public void jscash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        Jspay ref=new Jspay();
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=15000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            jscash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.jsBill();
        }
    }

    
}

class Bootspay 
{
    public  void bootspay()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Bupi();
                break;

            case 2:
                Bnet();
                break;

            case 3:
                Bcash();
                break;  
                
            case 9:
                WebDev ap=new WebDev();
                ap.Boostrap();
                break;

            default:
                System.err.println();
                bootspay();
                break;
        }
    }

    public void Bupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println("=== Price:- Rs.30,000/-");
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.bootBill();
    }

    public void Bnet() 
    {
        System.err.println("===== NetBanking Payments =====");

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Mobile Number: ");
        int b=sc.nextInt();

        System.err.println("Enter Your Bank Name: ");
        String c=sc.next();

        System.err.println("Enter Your Bank Branch Location: ");
        String d=sc.next();

        System.err.println("Enter Your Account Numbwer: ");
        int e=sc.nextInt();

        System.err.println("Your Mobile Number: "+ b);
        System.err.println("Your Bank Name: "+ c);
        System.err.println("Your Bank Branch Location: "+ d);
        System.err.println("Your Account Numbwer: "+ e);
        System.err.println("=== Price:- Rs.30,000/-");

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.bootBill();
    }

//----- private data
    private double money=30000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    public void Bcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        Bootspay ref=new Bootspay();
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=25000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Bcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.bootBill();
        }
    }

    
}

class Wordpay 
{
    public  void Wpay()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Wupi();
                break;

            case 2:
                Wnet();
                break;

            case 3:
                Wcash();
                break;  
                
            case 9:
                WebDev ap=new WebDev();
                ap.WordPress();
                break;

            default:
                System.err.println();
                Wpay();
                break;
        }
    }

    public void Wupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println("=== Price:- Rs.25,000/-");
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.wordBill();
    }

    public void Wnet() 
    {
        System.err.println("===== NetBanking Payments =====");

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Mobile Number: ");
        int b=sc.nextInt();

        System.err.println("Enter Your Bank Name: ");
        String c=sc.next();

        System.err.println("Enter Your Bank Branch Location: ");
        String d=sc.next();

        System.err.println("Enter Your Account Numbwer: ");
        int e=sc.nextInt();

        System.err.println("Your Mobile Number: "+ b);
        System.err.println("Your Bank Name: "+ c);
        System.err.println("Your Bank Branch Location: "+ d);
        System.err.println("Your Account Numbwer: "+ e);
        System.err.println("=== Price:- Rs.25,000/-");

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.wordBill();
    }

//----- private data
    private double money=25000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    public void Wcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        Wordpay ref=new Wordpay();
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=22000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Wcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.wordBill();
        }
    }

    
}



class AndroidDev
{
    public static void AndroidDeveloper()
    {
    System.out.println();
    System.out.println("=== Which Type Of Android Developer Choices You: ");
    System.out.println("Enter 1) Kotlin Android Developer");
    System.out.println("Enter 2) Java Android Developer");
    System.out.println("Enter 3) Fluter Android Developer");
    System.err.println(">>> You Can Go Back Then Press 9. <<<");
    System.err.println();
    System.out.println(" Enter Your Choices: ");

    Scanner d=new Scanner(System.in);
    int option=d.nextInt(); 
        switch (option)
        {
            case 1 :
            Kotlin();
            break;

            case 2:
            JavaAndroid();
            break;
            
            case 3:
            Fluter();
            break;

            case 9:
            Developers dd=new Developers();
            dd.Developer();
            break;


            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            //System.out.println();	
            AndroidDeveloper();
        }
    }

    public static void Kotlin()
    {
        System.err.println();
        System.out.println("Details Of Kotlin Android Trainer: ");
        System.out.println("-knowledge of Android.");
        System.out.println("-Good in Verion Of Android.");
        System.out.println("-Experts For Kotlin Language.");
        System.out.println("-Goods in Android Studio.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.68,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            KotlinPay py=new KotlinPay();
            py.kPayment();
            break;

            case "Y":
            KotlinPay pyy=new KotlinPay();
            pyy.kPayment();
            break;

            case "n":
            AndroidDeveloper();
            break;

            case "N":
            AndroidDeveloper();
            break;

            case "p":
            AndroidDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Kotlin();
        }
    }

    public static void JavaAndroid()
    {
        System.err.println();
        System.out.println("Details Of Java Android Trainer: ");
        System.out.println("-knowledge of Android.");
        System.out.println("-Good in XML Language.");
        System.out.println("-Experts For Java Android Language.");
        System.out.println("-Goods in Android Studio.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.62,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            JAndroidPay py=new JAndroidPay();
            py.JApayment();
            break;

            case "Y":
            JAndroidPay pyy=new JAndroidPay();
            pyy.JApayment();
            break;

            case "n":
            AndroidDeveloper();
            break;

            case "N":
            AndroidDeveloper();
            break;

            case "p":
            AndroidDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            JavaAndroid();
        }
    }

    public static void Fluter()
    {
        System.err.println();
        System.out.println("Details Of Fluter Android Trainer: ");
        System.out.println("-knowledge of Android.");
        System.out.println("-Good in Fluter Commands.");
        System.out.println("-Experts For Fluter Language.");
        System.out.println("-Goods in Android Studio.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.77,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            FPay py=new FPay();
            py.Fpayment();
            break;

            case "Y":
            FPay pyy=new FPay();
            pyy.Fpayment();
            break;

            case "n":
            AndroidDeveloper();
            break;

            case "N":
            AndroidDeveloper();
            break;

            case "p":
            AndroidDeveloper();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Fluter();
        }
    }

}

class KotlinPay
{
    public  void kPayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Kupi();
                break;

            case 2:
                Knet();
                break;

            case 3:
                Kcash();
                break;  
                
            case 9:
                AndroidDev ap=new AndroidDev();
                ap.Kotlin();
                break;

            default:
                System.err.println();
                kPayment();
                break;
        }
    }

    public void Kupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.KBill();
    }

    public void Knet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.KBill();
    }

    private double money=68000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Kcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        KotlinPay ref=new KotlinPay();
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=60000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Kcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.KBill();
        }
    }

}

class JAndroidPay
{
    public  void JApayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                JAupi();
                break;

            case 2:
                JAnet();
                break;

            case 3:
                JAcash();
                break;  
                
            case 9:
                AndroidDev ap=new AndroidDev();
                ap.JavaAndroid();
                break;

            default:
                System.err.println();
                JApayment();
                break;
        }
    }

    public void JAupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.JABill();
    }

    public void JAnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.JABill();
    }

    private double money=62000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void JAcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        JAndroidPay ref=new JAndroidPay();
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=60000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            JAcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.JABill();
        }
    }

}

class FPay
{
    public  void Fpayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Fupi();
                break;

            case 2:
                Fnet();
                break;

            case 3:
                Fcash();
                break;  
                
            case 9:
                AndroidDev ap=new AndroidDev();
                ap.Fluter();
                break;

            default:
                System.err.println();
                Fpayment();
                break;
        }
    }

    public void Fupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.FBill();
    }

    public void Fnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.FBill();
    }

    private double money=77000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Fcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        FPay ref=new FPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=70000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Fcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.FBill();
        }
    }

}


//===pay method

class Payments
{
    public  void Payment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println(" Choices Payment Method: ");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Cash");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) {
            case 1:
                PayUpi pu=new PayUpi();
                pu.UPi();
                break;
            case 2:
                PayNet pn=new PayNet();
                pn.NetBanking();
                break;
            case 3:
                PayCash pc=new PayCash();
                pc.Cash();
                break;    

            default:
                System.err.println();
                Payment();
                break;
        }
    }
}

//=====upi part
class PayUpi
{
    public void UPi()
    {
        System.err.println("UPI");
    }
}

//=====net banking part
class PayNet
{
    public void NetBanking()
    {
        System.err.println("NetBanking");
    }
}


//=====cash part
class PayCash
{
    private double money=52000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }

        // public void withdraw()
        // {
        //     System.out.println("Withdraw the cash");
        // }

    public void Cash()
    {
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        PayCash ref=new PayCash();
        //ref.setMoney(150000);
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=48000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Cash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.JBill();
        }
        // switch(i)
        // {
        //     case 1:
        //         ref.setMoney(i);
        //         System.err.println("hello");
        //         break;
            
        //     default:
        //         Cash();
        //         break;
        // }
 

    }
}

class pPayCash
{
    private double money=40000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }

    

    public void Cash()
    {
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        pPayCash ref=new pPayCash();
        //ref.setMoney(150000);
        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=35000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Cash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.pBill();
        }
        // switch(i)
        // {
        //     case 1:
        //         ref.setMoney(i);
        //         System.err.println("hello");
        //         break;
            
        //     default:
        //         Cash();
        //         break;
        // }


       // ref.withdraw(); 

    }
}


//=====Invoice part

class Invoice
{
    public void JBill()
    {
        
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.out.println("Devloper name:= pratik kadam.");
        System.out.println("Subject:= JAVA.");
        System.out.println("Location:-Thane.");

        LocalDate LD = LocalDate.now(); // Create a date object
        LocalTime LT= LocalTime.now();  // Create a time object
        System.out.println("Date:- "+LD); // Display the current date
        System.out.println("Time:- "+LT);

        //PayCash reff=new PayCash();
        //reff.setMoney(i);
        //System.err.println(reff.setMoney(i));
        //System.out.println(">> Price:= "+ i );

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }


    public void pBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Raj Desai.");
        System.out.println("Subject:= Python.");
        System.out.println("Location:-Mumbai.");

        LocalDate LD = LocalDate.now(); // Create a date object
        LocalTime LT= LocalTime.now();  // Create a time object
        System.out.println("Date:- "+LD); // Display the current date
        System.out.println("Time:- "+LT);
        // Register c=new Register();
        // c.phonenumber;
        PayCash reff=new PayCash();
        //reff.setMoney(i);
        //System.err.println(reff.setMoney(i));
        //System.out.println(">> Price:= "+ i );

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

 
    public void cBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Sushmit Pathare.");
        System.out.println("Subject:= C#.");
        System.out.println("Location:= Bhiwandi.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);

        //cpay ccc=new cpay();
        //ccc.getMoney(this.money);
       // ccc.setMoney(this.money);
        //System.err.println("Your Amount: "+ccc.getMoney());
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }


    public void hBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= vignesh malanm.");
        System.out.println("Subject:= HTML And CSS.");
        System.out.println("Location:= South.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);

        //cpay ccc=new cpay();
        //ccc.getMoney(this.money);
       // ccc.setMoney(this.money);
        //System.err.println("Your Amount: "+ccc.getMoney());
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void jsBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Krishna Pawar.");
        System.out.println("Subject:= JavaScript.");
        System.out.println("Location:= Ghatkopar.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);

        //cpay ccc=new cpay();
        //ccc.getMoney(this.money);
       // ccc.setMoney(this.money);
        //System.err.println("Your Amount: "+ccc.getMoney());
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void bootBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Vinay Krishna.");
        System.out.println("Subject:= Boostrap.");
        System.out.println("Location:= Karnataka.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);

        //cpay ccc=new cpay();
        //ccc.getMoney(this.money);
       // ccc.setMoney(this.money);
        //System.err.println("Your Amount: "+ccc.getMoney());
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void wordBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Leena Sase.");
        System.out.println("Subject:= WordPress.");
        System.out.println("Location:= Kalyan.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);

        //cpay ccc=new cpay();
        //ccc.getMoney(this.money);
       // ccc.setMoney(this.money);
        //System.err.println("Your Amount: "+ccc.getMoney());
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void KBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Namrata Kumbhar.");
        System.out.println("Subject:= Kotlin.");
        System.out.println("Location:= MiraRoad.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void JABill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Shivsai Gajual.");
        System.out.println("Subject:= JAVA Android.");
        System.out.println("Location:= Bhiwandi.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void FBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Devloper name:= Rhoit Pramanik.");
        System.out.println("Subject:= Fluter.");
        System.out.println("Location:= Kopar.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void MBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Tester name:= Tejashri Hedge.");
        System.out.println("Subject:= Manual.");
        System.out.println("Location:= CSMT.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void AuBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Tester name:= Swati Sing.");
        System.out.println("Subject:= Manual.");
        System.out.println("Location:= CSMT.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void DBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Trainer name:= Pramod Patil.");
        System.out.println("Subject:= Desktop Support.");
        System.out.println("Location:= Dadar.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void SBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Trainer name:= Vishakha Mehta.");
        System.out.println("Subject:= System Administrator.");
        System.out.println("Location:= Thane.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void SqlBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Trainer name:= Vinay Krishna.");
        System.out.println("Subject:= SQL.");
        System.out.println("Location:= South.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void AWSBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Trainer name:= Bikash jha.");
        System.out.println("Subject:= AWS.");
        System.out.println("Location:= Dombavli.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);

        // Register rr=new Register();
        // System.err.println("Your Mobile Number"+ rr.phonenumber);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }

    public void CloudBill()
    {
        System.err.println();
        System.out.println("==========================================");
        System.out.println("  =========== Your Invoice ===========");
        System.out.println("==========================================");
        System.err.println();
        //System.out.println("======= Your Invoice ======");
        System.out.println("Trainer name:= Javed Khan.");
        System.out.println("Subject:= Cloud.");
        System.out.println("Location:= Diva.");

        LocalDate LD = LocalDate.now(); 
        LocalTime LT= LocalTime.now();  
        System.out.println("Date:- "+LD); 
        System.out.println("Time:- "+LT);
        

        System.err.println();
        Thanks tx=new Thanks();
        tx.thx();
    }
}


//=================Testers======
class Testers extends info
{
    public static void Test()
    {
        System.out.println("==========================================");
        System.err.println("       ------ Testers ------");
        System.out.println("==========================================");
        System.out.println();
        System.out.println(" Which Type Of Test Enginer Choices You: ");
        System.out.println("Enter 1) Manual Testing Enginner");
        System.out.println("Enter 2) Automation Testing Enginner");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.out.println(" Enter Your Choices: ");

    Scanner d=new Scanner(System.in);
    int option=d.nextInt(); 
        switch (option)
        {
            case 1 :
            Manual();
            break;

            case 2:
            Automation();
            break;

            case 9:
            info ii=new info();
            ii.Select();
            break;

            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            //System.out.println();	
            Test();
        }
    }

    public static void Manual()
    {
        System.err.println();
        System.out.println("Details Of Manual Testing Trainer: ");
        System.out.println("-knowledge of Software Testing.");
        System.out.println("-Good knowledge in Selenium.");
        System.out.println("-Experts For Test The Softawre.");
        System.out.println("-Goods in API.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.28,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            ManualPay py=new ManualPay();
            py.Mpayment();
            break;

            case "Y":
            ManualPay pyy=new ManualPay();
            pyy.Mpayment();
            break;

            case "n":
            Test();
            break;

            case "N":
            Test();
            break;

            case "p":
            // Testers dd=new Testers();
            // dd.Test();
            Testers.Test();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Manual();
        }
    }

    public static void Automation()
    {
        System.err.println();
        System.out.println("Details Of Automation Testing Trainer: ");
        System.out.println("-knowledge of Software Testing.");
        System.out.println("-Good knowledge in PostMan System.");
        System.out.println("-Experts For Test The Softawre.");
        System.out.println("-Goods in API And Database.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.32,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            AutomationPay py=new AutomationPay();
            py.Aupayment();
            break;

            case "Y":
            AutomationPay pyy=new AutomationPay();
            pyy.Aupayment();
            break;
            
            case "n":
            Test();
            break;
            
            case "N":
            Test();
            break;

            case "p":
            Testers dd=new Testers();
            dd.Test();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Automation();
        }
    }

}


class ManualPay
{
    public  void Mpayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Mupi();
                break;

            case 2:
                Mnet();
                break;

            case 3:
                Mcash();
                break;  
                
            case 9:
                Testers ap=new Testers();
                ap.Manual();
                break;

            default:
                System.err.println();
                Mpayment();
                break;
        }
    }

    public void Mupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.MBill();
    }

    public void Mnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.MBill();
    }

    private double money=28000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Mcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        ManualPay ref=new ManualPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=20000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Mcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.MBill();
        }
    }

}

class AutomationPay
{
    public  void Aupayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Auupi();
                break;

            case 2:
                Aunet();
                break;

            case 3:
                Aucash();
                break;  
                
            case 9:
                Testers ap=new Testers();
                ap.Automation();
                break;

            default:
                System.err.println();
                Aupayment();
                break;
        }
    }

    public void Auupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.AuBill();
    }

    public void Aunet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.AuBill();
    }

    private double money=32000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Aucash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        AutomationPay ref=new AutomationPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=25000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Aucash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.AuBill();
        }
    }

}


//=================Networks======
class Network extends info
{
    public static void Network_Enginer()
    {
        System.out.println("==========================================");
        System.err.println("       ------ Network Enginer ------");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("== Which Type Of Network Enginner Choices You: ");
        System.out.println("Enter 1) Desktop Support Enginner");
        System.out.println("Enter 2) System Administrator Enginner");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.out.println(" Enter Your Choices: ");

        Scanner d=new Scanner(System.in);
        int option=d.nextInt(); 
        switch (option)
        {
            case 1 :
            Desktop();
            break;

            case 2:
            System();
            break;

            case 9:
            info ii=new info();
            ii.Select();
            break;

            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            //System.out.println();	
            Network_Enginer();
        }
    }

    public static void Desktop()
    {
        System.err.println();
        System.out.println("Details Of Desktop Support Enginner: ");
        System.out.println("-knowledge of PC And Laptop.");
        System.out.println("-Good knowledge in Networking.");
        System.out.println("-Experts For Maintain AntiVirus.");
        System.out.println("-Goods in Support desktop.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.18,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            DeskPay py=new DeskPay();
            py.Dpayment();
            break;

            case "Y":
            DeskPay pyy=new DeskPay();
            pyy.Dpayment();
            break;

            case "n":
            Network_Enginer();
            break;

            case "N":
            Network_Enginer();
            break;

            case "p":
            Network_Enginer();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Desktop();
        }
    }

    public static void System()
    {
        System.err.println();
        System.out.println("Details Of Desktop Support Enginner: ");
        System.out.println("-knowledge of PC And Laptop.");
        System.out.println("-Good knowledge in Networking.");
        System.out.println("-Experts For Troubleshoot.");
        System.out.println("-Goods for Server.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.15,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            SysPay py=new SysPay();
            py.Spayment();
            break;

            case "Y":
            SysPay pyy=new SysPay();
            pyy.Spayment();
            break;

            case "n":
            Network_Enginer();
            break;

            case "N":
            Network_Enginer();
            break;

            case "p":
            Network_Enginer();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            System();
        }
    }

}

class DeskPay
{
    public  void Dpayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Dupi();
                break;

            case 2:
                Dnet();
                break;

            case 3:
                Dcash();
                break;  
                
            case 9:
                Network ap=new Network();
                ap.Desktop();
                break;

            default:
                System.err.println("Invalid, Try Again...");
                Dpayment();
                break;
        }
    }

    public void Dupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.DBill();
    }

    public void Dnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.DBill();
    }

    private double money=18000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Dcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        DeskPay ref=new DeskPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=15000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Dcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.DBill();
        }
    }

}

class SysPay
{
    public  void Spayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Supi();
                break;

            case 2:
                Snet();
                break;

            case 3:
                Scash();
                break;  
                
            case 9:
                Network ap=new Network();
                ap.System();
                break;

            default:
                System.err.println("Invalid, Try Again...");
                Spayment();
                break;
        }
    }

    public void Supi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.SBill();
    }

    public void Snet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.SBill();
    }

    private double money=15000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Scash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        SysPay ref=new SysPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=12000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Scash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.SBill();
        }
    }

}



//=================programing======
class programings extends info
{
    public static void programing()
    {

        System.out.println("==========================================");
        System.err.println("       ------ Specialist Trainer ------");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("=== Which Type Of Specialist Trainer Choices You: ");
        System.out.println("Enter 1) SQL Specialist Trainer");
        System.out.println("Enter 2) AWS Specialist Trainer");
        System.out.println("Enter 3) Cloud Specialist Trainer");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.out.println(" Enter Your Choices: ");

        Scanner d=new Scanner(System.in);
        int option=d.nextInt(); 
        switch (option)
        {
            case 1 :
            SQL();
            break;

            case 2:
            AWS();
            break;

            case 3:
            Cloud();
            break;

            case 9:
            info ii=new info();
            ii.Select();
            break;

            default :
            System.out.println(">>>>>>>>>> Invalid Input  <<<<<<<<<");
            //System.out.println();	
            programing();
        }
    }

    public static void SQL()
    {
        System.err.println();
        System.out.println("Details Of SQL Specialist Trainer: ");
        System.out.println("-knowledge of SQL Language.");
        System.out.println("-Good knowledge in Types of DataBase.");
        System.out.println("-Experts For Sql Queries.");
        System.out.println("-Goods in Oracle SQL.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.82,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            SqlPay py=new SqlPay();
            py.Sqlpayment();
            break;

            case "Y":
            SqlPay pyy=new SqlPay();
            pyy.Sqlpayment();
            break;

            case "n":
            programing();
            break;

            case "N":
            programing();
            break;

            case "p":
            programings pppp=new programings();
            pppp.programing();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            SQL();
        }
    }

    public static void AWS()
    {
        System.err.println();
        System.out.println("Details Of AWS Specialist Trainer: ");
        System.out.println("-knowledge of AWS Cluod.");
        System.out.println("-Good knowledge in AWS Services.");
        System.out.println("-Experts in AWS Networking.");
        System.out.println("-Goods in AW Database.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.98,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            AwsPay py=new AwsPay();
            py.Awspayment();
            break;

            case "Y":
            AwsPay pyy=new AwsPay();
            pyy.Awspayment();
            break;

            case "n":
            programing();
            break;

            case "N":
            programing();
            break;

            case "p":
            programings pppp=new programings();
            pppp.programing();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            AWS();
        }
    }

    public static void Cloud()
    {
        System.err.println();
        System.out.println("Details Of Cloud Specialist Trainer: ");
        System.out.println("-knowledge of Cluod Services.");
        System.out.println("-Good knowledge in Cluod Data Server .");
        System.out.println("-Experts in Cluod Networking.");
        System.out.println("-Goods in Cluod Database.");
        System.out.println("-Knowledge For SQl And AWS Cloud.");
        System.err.println(">>> You Can Go Back Then Press p. <<<");
        System.err.println();
        System.out.println("=== Price:- Rs.1,28,000/-");
        System.out.println("⁂ You Buy This Trainer Simply Type 'Y' Otherwise Press 'N'");
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        switch(n)
        {
            case "y":
            CloudPay py=new CloudPay();
            py.Cloudpayment();
            break;

            case "Y":
            CloudPay pyy=new CloudPay();
            pyy.Cloudpayment();
            break;

            case "n":
            programing();
            break;

            case "N":
            programing();
            break;

            case "p":
            programings pppp=new programings();
            pppp.programing();
            break;

            default:
            System.err.println("Invalid Input, pls try again");
            System.err.println();
            Cloud();
        }
    }


}


class SqlPay
{
    public  void Sqlpayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Sqlupi();
                break;

            case 2:
                Sqlnet();
                break;

            case 3:
                Sqlcash();
                break;  
                
            case 9:
                programings ap=new programings();
                ap.SQL();
                break;

            default:
                System.err.println("Invalid, Try Again...");
                Sqlpayment();
                break;
        }
    }

    public void Sqlupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.SqlBill();
    }

    public void Sqlnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.SqlBill();
    }

    private double money=82000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Sqlcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        SqlPay ref=new SqlPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=75000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Sqlcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.SqlBill();
        }
    }

}

class AwsPay
{
    public  void Awspayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                AWSupi();
                break;

            case 2:
                AWSnet();
                break;

            case 3:
                AWScash();
                break;  
                
            case 9:
                programings ap=new programings();
                ap.AWS();
                break;

            default:
                System.err.println("Invalid, Try Again...");
                Awspayment();
                break;
        }
    }

    public void AWSupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.AWSBill();
    }

    public void AWSnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.AWSBill();
    }

    private double money=98000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void AWScash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        AwsPay ref=new AwsPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=90000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            AWScash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.AWSBill();
        }
    }

}

class CloudPay
{
    public  void Cloudpayment()
    {
        System.out.println("==========================================");
        System.out.println("       ------ Payment Method ------");
        System.out.println("==========================================");
        System.err.println();
        System.out.println("=== Choices Payment Method: ===");
        System.out.println("Enter 1] Paying Using UPI");
        System.out.println("Enter 2] Paying Using NetBanking");
        System.out.println("Enter 3] Pay Cash");
        System.err.println(">>> You Can Go Back Then Press 9. <<<");
        System.err.println();
        System.out.println(" Enter Your Choices: "); 

        Scanner sc=new Scanner(System.in);
        int pay=sc.nextInt();
        switch (pay) 
        {
            case 1:
                Cloudupi();
                break;

            case 2:
                Cloudnet();
                break;

            case 3:
                Cloudcash();
                break;  
                
            case 9:
                programings ap=new programings();
                ap.Cloud();
                break;

            default:
                System.err.println("Invalid, Try Again...");
                Cloudpayment();
                break;
        }
    }

    public void Cloudupi() 
    {
        System.err.println();
        System.err.println("===== UPI Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.CloudBill();
    }

    public void Cloudnet() 
    {
        System.err.println();
        System.err.println("===== NetBanking Payments =====");
        System.err.println();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Your Bank Name: ");
        String b=sc.next();

        System.err.println("Enter Your IFSC Code: ");
        String i=sc.next();
        
        System.err.println("Enter Your UPI Number: ");
        int u=sc.nextInt();
        
        System.err.println();
        System.err.println("Your Bank Name: " + b);
        System.err.println("Your IFSC Code: " + i);
        System.err.println("Your UPI Number: " + u);
        System.err.println();

        System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("-Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.CloudBill();
    }

    private double money=128000; 

        public double getMoney()
        {
            return money;
        }

        public void setMoney(double money)
        {
            this.money=money;
        }
    
    public void Cloudcash() 
    {
        System.err.println();
        System.err.println("======== Cash Payments =======");
        System.err.println();
        System.err.println(">>> You Selected Cash Method: ");

        CloudPay ref=new CloudPay();

        System.err.println("## You Can Negotiate the Amount:-");
        System.out.println("total amount:"+ref.getMoney());
        
        System.err.println("Enter Your Amount: ");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        ref.setMoney(i);
        System.err.println(i);

        double d=110000;

        if(i<=d)
        {
            System.err.println("※ Sorry, This amount You Not Pay, Because your amount is so less pls Try Again.");
            Cloudcash();
        }
        else
        {
            System.err.println("<<<< Thanks:-) Your Invoice is Genrated.>>>>");
            System.err.println("= Press Any Key To View Your Invoice:>");
            Invoice In=new Invoice();
            Scanner sc0=new Scanner(System.in);
            String s=sc0.next();
            In.CloudBill();
        }
    }

}


//============= Driver Classs 
public class Driver5
{
    static
    {
        System.out.println();
        System.out.println("==================================================");
        System.out.println("==== 🙏Welcome To Information Technology🙏 ====");
        System.out.println("==================================================");
        System.out.println();
    }
    public static void main(String[]args) 
    {
        Register Reg=new Register();
        Reg.reg();

    }
}

//======Thanks part

class Thanks
{
    public void thx() 
    {
        System.out.println("==========================================");
        System.out.println("⨳⨳⨳⨳⨳ Thanks For Comming... ⨳⨳⨳⨳⨳");
        System.out.println("==========================================");
        System.err.println();
        System.err.println(">>You Go TO Home page Then Press 1 Otherwise Press Any Key.<<");
        Scanner sc= new Scanner(System.in); 
        String n=sc.next();      
        switch (n) {
            case "1":
                info inn=new info();
                inn.Select();
                break;

            // case "2":
            //     break;

            default:
                // thx();
                //break;
                System.exit(1);
        }
    }
}

