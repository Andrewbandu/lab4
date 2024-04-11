public class lab2 {
    public static void main(String[] args){
        int[][] arr = new int[15][];
        arr [0] = new int [5];
        arr [1] = new int [5];
        arr [2] = new int [5];
        arr [3] = new int [5];
        arr [4] = new int [8];
        arr [5] = new int [8];
        arr [6] = new int [8];
        arr [7] = new int [8];
        arr [8] = new int [3];
        arr [9] = new int [3];
        arr [10] = new int [3];
        arr [11] = new int [3];
        arr [12] = new int [9];
        arr [13] = new int [9];
        arr [14] = new int [9];

        for(int i = 0; i<arr[i].length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j]=(int)(Math.random()*16);
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();//перехід на новий рядок
        }



    }
}
