public class Homework23 {

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};
        int key = 20;
        int result = binarySearch(arr, 0, arr.length - 1, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found (-1)");
        }
    }
    public static int binarySearch(int arr[], int left, int right, int key) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key < arr[mid]) {
            return binarySearch(arr, left, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, right, key);
    }
}