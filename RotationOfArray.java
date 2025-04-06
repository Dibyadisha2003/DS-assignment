class RotationOfArray{
    public static void rotate(int arr[], int d, int n){
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;
        rotate(arr, d, n);
    }
}