public class FirstOccurance {
    public static int firstOcc(int[] a, int target){
        int low = 0;
        int high = a.length-1;
        int result = -1;


        while(low <= high){
            int mid = low + (high - low)/2;

            if(a[mid] == target){
                result = mid;
                high = mid - 1;
            } else if(a[mid] < target){
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7,8,9};
        int target = 1;
        System.out.println(firstOcc(a,target));
    }
}
