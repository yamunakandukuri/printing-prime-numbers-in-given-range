import java.util.Scanner;
public class primeno
{
    public static void main(String args[])
    {
        int r1,r2,count;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter r1");
        r1=sc.nextInt();
        System.out.print("enter r2");
        r2=sc.nextInt();
        System.out.println("prime numbers between r1 and r2 are: ");
        for(int i=r1;i<=r2;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                count=count+1;
            }
            if(count==2)
            System.out.println(i);
        
            }
        }
    }
