package array;

public class largest{
    public static void main(String args[]){
        int largestno[]={9,10,11,3};
        System.out.println(largestnumber(largestno));
        
        
    }


    public static int largestnumber( int largestno[]){
        int largest1=Integer.MIN_VALUE;
        for(int i =0;i<largestno.length ; i++){
            if(largest1<largestno[i]){
                largest1=largestno[i];
            }
        }
        return largest1;
    }
    


}