//package solutions.pack5_Postfix;
//
//public class MyStackL {
//    private Node top;
//    public MyStackL(){
//        this.top = null;
//    }
//    public class Node{
//        String value;
//        Node next;
//
//        public Node(String d){
//            value =  d;
//            next = null;
//        }
//    }
//    public void push(String d){
//        Node node = new Node(d);
//        node.next = top;
//        top = node.next;
//    }
//    public String pop(){
//        String d = top.value;
//        top=top.next;
//        return d;
//    }
//    public String peek(){
//        return top.value;
//    }
//    public boolean isFull(){
//        return false;
//    }
//    public boolean isEmpty(){
//        return top == null;
//    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new
//                StringBuilder();
//        sb.append("Top->");
//        Node temp = top;
//        while (temp != null) {
//            sb.append(temp.value).append("->");
//            temp = temp.next;
//        }
//        sb.append("Bottom");
//        return sb.toString();
//    }
//}
