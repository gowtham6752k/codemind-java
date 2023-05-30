import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        if(n<3)
        System.out.println(n-1);
        else
        System.out.println("2");
        sc.close();
    }
}