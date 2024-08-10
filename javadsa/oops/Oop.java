public class Oop{
    public static void main(String args[]){
        Pen p1 =new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);

        p1.gettipsize(5);
        System.out.println(p1.tip);



    }
}


class Pen{
    String color;
    int tip;

    void gettipsize(int tipsize){
        tip = tipsize;
    }


    void setcolor(String newcolor){
        color=newcolor;
    }
}