import java.util.*;
public class series 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int not=sc.nextInt();
    
    String a[]=new String[not];
    String b[]=new String[not];
    String n[]=new String[not];
    for(int i=0;i<not;i++) {
     a[i]=sc.next();
     b[i]=sc.next();
     n[i]=sc.next();
    }
    
    
    int arr1[]=new int[not];
    int arr2[]=new int[not];
    int arr3[]=new int[not];
    for(int x=0;x<not;x++) 
    {
     arr1[x]=Integer.parseInt(a[x]);
     arr2[x]=Integer.parseInt(b[x]);
     arr3[x]=Integer.parseInt(n[x]);
    }
    
    for(int val=0;val<not;val++) {
    int i;
    int ai=arr1[val];
    int bi=arr2[val];
    int ni=arr3[val];
    double z[]=new double[ni+1];
    double p[]=new double[ni+1];
        for(int y=1;y<=ni;y++) 
        {
         z[y]=(Math.pow(2,(y-1))*bi);
        }
        
for(int y=1;y<ni+1;y++)
{
    
          z[y]=z[y-1]+z[y];   
            p[y]=z[y];
}
    int k[]=new int[p.length];
    
for(int f=0;f<p.length;f++) 
{
     k[f]=(int)p[f];
}
for(int c=1;c<=ni;c++) 
{
    System.out.print(ai+k[c]+" ");
}
     System.out.println();    

      }
   }
}
