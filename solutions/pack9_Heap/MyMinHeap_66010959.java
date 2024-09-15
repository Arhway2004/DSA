package solutions.pack9_Heap;

//import static java.util.Collections.swap;

public class MyMinHeap_66010959 {
    public int[] heap;
    private int size;
    private int max;
//    public MyMinHeap(int max){
//        this.max = max;
//        this.heap = new int[max];
//        this.size = 0;
//    }
    public MyMinHeap_66010959(){
        this.max = 6;
        this.heap = new int[max];
        this.size = 0;
    }

    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    //Parent of node i is located at index (i - 1) / 2.
    //Left child of node i is located at index 2 * i + 1.
    //Right child of node i is located at index 2 * i + 2.
    public void insert(int n){
        if(size == max){
            throw new RuntimeException("Full");
        }
        heap[size] = n;
        int temp = size;
        size++;
        while(temp >0 && heap[temp]<heap[(temp-1)/2]){
            swap(temp,(temp-1)/2);
            temp = (temp-1)/2;// because temp =size alr so size is still size so make it to be temp here
        }

    }
//    make smallest number at the root
    public void heapify(int n){
        int left = leftChild(n);
        int right = rightChild(n);
        int smallest = n;

        if(left < size && heap[left] < heap[smallest]){
            smallest =left;
        }
        if(right < size && heap[right] < heap[smallest]){
            smallest =right;
        }
        if(smallest != n){
            swap(n,smallest);
            heapify(smallest);
        }
    }

    public int leftChild(int n){
        return 2*n +1;
    }
    public int rightChild(int n){
        return 2*n +2;
    }

    public int remove(){
        if(isEmpty()){
            throw new RuntimeException("Heap is empty");
        }
        int min = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapify(0);
        return min;

    }
//    public boolean isFull(){
//        if(max == size){
//            return false;
//        }
//        return true;
//    }
    public boolean isFull(){
        return size == max;
    }

//    public boolean isEmpty(){
//        if(size == 0 ){
//            return false;
//        }
//        return true;
//    }
    public boolean isEmpty(){
        return size == 0;
    }

    public int front(){
        return heap[0];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Heap: [");
        for (int i = 0; i < size; i++) {
            sb.append(heap[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
