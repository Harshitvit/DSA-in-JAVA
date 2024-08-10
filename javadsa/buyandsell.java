public class buyandsell {



    public static int buysell(int prices[]){
        int buyprice =Integer.MAX_VALUE;
        int maxprice=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit =prices[i]-buyprice;
            maxprice=Math.max(maxprice, profit);

            }else{
                buyprice=prices[i];

            }
            
            
        }
        return maxprice;
        
        
    }
    public static void main(String[] args) {
        int prices[] ={7,1,5,3,6,4};
        System.out.println(buysell(prices));

    }
}
