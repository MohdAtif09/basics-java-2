

import java.util.Scanner;
    public class selectedsumarray{
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.println("Enter no of rows of matrix: ");
            int r=s.nextInt();
System.out.println("Enter no of columns of matrix: ");
            int c=s.nextInt();
    int[][] arr = new int[r][c];
            
System.out.println("Enter "+(r*c)+" elements of matrix: ");
            
for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
        arr[i][j] = s.nextInt();
    }
}
System.out.println("Your Array is: ");
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(arr[i][j]+"  ");
    }System.out.println();
}
            System.out.println(" Select x coordinate of 1st corner within the matrix: ");
            int l1=s.nextInt();
            System.out.println("Enter y coordinate of 1st corner: ");
            int b1=s.nextInt();

System.out.println("Enter x coordinate of 2nd corner: ");
            int l2=s.nextInt();
            
System.out.println("Enter y coordinate of 2nd corner: ");
            int b2=s.nextInt();

            int sum=0;

if(l1>=0 && l1<=r && l2>=0 && l2<=r && b1>=0 && b1<=c && b2>=0 && b2<=c){
    for(int i=l1;i<=l2;i++){
        for(int j=b1;j<=b2;j++){
            sum=sum+arr[i][j];
        }
    }
System.out.println("sum of all elements inside selected part is = "+sum);
}else{
    System.out.println("you have selected entries out of range! ");
}
        }
    }