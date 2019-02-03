
import java.util.Scanner;
public class LeastFreq 
{
    public static void main(String[] args) throws Exception
    {
          int f,p,num=0, pageHit=0, min=0;
          int pages[];
         int frame[];
         int freq[]=new int[3];
         int count[]=new int[10];
          boolean flag = true;
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of frames : ");
          f = sc.nextInt();
        System.out.println("Enter number of pages : ");
          p = sc.nextInt();
        
         
        frame = new int[f];
        pages = new int[p];
        
      for(int i=0; i<f; i++)
        {
            frame[i] = -1;
            freq[i] = -1;
        }
        
        System.out.println("Enter page number : ");
        for(int i=0;i<p;i++)
            pages[i] = sc.nextInt();

        for(int i=0; i<p; i++)
        {
            flag = true;
            int page = pages[i];
            
            for(int j=0; j<f; j++)
            {
                if(frame[j] == page)
                {
                    flag = false;
                    pageHit++;
                    count[page]++;
                    break;
                }
            }
            if(flag)
            {
                if(i>=3)
                {
                    for(int j=0; j<f; j++)
                    {
                        num = frame[j];
                        freq[j] = count[num];
                    }
                    min = freq[0];
                    for(int j=0; j<f; j++)
                    {
                        if(freq[j] < min)
                        {
                            min = freq[j];
                        }
                    }
                    for(int j=0; j<f; j++)
                    {
                        if(freq[j] == min)
                        {
                            count[page]++;
                            frame[j] = page;
                            break;
                        }
                    }
                }
                else
                {
                    frame[i]=page;
                    count[page]++;
                }
            }
            System.out.print("frame : ");
            for(int k=0; k<f; k++)
                System.out.print(frame[k]+" ");
            System.out.println();
        }
        System.out.println("No. of page hit : "+pageHit);
    }
}

