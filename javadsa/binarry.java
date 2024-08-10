public class binarry {


    public static int binarysearch(int numbers[], int key){
        int start=0; int last =numbers.length;
        while(start<= last){
            int mid =(start+last)/2;
            if(key == numbers[mid]){
                return mid;
            }
            if(numbers[mid]<key){
                start =mid +1;
            }
            else{
                last =mid -1;
            }
        }
        return -1;
    }


    
        public static int binarrysearch(int[] nums, int target) {
            int start =0; 
               int end = nums.length-1;
               while(start<=end){
                   // finding the middle element 
                   
                   int middle = start + (end-start)/2;
                   
                   // accessing every element here 
                  if(nums[middle]==target){
                      return middle;
                  } else if(nums[middle]<target){
                      start = middle + 1;
                  }else {
                      end = middle -1;
                      
                  }
                  
                   
                 
               }
               return -1;
               
            }
    
    public static void main(String[] args) {
        int nums[]={2,4,6,8,20,30,56,76};
        int target =56;
        System.out.println(binarysearch(int[] nums, int target));
       // System.out.println("key found at "+ binarysearch(numbers, key));
    }
    
}
