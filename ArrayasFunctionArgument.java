public class ArrayasFunctionArgument {
    private static void doubleMake(int arr[], int dol) {
        dol = 40;
        int idx = 0;
        for (int i : arr) {
            arr[idx] = i * 2;
            idx++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int dol = 20;
        doubleMake(arr, dol);
        System.out.println((dol));
        for (int i : arr) {
            System.out.print(i + "    ");
        }
    }
}
