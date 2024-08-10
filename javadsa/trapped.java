public class trapped {
    public static void main(String args[]){
        int height[] ={4,2,0,6,3,2,5};
        trappedwater(height);
    }

    public static void trappedwater(int height[]){
        //find the left max
        int n = height.length;
        int leftmax[]= new int[n];
        leftmax[0] =height[0];
        for(int i =0; i<n ;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        //find the right max
        int rightmax[] = new int[n];
        rightmax[n-1]= height[n-1]   ;
        for(int i =n-2; i>=0; i--){
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }    
        
        //loop
        int trappedpani =0;

        for(int i= 0; i<n ;i++){
            int waterlevel =Math.min(leftmax[i],rightmax[i]);
            //trapped water formula
            trappedpani += waterlevel - height[i];
        }
        System.out.println(trappedpani);
        

    }
    
}
