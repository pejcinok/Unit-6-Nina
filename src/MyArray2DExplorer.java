
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


            //System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
            //int [] row = exp.minRowPractice(array);
            //for(int i = 0; i < row.length; i++){
            //    System.out.print(row[i] + " ");
            //}
            //System.out.print("]");

            //System.out.println();

            //System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
            //System.out.println(exp.minRowAssignment(array, 2));

            System.out.println();

            System.out.print("Test colMaxs: \n Expecting: {6 6 8 5} \n Actual: {");
            int[] colMaxs = exp.colMaxs(array);
            for (int i = 0; i < colMaxs.length; i++) {
                System.out.print(colMaxs[i] + " ");
            }
            System.out.print("}");

            System.out.println();
            System.out.println();

            System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
            int[] sum = exp.allRowSums(array);
            for (int i = 0; i < sum.length; i++) {
                System.out.print(sum[i] + " ");
            }
            System.out.print("}");

            System.out.println();
            System.out.println();

            System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
            double [] avg = exp.averageCol(array);
            for(int i = 0; i < avg.length; i++){
                System.out.print(avg[i] + " ");
            }
            System.out.print("}");


            System.out.println();
            System.out.println();

            //System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
            //System.out.println(exp.smallEven(array));

            System.out.println();
            System.out.println();

            //System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
            //System.out.println(exp.biggestRow(array));

            System.out.println();
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

        public int minRow(int[][] nums, int row) {
            //that looks through each element of the chosen row and returns the smallest integer from that row.
            int min = 999999;

            for (int c = 0; c < nums[row].length; c++) {
                if (nums[row][c] < min) {
                    min = nums[row][c];
                }

            }
            return min;
        }

        public int[] colMaxs(int[][] matrix) {
            //that searches through each column of an array and returns an array with the largest integer from each column.
            int[] colMax = new int[matrix[0].length];
            int max = 0;
            int length = matrix[0].length;
            int i = 0;

            while (i < length) {
                for (int c = 0; c < matrix.length; c++) {
                    if (matrix[c][i] > max) {
                        max = matrix[c][i];

                    }
                }
                colMax[i] = max;
                max = 0;
                i++;

            }
            return colMax;
        }

        public int[] allRowSums(int[][] data) {
            int rowSum = 0;
            int[] rowSums = new int[data.length];
            int i = 0;

            while (i < data.length) {
                for (int r = 0; r < data[0].length; r++) {
                    rowSum += data[i][r];
                }
                rowSums[i] = rowSum;
                rowSum = 0;
                i++;
        }
        return rowSums;
    }


        public double[] averageCol(int[][] nums){
            double[] averageCols = new double[nums[0].length];
            int i =0;
            double sum = 0;
            double average;

             while (i<nums[0].length){
                 for (int r=0; r <nums.length; r++){
                     sum +=nums[r][i];

                 }
                 average =  (sum/nums[0].length);
                 averageCols[i]= average;
                 sum =0;
                 i++;

             }
             return averageCols;

        }

        //that calculates the average of each column in the array nums, and returns those values in an array of doubles.

        //public int smallEven(int[][] matrix)

        //That finds and returns the smallest even number in the array matrix. Assume that the array is filled with only positive ints.

        //public static int biggestRow(int[][] nums)
        //That returns the row index number that has the greatest sum of its elements.
    }



