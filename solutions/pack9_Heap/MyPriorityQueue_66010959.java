package solutions.pack9_Heap;

public class MyPriorityQueue_66010959 implements MyQueueInterface {
    private MyMinHeap_66010959 heap;

    public MyPriorityQueue_66010959() {
        heap = new MyMinHeap_66010959();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public boolean isFull() {
        return heap.isFull();
    }

    @Override
    public void enqueue(int d) {
        if (!isFull()) {
            heap.insert(d);
        }
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            return heap.remove();
        }
        return 0;
    }

    @Override
    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        }
        return heap.front();
    }

    @Override
    public String toString() {
        return "PriorityQueue: " + heap.toString();
    }
}
