public class FloorCeilSortedArray {

    public static int findFloor(int[] arr, int tar){
        int low =0, high = arr.length-1;
        int idx = -1;

        while (low <= high){
            int mid = (low + high)/2;

              if(arr[mid] > tar){
                  high = mid - 1;
            } else {
                  idx = mid;
                  low = mid + 1;
              }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,2,3};

    }
}
