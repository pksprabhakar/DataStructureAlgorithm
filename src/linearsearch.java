public class linearsearch {
    public static void main(String[] args) {
        String str="Prabhakar";
        char target='P';
        System.out.println(search2(str,target,0,5));
    }
    static boolean search(String str,char target){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str,char target,int start,int end){
        if (str.length() == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
