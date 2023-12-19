public class ps6 {
    public static void main(String[] args) {
        // q1---------------------------------------------------------
        // float[] marks = { 105.5f, 85.5f, 45.2f, 56.2f, 78.9f };
        // float n = 45.2f;
        // boolean ispresent = false;
        // for (float f : marks) {
        // if (n == f) {
        // ispresent = true;
        // break;
        // }
        // }
        // if (ispresent) {
        // System.out.println("Element is present");
        // } else {
        // System.out.println("Element is absent ");
        // }

        // q2---------------------------------------------------
        // int[][] mat1 = { { 1, 2, 3 },
        // { 4, 5, 6 } };
        // int[][] mat2 = { { 11, 22, 33 },
        // { 44, 55, 66 } };
        // int[][] result = { { 0, 0, 0 },
        // { 0, 0, 0 } };

        // for (int i = 0; i < mat1.length; i++) { // row number of times
        // for (int j = 0; j < mat1[i].length; j++) { // column no of times
        // System.out.format("Setting value for i = %d and j = %d\n", i, j);
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // }

        // for (int i = 0; i < mat1.length; i++) { // row number of times
        // for (int j = 0; j < mat1[i].length; j++) { // column no of times
        // System.out.print(result[i][j] + " ");
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // System.out.println(" ");
        // }

        // q3--------------------------------------

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(arr.length, 2);
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int k : arr) {
            System.out.println(k);
        }

    }
}