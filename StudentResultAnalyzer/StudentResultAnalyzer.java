    import java.util.*;
    /**
      21/04/2026
      This program helps teachers to analyse their class performance 
     */
    public class StudentAnalysis
    {
        public static void main (String args[])
        {
            Scanner in=new Scanner(System.in);
            int n=0;
            System.out.println("Please enter the number of students in the class");
            n=in.nextInt();
            System.out.println("Please enter the minimum passing marks");
            int min=in.nextInt();
            int p=0,q=0;
            String[] name= new String[n];
            String[] minN= new String[n];
            String[] max= new String[n];
            String topper="";
            int maximum=0;
            int[] marks= new int[n];
            System.out.println("Enter the name and marks one by one");
            for(int i=0;i<n;i++)
            {
                name[i]=in.next();
                marks[i]=in.nextInt();
                if(marks[i]<min)
                {
                    
                    minN[p]=name[i];
                    p++;
                    
                }
                if(marks[i]>90)
                {
                    
                    max[q]=name[i];
                    q++;
                }
                if(marks[i]>maximum)
                {
                topper=name[i];
                maximum=marks[i];
                }
            }
            System.out.println("Names of students who scored marks greater than 90");
            for(int i=0;i<q;i++)
            
                System.out.println(max[i]);
            System.out.println("Names of students who scored marks less than "+min);
            for(int i=0;i<p;i++)
            
                System.out.println(minN[i]);
               
            System.out.println("\nNumber of students who scored more than 90:"+q);
            System.out.println("\nNumber of students who scored less than " + min + ":"+p);            
            int sum = 0;
    
            for(int i = 0; i < n; i++) 
            sum += marks[i];
            double avg = (double)sum / n;
            System.out.println("Average marks: " + avg);
            System.out.println("Topper: " + topper + " (" + maximum + ")");
        }
    }
