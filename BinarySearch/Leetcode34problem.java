public class Leetcode34problem {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        
        int[] arr = {5,7,7,8,8,10};
        int target = 6;
        int[] result = searchRange(arr, target);
        // myapproach not passed all the test cases
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length==0){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        // my approach start
        // result[0] = findFirstPosition(nums, target)==0 ? -1 : findFirstPosition(nums, target);
        // result[1] = findLastPosition(nums, target)==0 ? -1 : findLastPosition(nums, target);
        // my approach end
        // optimal approach start
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        // optimal approach end
        return result;
    }
    static int findFirstPosition(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]<target) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
           
        }
        return nums[start]>target ? -1 : start;
    }
    static int findLastPosition(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]>target) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            // here we are not record the last position of target
           
        }
        return  nums[end]<target ? -1 : end;
    }
    
    static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                position = mid; // record position
                end = mid - 1; // keep searching left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return position;
    }

    static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                position = mid;
                start = mid + 1; // keep searching right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return position;
    }

    //mistakes:
    // 1. not handling the case when target is not present in the array
    // 2. not returning -1 when target is not found
    // 3. not considering edge cases like empty array
    // 4. not optimizing the search to find first and last positions in a single pass
    // 5. not using a separate variable to store the found position
    // 6. not adjusting the search boundaries after finding a match
    // 7. not returning the correct indices when target is found
    // 8. not handling duplicates correctly
    // 9. not testing with various test cases to ensure correctness

}
