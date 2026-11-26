import java.util.Scanner;
public class nomaxele{
    public static void main(String [] args){
        Scanner s= new Scanner (System.in);
        System.out.println("Enter size of Array");
        int n= s.nextInt();
        int[] arr= new int[n];

System.out.println("Enter different elements of Array");
for(int i=0; i<arr.length; i++){
    arr[i]= s.nextInt();
}
System.out.println("elements of your array are:");
for (int i=0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
}
System.out.println("Enter any number you want to analyze!");
        int x= s.nextInt();
        int total=0;
for (int i=0; i<arr.length; i++){
    if(arr[i]>x){
        total = total+1;
    }
}System.out.println("Total elements which are greater than your chosen number are: "+total);
    }
}