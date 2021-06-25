import java.util.*;
public class Pd {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

char chr[]=s.toCharArray();
char chr1[]=new char[chr.length];

for(int i=0;i<chr.length;i++) 
     {
     chr1[i]=chr[chr.length-i-1];
    }

String s3=String.valueOf(chr);

String s4=String.valueOf(chr1);
if(s3.equals(s4)) 
{
System.out.println("Yes");    
}
else 
{
System.out.println("No");    
}


    }
}
