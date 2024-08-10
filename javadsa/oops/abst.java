public class abst{
    public static void main(String[] args) {
       // Animal ani =new Animal();
       horse h1= new horse();
       h1.walk();
       chicken c1= new chicken();
       c1.walk();


        
        
    }
}

abstract class Animal{
abstract  void walk();
}


class horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class chicken extends horse{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

