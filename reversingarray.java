import java.util.Scanner;
public class reversingarray{
    static int [] x;
    public static void array(){
        Scanner s= new Scanner (System.in);
System.out.println("enter size of array! ");
     int   a= s.nextInt ();
      x = new int[a];
int i;
System.out.println("Enter elements of array! ");

for(i=0; i<x.length; i++){
    x[i]=s.nextInt();
}
        System.out.println("original array: ");
for(i=0; i<x.length; i++){
System.out.print(x[i]+" ");
       
    }System.out.println();
    }

public static void reverse(){
    int i=0;
    int j=x.length-1;
    int temp;
    while (i<j){
        temp=x[i];
        x[i]=x[j];
        x[j]=temp;
        i++;
        j--;
    }
    System.out.println("reversed array: ");
for(i=0; i<x.length; i++){
    System.out.print(x[i]+" ");
}
    
}

public static void main(String [] args){
    array();
    reverse();
}
}