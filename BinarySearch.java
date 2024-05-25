// Java implementation of recursive Binary Search
class BinarySearch {
    int binarySearch(int arr[], int low, int high, int x){
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);
            return binarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
        int arr[] = {10, 40, 50, 20, 30};
        int n = arr.length;
        int x = 40;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}