public class matrix_row_reverse {

    public static void row_reverse(int mat[][]){

            int n = mat.length;

        for(int i=0; i<mat.length/2; i++){
            for(int j=0; j<mat[0].length; j++){

                int temp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-i-1][j] = temp;
            }
        }
    }

    public static void col_reverse(int mat[][]){

        for(int i=0; i<mat.length; i++){
              
             int st = 0;  int end = mat[0].length-1;

                while(st < end){

                    int temp = mat[i][st];
                    mat[i][st] = mat[i][end];
                    mat[i][end] = temp;

                    st++;   end--;
                }
           }
    }

    public  static void display(int mat[][]){

        for (int i=0; i<mat.length; i++) {
            for (int j = 0; j<mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int mat[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
         display(mat);
         System.out.println();
        row_reverse(mat);
        display(mat);
  
        

    } 
}