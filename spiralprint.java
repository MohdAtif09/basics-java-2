

public class spiralprint{
    public static void main(String[] args){
        int[][] arr= {{1,2,3,2,1},{4,5,6,5,4},{7,8,9,8,7},{1,3,5,7,9}};
        int fc=0; int fr=0; int lr=arr.length-1; int lc=arr[0].length-1;

        System.out.println("Original Array is: ");
    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
System.out.print(arr[i][j]+" ");
    }System.out.println();
    }
System.out.println("Spiral Array is: ");

     while(lr>=fr && lc>=fc){
        for(int i=fc;i<=lc;i++){
System.out.print(arr[fr][i]+" ");

            }fr++;
        for(int i=fr;i<=lr;i++){
System.out.print(arr[i][lc]+" ");

        }lc--;
        for(int j=lc;j>=fc;j--){
System.out.print(arr[lr][j]+" ");

        }lr--;
        for(int i=lr;i>=fr;i--){
System.out.print(arr[i][fc]+" ");

        }fc++;
        }
    }
}