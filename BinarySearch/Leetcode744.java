public class Leetcode744 {
    public static void main(String[] args) {
        // find the smallest letter greater than target
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }
     static  char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length -1;
        int mid =0;
        while(s<=e){
            // same binary search logic but we have to return the smallest letter greater than target
            mid = s+(e-s)/2;
            // if (letters[letters.length-1] < target){
            //     return letters[0];
            // }
           
            if (letters[mid] > target) {
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
            
        }
        return letters[s % letters.length];
    }
}
