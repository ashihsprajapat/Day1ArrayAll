public class LinearSearchArray {
    private static boolean isFound(int arr[], int key) {
        for (int i : arr) {
            if (i == key)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 2, 9, 3, 10 };
        System.out.println(isFound(arr, 10));
    }
}
