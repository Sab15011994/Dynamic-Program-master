
import java.util.Scanner;
public class Lis{
     static int display(int arr[],int n)
     {
         int lis [] = new int[n];
         int i, j,max=0;
         
         for(i=0;i<n;i++)
           lis[i]= 1;
           
           for(i=1;i<n;i++)
           {
               for(j=0;j<i;j++)
                {
                    if(arr[j]<arr[i] && lis[i]<lis[j]+1)
                       lis[i]=lis[j]+1;
                }
           }
           
           for(i=0;i<n;i++)
           if(max<lis[i])
            max=lis[i];
            
            return max;
     }
     public static void main(String []args)
     {   
    	   Scanner s=new Scanner(System.in);

           System.out.println("enter number of elements");

           int n=s.nextInt();

           int arr[]=new int[n];
    	 
         
          int k;
         Scanner scan = new Scanner(System.in);
          System.out.println("Enter the array elements");
          for(k=0;k<n;k++)
          {
                 arr[k] = scan.nextInt();
          }
           System.out.println("Entered values are");
           for(k=0;k<n;k++)
          {
               System.out.print(arr[k]+" ");
          }
           System.out.println();
        
            int c = arr.length;
        System.out.println("Subsequence is" +"  "+ display(arr,c));
     }
}