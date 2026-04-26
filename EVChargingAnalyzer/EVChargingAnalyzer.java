import java.util.*;
class EV
{
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the battery capacity in Kilo-watt hours");
        double capacity=in.nextDouble();
        System.out.println("Enter the cost of electricity per Kwh");
        double cost=in.nextDouble();
        System.out.println("Enter tax rate (in percent)");
        double tax=in.nextDouble();
        System.out.println("Enter the efficiency of your vehicle (Km/Kwh)");
        double ef=in.nextDouble();
        double costC= (cost*capacity)+(tax/100.0*(cost*capacity));
        double range=capacity*ef;
        double costp= costC/range;
        System.out.println("Charging Cost: "+costC);
        System.out.println("Range: "+range);
        System.out.println("Cost per km: "+costp);
        if(range>400)
        System.out.println("Excellent EV");
        else if(range>200)
        System.out.println("Good EV");
        else
        System.out.println("Needs improvement");
    }
}
