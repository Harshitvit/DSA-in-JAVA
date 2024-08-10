public class Getset {
    public static void main(String[] args) {
        pen p1 =new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        
    }
    
}

class pen {
    private String color;
    String getcolor(){
        return this.color;

    }

    void setcolor(String newcolor){
        this.color=newcolor;
    }

}
