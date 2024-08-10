package array;

public class buyandsell{
    public static void main(String[] args) {
        int A[] ={7,1,3,4,5,6};
        System.out.println(maxProfit(A));
        
    }
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public static int maxProfit(int[] A) {
            int max =Integer.MIN_VALUE;
            int buyprice =0;
            for( int i=0;i<A.length;i++){
                if(buyprice<A[i]){
                    int profit =A[i]-buyprice;
                    max =Math.max(profit,max);
                }
                else{
                    buyprice=A[i];
                }
            }
            return max;
        }
    }
    