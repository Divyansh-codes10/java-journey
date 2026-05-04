import java.util.*;

class SolarImpactAnalyzer {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter daily solar energy generation (kWh):");
        double e = in.nextDouble();

        System.out.println("Enter electricity cost (₹ per kWh):");
        double c = in.nextDouble();

        System.out.println("Enter installation cost:");
        double ic = in.nextDouble();

        System.out.println("Enter number of years:");
        int y = in.nextInt();

        double monthlySavings = e * c * 30;
        double pb = ic / monthlySavings;

        double yearlyCO2 = e * 365 * 0.82;
        double totalCO2 = yearlyCO2 * y;
        double trees = totalCO2 / 21;

        System.out.printf("Monthly savings: %.2f\n", monthlySavings);
        System.out.printf("Payback period: %.2f months\n", pb);
        System.out.printf("Total CO2 saved: %.2f kg\n", totalCO2);
        System.out.printf("Trees saved: %.2f\n", trees);

        if (pb < 36)
            System.out.println("Great investment");
        else if (pb < 72)
            System.out.println("Moderate investment");
        else
            System.out.println("Long-term investment");

        if (trees > 500)
            System.out.println("Excellent environmental impact");
        else if (trees > 200)
            System.out.println("Good impact");
        else
            System.out.println("Moderate impact");
    }
}
