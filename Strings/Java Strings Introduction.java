import java.util.*;
public class lgdemo
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    
    char c1[]=s1.toCharArray();
    char c2[]=s2.toCharArray();
    
    String s3=s1.toUpperCase();
    String s4=s2.toUpperCase();
    
    char c3[]=s3.toCharArray();
    char c4[]=s4.toCharArray();
    char A=c3[0];
    char B=c4[0];
    
    c1=s1.toCharArray();
    c2=s2.toCharArray();
    
    byte b1[]=s1.getBytes();
    byte b2[]=s2.getBytes();
    
    //System.out.println(Arrays.toString(b1));
    //System.out.println(Arrays.toString(b2));
    System.out.println(s1.length()+s2.length());
    if(b1[0]>b2[0]) 
    {
        System.out.println("Yes");
    }
    else 
    {
        System.out.println("No");
    }
    String s5=s1.substring(1, s1.length());
    String s6=s2.substring(1, s2.length());
    System.out.println(A+s5+" "+B+s6);
    
    }
}
