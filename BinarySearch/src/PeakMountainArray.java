public class PeakMountainArray {
    
    public static int peakArray(int[] arr){
        int low = 1;
        int high = arr.length-2;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            } else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,7,4,2};
        System.out.println(peakArray(arr));
    }
}
