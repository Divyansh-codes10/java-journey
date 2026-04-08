import java.util.*;
class NamesInOrder
{
    public static void main (String args[])
  {
     Scanner in=new Scanner(System.in);
     int i,j;
     String name[]=new String[10];
     String t;
     int min;
     System.out.println("Enter the names one by one");
     for(i=0;i<10;i++)
     {
         name[i]=in.next();
         name[i]=name[i].toUpperCase();
     }
     System.out.println("The names are ");
     for(i=0;i<10;i++)
     System.out.println(name[i]);
     for(i=0;i<9;i++)
     {
         min=i;
         for(j=i+1;j<10;j++)
         {
             if(name[j].compareTo(name[min])<0)
             min= j ;
         }
         t=name[i];
         name[i]=name[min];
         name[min]=t;
    }
    for(i=0;i<10;i++)
    System.out.println("Names in order are "+name[i]);
  }  
}
