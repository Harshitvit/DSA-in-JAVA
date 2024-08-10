package arraylist;

import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(5);

    list.add(6);
    list.add(7);
    list.add(10);

    System.out.println(list);

   // System.out.println(list.get(5));
   // list.remove(5);
//System.out.println(list);


//list.set(4, 11);
//System.out.println(list);
System.out.println(list.contains(1));
list.contains(7);
System.out.println(list.size());

for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");

}
System.out.println();
        
    }
    
    
}
