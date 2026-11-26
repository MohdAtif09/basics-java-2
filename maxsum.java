public class maxsum{
    public static void main(String[]args){
        int[][]arr = {{2,4,5,6,8},{6,7,10,9,20},{6,2,1,3,4}};
        int maxSum=Integer.MIN_VALUE;
        int row=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                row=i;
            }
        }
        System.out.println(row+" "+maxSum);
    }
}