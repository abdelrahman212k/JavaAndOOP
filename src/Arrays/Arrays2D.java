package Arrays;

import java.sql.Array;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        // Printing 2d arrays using for each
        for(int[] rows: arr){
            for(int col: rows){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
