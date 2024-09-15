package solutions.pack9_Heap;

public class MyHeapSort_66010959 extends MyMinHeap_66010959{
//    MyMinHeap(6);
//    private MyMinHeap heap;
//    public MyHeapSort() {
//        heap = new MyMinHeap(6);
//    }
    public String sort(){
        StringBuilder result = new StringBuilder();
        MyMinHeap_66010959 temp = new MyMinHeap_66010959();

        for(int i = 0 ;i < 6;i++){
            temp.insert(heap[i]);
        }
        while(!temp.isEmpty()){
            result.append(temp.remove()).append(" ");
        }
        return result.toString().trim();
    }
}
