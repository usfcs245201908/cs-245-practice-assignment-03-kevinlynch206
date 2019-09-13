public class BinaryRecursiveSearch implements Practice03Search {

	public String searchName() {
        return "BinaryRecursiveSearch";
    }
	public int search(int[] arr, int target) {
        return search2(arr, target, arr[0], arr.length - 1);

  
    }

    public int search2(int[] arr, int target, int low, int high) {
          
        //base case 
        if (low > high) {
            return -1;
        }

        int mid = (high + low) / 2;

        //job is done, target found
        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return search1(arr, target, mid+1, high);
        }

        if (target < arr[mid]) {
            return search1(arr, target, low, mid-1 );
        }  
    }
    
}