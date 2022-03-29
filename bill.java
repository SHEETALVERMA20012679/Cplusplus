import java.util.Scanner;

class Telcall
{
    long phno;
    String name;
    int n;
    double amt;
    Telcall(long x,String y,int z)
    {
        phno=x;
        name=y;
        n=z;
    }
    void compute()
    {
        if(n<=100)
        {
            amt=500;
        }
        else if(n>100 && n<=200)
        {
            amt= (n-100)+500;
        }
        else if(n>200 && n<=300)
        {
            amt=100 +500+(n-200)*1.20+500;
        }
        else if(n>300)
        {
            amt=100+120+500+(n-300)*1.50+500;
        }
        
        
    }
    void display()
    {
        System.out.println("\t\t\t ABVGUDGHAUIH");
        System.out.println("\t\t   mkcnjskhckjnk   ");
        System.out.println("telephone number "+phno );
        System.out.println("\t\t susbscriber name "+name);
        System.out.println("\t\t Total billed AMT :"+ amt);
        
    }
    
}
class BillCount
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the user number :");
    String x=sc.nextLine();
    System.out.println("enter users phone number :");
    long y=sc.nextLong();
    System.out.println(" enter total number of cals ");
    int z=sc.nextInt();
    Telcall data = new Telcall(y,x,z);
    data.compute();
    data.display();
}
    
}


