//package solutions.pack3_ArrAndList;
//
//import java.util.Stack;
//
//public class MyLinkedListTricky {
//    Node head = null;
//    class Node{
//        int data;
//        Node next;
//
//        public Node(int d){
//            data = d;
//        }
//    }
//    public MyLinkedListTricky(){
//        this.head = null;
//    }
//
//    public void add(int... d){
//        for(int ele:d){
//            addOrder(ele);
//            System.out.println(ele);
//        }
//    }
//    public void addOrder(int d){
//        Node node = new Node(d);
//        if(head == null || d <= head.data){
//            node.next = head;
//            head = node;
//        }else{
//            Node temp = head;
//            while(temp.next != null && temp.next.data < d){
//                temp = temp.next;
//
//            }
//            node.next = temp.next;
//            temp.next = node;
//        }
//    }
//    public void q1_rotate_clockwise(int d){
//        if (head == null || d <= 0) return;
//        Node temp = head;
//        int len = 1;
//
//        while(temp.next != null){
//            temp=temp.next;
//            len++;
//        }
//        if (d >= len) d = d % len;
//        if (d == 0) return;//not waste time
//
//        temp.next = head;
//        temp = head;
//
//        for(int i=1; i< d; i++){
//            temp = temp.next;
//        }
//        head = temp.next;
//        temp.next = null;
//    }
////    public void q1_rotate_clockwise(int d){
////        Node temp = head;
////        int num =0;
//////        if()
////        for(int i = 1; i < d;i++){
////            temp = temp.next;
////        }
////
////        Node cur = temp;
////        while(temp.next != null){
////            temp = temp.next;
////        }
////        temp.next = head;
////        head = cur.next;
////        cur.next = null;
////
////    }
//    public void q2_reverse(){
//        Node pre = null;
//        Node next = null;
//        Node temp = head;
//        while(temp != null){
//            next = temp.next;//keep next
//            temp.next = pre;//point to null  before null is 8
//            pre = temp;//
//            temp = next;
//        }
//        head = pre;
//    }
//
//    public void q3_remove_dup(){ //build another node to run and pop
//        Node temp = head;
//        while(temp != null){
//            Node run = temp;
//            while(run != null){
//                if(temp == run.next){
//                    run.next = run.next.next;
//                }else{
//                    run = run.next;
//                }
//            }
//            temp=temp.next;
//        }
//    }
//
//    public void q4_add_one() {
//        head = reverse(head);
//        Node temp = head;
//        int len =1;
//        while(temp != null){
//            int sum = temp.data + len;
//            len = sum/10;//
//            temp.data = sum%10;//
//
//            if (len == 0) break;
//
//            if( temp.next == null && len >0){//left len is more than 0 and like still need to plus null alr 999 =1000
//                temp.next =  new Node(len);
//                len = 0;
//            }
//            temp = temp.next;
//
//        }
//        head = reverse(head);
//
//    }
//
//    private Node reverse(Node node){
//        Node pre = null;
//        Node next = null;
//        Node temp = node;
//        while(temp != null){
//            next = temp.next;
//            temp.next = pre;
//            pre = temp;
//            temp = next;
//        }
//        return pre;
//    }
//    public boolean q5_isPalindrome(){//use stack to keep and pop to check
////        Node re = reverse(head);
//        boolean isPalindrome = true;
//        Node temp = head;
//        Stack<Integer> stack = new Stack<>();
//        while(temp != null){
//            stack.push(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//        while(temp != null){
//            int keep = stack.pop();
//            if(temp.data != keep){
//                isPalindrome = false;
//                break;
//            }
//            temp = temp.next;
//        }
//        return isPalindrome;
//    }
//
//
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("head -> ");
//        MyLinkedListTricky.Node temp = head; // Start from the first real node, skipping dummy head
//        while (temp != null) {
//            sb.append("(");
//            sb.append(temp.data).append(")").append(" -> ");
//            temp = temp.next;
//        }
//        sb.append("null");
//        return sb.toString();
//    }
//
//}
