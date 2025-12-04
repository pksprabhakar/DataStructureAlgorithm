public class FloorNum {
     public static void main(String[] args) {
        // Floor number is the greatest number smaller than or equal to target
        int arr[]={2,3,5,9,14,14,14,14,14,14,16,18};
        int target=15;
        int result=FloorNum(arr,target);
        System.out.println(result);
    }
    static int FloorNum(int[] arr, int target){
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
        // here end will be pointing to the smallest number greater than target
        return arr[end];
        // why end? because start always right side its in decremental order not in incremental order 
    }
}
