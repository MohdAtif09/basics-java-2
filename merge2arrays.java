public class merge2arrays{
    public static void main(String[] args){
        
        int[] a ={1,4,7,8,9};
        int[] b ={0,2,6,10};
        int[] c =new int[9];
       int i = a.length-1;
        int j = b.length-1;
        int k = c.length-1;

       System.out.println("1st Sorted array: ");
       for(int m=0;m<a.length;m++){
         System.out.print(a[m]+" ");
       }System.out.println();
  System.out.println("2nd Sorted array: ");
       for(int m=0;m<b.length;m++){
         System.out.print(b[m]+" ");
       }System.out.println();
    while(i>=0 && j>=0){
if(a[i]>b[j]) c[k--]=a[i--];
       else   c[k--]=b[j--];
    }  
       if(i<j){
for(int l=k;l>=0;l--){c[l]=b[l];}
       }else{
for(int l=k;l>=0;l--){c[l]=a[l];}
       }
     System.out.println("merged sorted array: ");
 for(int l=0;l<c.length;l++) {
    System.out.print(c[l]+" ");
 }
    
}
}