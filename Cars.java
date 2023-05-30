import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        float d;
        n1=sc.nextInt();
        n2=sc.nextInt();
        d=sc.nextFloat();
        if(n1>n2)
        System.out.println(-1);
        else
        {
            int c=1;
            int s1=n1,s2=n2;
            while(d+s1>=s2)
            {
                c++;
                s1=s1+n1;
                s2=s2+n2;
            }
            System.out.println(c);
        }
        sc.close();
    }
}