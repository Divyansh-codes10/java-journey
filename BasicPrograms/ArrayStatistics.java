import java.util.*;
class C1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the values one by one");
        for( int i=0; i<5; i++)
        a[i]=in.nextInt();
        int min=a[0];
        int max=a[0];
        int sum=a[0];
        for(int i=1;i<5;i++)
        {
            if(a[i]<min)
            min=a[i];
            if(a[i]>max)
            max=a[i];
            sum+=a[i];
        }
        System.out.println("Minimum value : " + min);
System.out.println("Maximum value : " + max);
System.out.println("Sum value : " + sum);
}
}
