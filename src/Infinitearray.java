public class Infinitearray {
    // This code is based on amazon interview question "search in infinite array" 
    
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int t = 5;
        int index=0;
        int n =0;
        int end=index+1;
        while(arr[index]!=0){
            int mid = index + (end - index)/2;
            if (arr[mid]<t){
                index*=2;
                end=index*2;
            }
            else{
                n= binarySearch(arr, index, end, t);
            }
        }
        System.out.println(n);

    }
    static int binarySearch(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
