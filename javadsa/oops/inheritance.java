public class inheritance {
    public static void main(String[] args) {
        fish shark =new fish();
        shark.eat();
        shark.breath();
        shark.Swim();
        shark.nofins(5);
        System.out.println(shark.fins);
        
    }
    
}


class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

class fish extends Animal{
    int fins;

    void Swim(){
        System.out.println("swims");
    }

    void nofins(int newfins){
        fins =newfins;
    }
}
