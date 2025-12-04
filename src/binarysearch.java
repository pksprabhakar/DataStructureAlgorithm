public class binarysearch {
    // This code performs a standard binary search on a finite sorted array.
    // binary search algorithm implementation
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        // whenever we have a sorted array we can apply binary search
        int target=14;
        int result=binarySearch(arr,target);
        System.out.println(result);
    }
    static int binarySearch(int[] arr, int target){
        // binary search algorithm
        int start=0;
        // from 0
        int end=arr.length-1;
        // to length -1
        while(start<=end){
            int mid=start+(end-start)/2;
            // finding mid to n/2 operations to reduce the no of comparisons
            if(arr[mid]==target){
                return mid;
                // if found return mid
            }
            else if(arr[mid]<target){
                start=mid+1;
                // search in right half
                // if mid is less than target 
            }
            else{
                end=mid-1;
                // search in left half
                // if mid is greater than target
            }
        }
        return -1;
        // if not found return -1
    }
}
