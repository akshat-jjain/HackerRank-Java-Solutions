import java.util.*;
public class Ss {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1=sc.nextLine();
        
        //String s4[]=new String[2];
        String s4[]=s1.split(" ");
        int intarr[]=new int[2];
        for(int i=0;i<2;i++) 
        {
         intarr[i]=Integer.parseInt(s4[i]);
        }
        //int i1[]=new int[s4.length];
        
        int s=intarr[0];
        int e=intarr[1];
        //System.out.println(s+" "+e);
        
        
        
        String s3=str.substring(s, e);
        //System.out.println(str);
        System.out.println(s3);
        
        
        
    }

}
