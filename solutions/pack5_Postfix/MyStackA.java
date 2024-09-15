//package solutions.pack5_Postfix;
//
//public class MyStackA {
//    private int MAX_SIZE = 100;
//    private double[] stack = new double[MAX_SIZE];
//    public int top = 0;
//
//    public void push(double d) {
//        if (isFull()) {
//            stack[top++] = d;
//        }
//    }
//
//    public double pop() {
//        if (isEmpty()) {
////            System.out.println(stack[--top]);
//            return stack[--top];
//        }
//        else{
//            return -1;
//        }
//    }
//    public double top(){
//
//        if (isEmpty()) {
//            System.out.println(stack[top-1]);
//            return stack[top-1];
//        }
//        else{
//            return -1;
//        }
//    }
//
//    public boolean isEmpty() {
//        if (top == -1) return false;
//        else return true;
//    }
////    public boolean isEmpty() {
////        return top == -1;
////    }
//
//    public boolean isFull() {
//        if (MAX_SIZE == top) return false;
//        else return true;
//    }
////    public boolean isFull() {
////        return top == MAX_SIZE - 1;
////    }
//
//
//    //    @Override
////    public String toString(){
////        StringBuffer sb =new StringBuffer();
////        sb.append("top->");
////        for(int i = top-1;i>0; i--){
////            sb.append("[");
////            sb.append(stack[i]);
////            sb.append("]->");
////        }
////        sb.append("bottom");
////        return new String(sb);
////    }
//    @Override
//    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        sb.append("top->");
//        for (int i = top - 1; i >= 0; i--) {
//            sb.append("[");
//            sb.append(stack[i]);
//            sb.append("]");
//        }
//        sb.append("bottom");
//        return new String(sb);
//    }
//}
