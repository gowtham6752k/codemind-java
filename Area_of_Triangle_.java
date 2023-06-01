import java.util.*;
public class kkk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        double x,y;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        x=(a+b+c)/2;
        y=Math.sqrt(x*(x-a)*(x-b)*(x-c));
        System.out.format("%.2f",y);
    }
}