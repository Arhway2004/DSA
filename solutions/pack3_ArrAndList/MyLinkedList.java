//package solutions.pack3_ArrAndList;
//
//public class MyLinkedList {
//    class Node{
//        int data ;
//        Node next;
//        public Node(int d){
//            data = d;
//            next =null;
//        }
//    }
//    Node head = null;
//    public MyLinkedList(){
//        this.head = null;
//    }
//
//
//
//    public void add(int d) {
//        Node node = new Node(d);
//        node.next = head;
//        head = node;
//    }
//
//
//    public void insert(int d){
//        Node node = new Node(d);
//        if(d <= head.data || head == null){
//            node.next = head;
//            head = node;
//        }else{
//            Node temp = head;
//            while (temp.next != null && temp.next.data < d) {// position is impotant
//
//                temp = temp.next;
//            }
//            node.next = temp.next;
//            temp.next = node;
//        }
//    }
//
//    public void delete(int d){
//        Node temp = head;
//        while(temp != null){
//            if(temp.next.data == d){
//                temp.next = temp.next.next;
//                break;
//            }
//            temp = temp.next;
//        }
//    }
//    public int find(int d){
//        int count = 0;
//        Node temp = head;
//        while(temp != null){
//            if(temp.data == d){
//                return count;
//            }
//            count++;
//            temp = temp.next;
//        }
//        return -1;
//    }
////
////    public void add(int[] d) {//数组5 0到4
////
////    }
////    public void insert2(int[] d){
////
////    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("head -> ");
//        Node temp = head; // Start from the first real node, skipping dummy head
//        while (temp != null) {
//            sb.append("(");
//            sb.append(temp.data).append(")").append(" -> ");
//            temp = temp.next;
//        }
//        sb.append("null");
//        return sb.toString();
//    }
//}
//
