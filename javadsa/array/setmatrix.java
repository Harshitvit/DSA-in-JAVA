package array;

public class setmatrix {

    public static void update(int[][] matrix, int zeroindx1, int zeroindx2) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        // Check if the index is within the bounds of the matrix
        if (zeroindx1 >= rowCount || zeroindx2 >= colCount || zeroindx1 < 0 || zeroindx2 < 0) {
            System.out.println("Invalid index");
            return;
        }

        // Set the entire row to zero
        for (int i = 0; i < colCount; i++) {
            matrix[zeroindx1][i] = 0;
        }

        // Set the entire column to zero
        for (int i = 0; i < rowCount; i++) {
            matrix[i][zeroindx2] = 0;
        }
    }
    public static void setZeroes(int[][] matrix) {
        int zeroindx1 , zeroindx2;
        for(int i =0 ;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==0){
                    zeroindx1 = i;
                    zeroindx2 =j;

                    //set row of these zero as zero ;
                    //full col
                    update(matrix, zeroindx1, zeroindx2);
                    
                    }
                    
                }
            }

        }

        
    
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    
    }
    
}
