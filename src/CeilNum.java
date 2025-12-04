// package Leetcode744;
public class CeilNum {
    public static void main(String[] args) {
        // Ceil number is the smallest number greater than or equal to target
        int arr[]={2,3,5,9,14,14,14,14,14,14,16,18};
        int target=15;
        int result=ceilNum(arr,target);
        System.out.println(result);
    }
    static int ceilNum(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // apply the same binary search logic
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
                // if found return mid
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        // here start will be pointing to the smallest number greater than target
        return arr[start];
        // why start? because start always right side its in incremental order not in decremental order 
    }
}
