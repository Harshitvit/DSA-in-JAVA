public class bank {
    public static void main(String[] args) {
        bankaccount myacc =new bankaccount();
        myacc.setusername("harshit");
        System.out.println(myacc.username);

       // myacc.setpassword("harirao");


        
    }
    
}


class bankaccount{
    public String username;
    private String password;

    void setusername(String newusername ){
        username=newusername;
    }

    //void setpassword(String newpassword){
    //    password=newpassword;
   // }
   




}
