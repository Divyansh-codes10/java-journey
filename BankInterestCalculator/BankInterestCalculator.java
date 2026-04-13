import java.util.*;
class Bank
{
    double p,n,r,a;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the principal amount and time in years");
        p=in.nextDouble();
        n=in.nextDouble();
    }
    void calculate()    
    {
        if(n<=0.5)
        r=9;
        else if(n<1)
        r=10;
        else if(n<3)
        r=11;
        else
        r=12;
        a=p*(Math.pow((1+(r/100.0)),n));
    }
    void display()
    {
        System.out.println("Principal \t Time \t Rate \t Amount");
         System.out.printf("%.2f\t\t%.2f\t%.2f\t%.2f%n", p, n, r, a);
    }
    public static void main(String args[])
    {
        Bank ob=new Bank();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}
