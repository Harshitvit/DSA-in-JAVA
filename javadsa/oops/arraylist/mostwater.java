package arraylist;

import java.util.ArrayList;

public class mostwater {

    public static int container(ArrayList<Integer> heigth){
        int maxwater=0;
        for (int i = 0; i < heigth.size(); i++) {
            for(int j=i+1;j< heigth.size();j++){
                int nt =Math.min(heigth.get(i), heigth.get(j));
                int width =j-i;
                int currwater=nt*width;
                maxwater =Math.max(maxwater,currwater);

            }
            
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height =new ArrayList<>();
        //adding height vlaues;
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(container(height));
    }
    
}
