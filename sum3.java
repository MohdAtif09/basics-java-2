import java.util.Scanner;
public class sum3{
    public static void main(String[] args){
        Scanner s= new Scanner (System.in);
System.out.println("Enter size of Array! ");
        int n= s.nextInt();
       int[] x= new int[n];
        int i,j,k;

System.out.println("enter elements of Array");
for(i=0; i<x.length; i++){
    x[i]= s.nextInt();
    }
System.out.println("enter targeted number, for which you want to check whether the sum of any 3 elements of the array is equal to your selected number ");
        int a= s.nextInt();

for (i=0; i<x.length;i++){
 for(j=i+1;j<x.length;j++){
  for(k=i+1;k<x.length;k++){
    if((x[i]+x[j]+x[k])==a) {
System.out.println("sum of indexes "+i+" and "+j+" and "+k+" is equal to "+a);
    }
    }
} 
        
    }
}
}