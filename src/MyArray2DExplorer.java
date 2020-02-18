
    public class MyArray2DExplorer {

        public static void main(String[] args) {
            int array[][] = {{4, 1, 8, 5},
                    {0, 2, 3, 4},
                    {6, 6, 2, 2}};

            MyArray2DExplorer exp = new MyArray2DExplorer();

            System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array, 0));
            System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array, 2));

            System.out.println();

            System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array, 1));
            System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array, 0));

            System.out.println();


            System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
            int[] row = exp.minRow(array);
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }

            System.out.print("]");

        }

        //WRITE YOUR METHODS BELOW

        public boolean evenRow(int[][] mat, int row) {
            int count = 0;


            for (int i = 0; i < mat[row].length; i++) {
                if (mat[row][i] % 2 == 0) {
                    count++;
                }

                if (count == mat[row].length) {
                    return true;
                }
            }

            return false;
        }

        public boolean oddColSum(int[][] nums, int col) {
            int count = 0;

            for (int c = 0; c < nums.length; c++) {
                count += nums[c][col];
            }
            if (count % 2 != 0) {
                return true;
            }
            return false;
        }

        public int[] minRow(int[][] mat) {
            int[] minArr = new int[mat.length + 1];
            int min = 999999;

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    if (mat[r][c] < min) {
                        min = mat[r][c];
                        minArr = mat[r];

                    }
                }
            }
            return minArr;


        }
    }










