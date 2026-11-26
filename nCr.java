import java.util.Scanner;
public class nCr{
    public static void main (String [] args){
        Scanner s= new Scanner (System.in);
        System.out.println("Enter n :");
        int n=s.nextInt();
System.out.println("Enter r :");
        int r=s.nextInt();
      int ans=fact(n)/(fact(r)*fact(n-r));

System.out.println(n+"C"+r+ " = "+ans);
        
    }
    public static int fact(int x){
        int fact = 1;
        for(int i=1; i<=x; i++){
            fact = fact*i;
        }
        return fact;
    }
}