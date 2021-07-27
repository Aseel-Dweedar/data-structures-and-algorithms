public class BinarySearch {
    public static void main(String[] args) {

        int[] arr1 = {4, 8, 15, 16, 23, 42};
        int n1 = 15;

        int[] arr2 = {-131, -82,42};
        int n2 = -42;

        int[] arr3 = {11, 22, 33, 44, 55, 66, 77};
        int n3 = 77;

        int[] arr4 = {1, 2};
        int n4 = 1;

        int[] arr5= {1,2,3,4,5};
        int n5 = 2;

        int[] arr6= {};
        int n6 = -80;

        int[] arr7 = {11};
        int n7 = 11;

        int[] arr8 = {11, 22, 33, 44, 55};
        int n8 = 55;


        BinarySearch(arr1 , n1 );
        BinarySearch(arr2 , n2 );
        BinarySearch(arr3 , n3 );
        BinarySearch(arr4 , n4);
        BinarySearch(arr5 , n5 );
        BinarySearch(arr6 , n6 );
        BinarySearch(arr7 , n7 );
        BinarySearch(arr8 , n8 );

    }
    public static int BinarySearch(int[] arr , int n) {
        int idx = -1;
        if (arr.length == 0) return -1;
        if (arr.length <= 2) {
            for (int i = 0; i < arr.length; i++) {
                if (n == arr[i]){
                    idx = i;
                    System.out.println(idx);
                    return idx;
                }
            }
        }
        int arrMid =(int) Math.ceil((double) arr.length/2);
        int leftIdx = 0;
        int rigthIdx = arr.length - 1;
        while (rigthIdx >= leftIdx && arrMid != leftIdx && arrMid != rigthIdx ){
            if (n == arr[arrMid]){
                idx = arrMid;
                break;
            }
            if (n < arr[arrMid]) {
                rigthIdx = arrMid;
            } else {
                leftIdx = arrMid;
            }
            arrMid =  (int)(Math.ceil(  (double)  (rigthIdx+leftIdx)/2)  );
         }
        if (n == arr[arrMid]){
            idx = arrMid;
        }
        System.out.println(idx);
        return idx;
    }
}