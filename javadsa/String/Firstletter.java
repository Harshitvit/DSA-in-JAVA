package String;

public class Firstletter {
    public static String Uppermost(String str){
        StringBuilder sb =new StringBuilder();
        //first character t upper cas e

        char ch =Character.toUpperCase(str.charAt(0));
        //saving to string
        sb.append(ch);

        //now for other characters
        for( int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str ="hi i am harshit";
        System.out.println(Uppermost(str));
       

    
}
