package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class revrse {

    public static void rev(ArrayList<Integer> list){
        for( int i=list.size()-1;i>0;i--){
            System.out.print(list.get(i)+" ");


        }
    }


    public static void max(ArrayList<Integer> list){
        int max =Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }

        }
        System.out.println(max);
    }


    public static void swap(ArrayList<Integer> list,int idx1 ,int idx2){
        int temp =list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    list.add(34);
    list.add(2);
    list.add(3);
    list.add(7);

    list.add(6);
    list.add(5);
    list.add(10);
    System.out.println(list);
   // rev(list);
    //System.out.println(list);
    //max(list);
   // int idx1 =3;
    //int idx2=5;
   // swap(list, idx1, idx2);
   Collections.sort(list);
   Collections.sort(list ,Collections.reverseOrder());
    System.out.println(list);


    
}
}
