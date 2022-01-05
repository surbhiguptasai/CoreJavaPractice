public class Array4 {
    public static void main(String[] args) {
        int arr [][] = {
                {10, 20, 30},
                {5, 10, 15, 20, 25},
                {2, 4, 6, 8, 10, 12},
                {99, 999}
        };
        for (int i=0; i< arr.length;i++){
            System.out.println("arr["+i+"] elements");
            //System.out.println(arr[i]);
            for (int j=0; j< arr[i].length;j++){

                System.out.println("arr["+i+"]["+j+"]:" +arr[i][j]);
            }
            System.out.println();
        }
        int m=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                m=Math.min(m,arr[i][j]);

            }
        }
        System.out.println("\nThe smallest value from the above array: " +m);
    }
}
