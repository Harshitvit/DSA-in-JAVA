public class subarraysum {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printsub(numbers);

        
    }

    public static void printsub(int numbers[]){
        int currsum =0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j =i;j<numbers.length;j++){
                currsum=0;
                for(int k =i;k<=j;k++){
                    currsum+=numbers[k];
                }
                System.out.println("currsum is :"+currsum);
                if(currsum>maxsum){
                    maxsum= currsum;
                }
                
                
            }
            
        }
        System.out.println("maxsubbarray sum is :"+maxsum);
        
       
    }
    
}
