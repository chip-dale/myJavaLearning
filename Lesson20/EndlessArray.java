import java.util.Arrays;

public class EndlessArray {
    public int length;
    private int n;
    private int tos;
    private int[] arr;

    EndlessArray() {
        n = 10;
        tos = -1;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+n;
        }
        int[] newArr = new int[n+10];
        System.arraycopy(arr, 0, newArr, 0, n);
        arr = newArr;
    }

    public void push(int item) {
        arr[++tos] = item;
    }

    public int get(int i) {
        return arr[i];
    }

    @Override
    public String toString() {
        return "<!> REAL ARRAY (invisible) = " + Arrays.toString(arr);
    }
}
