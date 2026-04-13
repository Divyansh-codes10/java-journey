import java.util.Scanner;

public class C8 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter start year and end year for array Year");
    int sy = in.nextInt();
    int ey = in.nextInt();
    int n = ey - sy + 1;
    int[] y = new int[n];
    
    System.out.println("Enter the number of employees born each year from "+sy+" to "+ey);
    for (int i = 0; i < n; i++) 
    {
      System.out.print("Year " + (sy + i) + ": ");
      y[i] = in.nextInt();
    }
    System.out.println("\nYears with no employees born:");
    for (int i = 0; i < n; i++) 
    {
      if (y[i] == 0) {
        System.out.println(sy + i);
      }
    }
     int count = 0;
    for (int i = 0; i < n; i++) {
      if (y[i] == 0) {
        count++;
      }
    }
    System.out.println("\nNumber of years with no employees born: " + count);
    int e= 0;
    for (int i = 0; i < n; i++)
    {
      if ((2026 - (sy + i)) >= 60)
      {
        e += y[i];
      }
    }
    System.out.println("\nNumber of employees who will be atleast 60 years old at the end of 2026: "
            + e);
  }
}
