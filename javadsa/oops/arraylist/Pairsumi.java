package arraylist;

import java.util.ArrayList;

public class Pairsumi {

    public static boolean pair1(ArrayList<Integer> height, int target){
        for( int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                if(height.get(i)+height.get(j)==target){
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height =new ArrayList<>();
        int target=5;
        //adding height vlaues;
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        //height.remove(target)
        System.out.println(pair1(height, target));
    }
        
    
}
