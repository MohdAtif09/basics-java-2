

import java.util.Scanner;
public class productofmatrices{
    public static void main(String[] arge){
        Scanner s=new Scanner (System.in);
        System.out.println("Enter no of rows for 1st matrix");
        int R1= s.nextInt();
        System.out.println("Enter no of column for 1st Matrix");
        int C1= s.nextInt();
        System.out.println("Enter no of rows for 2nd matrix");
        int R2= s.nextInt();
        System.out.println("Enter no of column for 2nd matrix");
        int C2= s.nextInt();
        int[][] A=new int[R1][C1];
        int[][] B=new int[R2][C2];
        int[][] C=new int[R1][C2];

    if(C1!=R2){
        System.out.println("Invalid Enteries");
    }else{
        System.out.println("Enter "+(R1*C1)+" elements of Matrix 1");
        for(int i=0;i<A.length;i++){
    for(int j=0;j<A[0].length;j++){
        A[i][j]=s.nextInt();
    }System.out.println();
        }
        System.out.println("Enter "+(R2*C2)+" elements of Matrix 2");
        for(int i=0;i<B.length;i++){
    for(int j=0;j<B[0].length;j++){
        B[i][j]=s.nextInt();
    }System.out.println();
        }
    System.out.println("Product of both Matrices is: ");
for(int i=0;i<R1;i++){
    for(int j=0;j<C2;j++){
        int value=0;
    for(int k=0;k<A[0].length;k++){
        value=A[i][k]*B[k][j]+value;
    }C[i][j]=value;
    System.out.print(C[i][j]+" ");
    }
   System.out.println();
}
    }
    }
}