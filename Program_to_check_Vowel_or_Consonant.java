import java.util.*;
public class Sample
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner (System.in);
        char ch;
        ch=sc.next().charAt(0);
        if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
        sc.close();
    }
}