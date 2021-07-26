import java.lang.*;
public class ArrayInsertShift {
    public static void main(String[] args) {
        int[] arr = {2,4,6,-8};
        int[] arr2 = {42,8,15,23,42};
        int[] arr3 = {1,2,3,4,5,7,8,9,10};
        System.out.println("===========================");
        ArrayInsertShift(arr, 5);
        System.out.println("===========================");
        ArrayInsertShift(arr2, 16);
        System.out.println("===========================");
        ArrayInsertShift(arr3, 6);
    }
    public static int[] ArrayInsertShift(int[] arr , int n) {
        int[] newArr = new int[arr.length+1];
        /* Get the middle index of the arr as integer */
        double getMiddle = Math.ceil((double) arr.length/2);
        int middleNum = (int)getMiddle;
        /* Add values to new Arra before the middle index change */
        for (int i = 0; i <= middleNum; i++) {
            if (i == middleNum){
                newArr[i] = n;
                System.out.println("The added value: " + newArr[i]);
            } else {
                newArr[i] = arr[i];
                System.out.println(newArr[i]);
            }
        }
        /* Add values to new Arra after the middle index change */
        for (int i = middleNum; i < arr.length; i++) {
            newArr[i] = arr[i];
            System.out.println(newArr[i]);
        }
        return newArr;
    }
}