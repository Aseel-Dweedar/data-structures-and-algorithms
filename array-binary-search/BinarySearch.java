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
        int n5 = 8;

        int[] arr6= {};
        int n6 = -80;

        int[] arr7 = {11};
        int n7 = 11;

        int[] arr8 = {11, 22, 33, 44, 55};
        int n8 = 55;

        int[] arr9 = {11, 22, 33};
        int n9 = 11;

        int[] arr10 = {11, 22, 33};
        int n10 = 33;

        int[] arr11 = {11, 22, 33};
        int n11 = 22;

        int[] arr12 = {11, 22, 33, 44, 55, 66};
        int n12 = 11;

        int[] arr13= {1,2,3,4,5};
        int n13 = 8;

        int[] arr14= {1,2,3,4,5};
        int n14 = 4;

        BinarySearch(arr1 , n1 );
        BinarySearch(arr2 , n2);
        BinarySearch(arr3 , n3 );
        BinarySearch(arr4 , n4 );
        BinarySearch(arr5 , n5);
        BinarySearch(arr6 , n6);
        BinarySearch(arr7 , n7 );
        BinarySearch(arr8 , n8 );
        BinarySearch(arr9 , n9 );
        BinarySearch(arr10 ,n10);
        BinarySearch(arr11 ,n11);
        BinarySearch(arr12 ,n12);
        BinarySearch(arr13,n13);
        BinarySearch(arr14 ,n14);

    }

    public static int BinarySearch(int[] arr , int n) {
        int idx = -1;
        if (arr.length == 0) return idx;
        if (arr.length <= 2) {
            for (int i = 0; i < arr.length; i++) {
                if (n == arr[i]){
                    idx = i;
                    return idx;
                }
            }
        }
        int leftIdx = 0;
        int rigthIdx = arr.length - 1;
        while (rigthIdx >= leftIdx){
        int arrMid = (int) (double)(leftIdx+rigthIdx)/2;
            if (n == arr[arrMid]){
                idx = arrMid;
                break;
            }
            if (n < arr[arrMid]) {
                rigthIdx = arrMid-1;
            } else {
                leftIdx = arrMid+1;
            }
        }
        System.out.println(idx);
        return idx;
    }}