// Java Program to find Ceiling / Floor of a Number :-

public class CeilingBS {
    public static void main(String[] args){
        int[] arr = {1,3,5,6,7,8,10};
        int target = 9;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if(target < arr[mid]){
                end = mid - 1;
                start = start;
            } else {
                start = mid + 1;
                end = end;
            }
        }
        return arr[start];
        //If you want to find floor of a number than return end instead of start, and rest code remain same
    }
}
