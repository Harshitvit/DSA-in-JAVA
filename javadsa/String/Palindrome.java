package String;

public class Palindrome {
    public static boolean isPalin(String str){
        
        //reverseing the String 
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }


        }
        return true;
             

    }
    public static void main(String[] args) {
        String str ="abba";

        System.out.println(isPalin(str));


        
    }
    
}
