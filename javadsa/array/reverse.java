package array;



public class reverse {
    public static void main(String args[]){
        int numbers[]={1,2,4,7,8};
        reversearray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }


    }
    public static void reversearray(int numbers[]){
        int fir=0; int last=numbers.length;
         while(fir<last){
            int temp =numbers[last];
            numbers[last]= numbers[fir];
            numbers[fir]= temp;
            fir++;
            last--;



         }

    }
}
