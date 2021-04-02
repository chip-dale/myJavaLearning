public class Queue {
    int n;
    int[] arr;
    int tos;

    Queue(int n) {
        this.n = n;
        arr = new int[n];
        tos = -1;
    }

    void push(int item) {
        if(tos == n-1) {
            System.out.println("queue/stack is full");
        } else {
            arr[++tos] = item;
        }
    }

    int pop() {
        if(tos < 0) {
            System.out.print("\nstack is not full\t");
            return 0;
        } else {
            return arr[tos--];
        }
    }

    int pop(int item) {
        if(tos < 0) {
            System.out.print("\nqueue is not full\t");
            return 0;
        } else {
            return arr[tos--] = item;
        }
    }
}
