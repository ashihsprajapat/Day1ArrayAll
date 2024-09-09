package ArrayDay1;

class IntroToArray {

    public static void main(String[] args) {
        // initilization to array
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }

        int arr2[] = { 2, 5, 7, 1 };
        int arr3[] = new int[arr.length];
        for (int i : arr2) {
            arr3[i] = arr2[i];
        }
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
