public class sorted {

    public static  boolean issorted(int[] arrs,int i){
        if(i==arrs.length-1){
            return true;
        }
        if(arrs[i]>arrs[i+1]){
            return false;
        }
        return issorted(arrs, i+1);

    }
    public static void main(String[] args) {
        int arrs[] ={1,2,3,4,5,6};
        System.out.println(issorted(arrs, 0));
        
    }
    
}
