public class misingnumber {
    public static int missingNumber(int n, int[] arr) {
        // code here
        int sum=0;
        int value;
        int diff;
        //  Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
           sum=sum+arr[i];
            
        }
        value=n*(n+1)/2;
        diff=value-sum;
        return diff;
        
    }
    public static void main(String[] args) {
        int arr[]={1,6,5,2,3};
        int n=6;
        System.out.println(missingNumber(n, arr));
    }
    
}
