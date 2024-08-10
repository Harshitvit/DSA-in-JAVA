package array;

public class check {

        public static void  isPalindrome(String s) {
            s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
            // int i=0;
            // int j=s.length()-1;
            // while(i<=j){
            //     if(s.charAt(i) != s.charAt(j)){
            //         return false;
            //     }
            //     i++;
            //     j--;
            // }
            // return true;
            System.out.println(s);
    
            
        }
    
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        //System.out.println(isPalindrome(s));
        isPalindrome(s);
    }
    
}
