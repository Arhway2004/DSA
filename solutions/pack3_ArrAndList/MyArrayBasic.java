//
//package solutions.pack3_ArrAndList;
//
//public class MyArrayBasic {
//    protected int MAX_SIZE = 10;
//    protected int data[] = new int[MAX_SIZE];
//    protected int now = 0;
//
//    public MyArrayBasic(int... d) {
//        if (d != null && d.length > MAX_SIZE) {
//            MAX_SIZE = d.length;
//            data = new int[MAX_SIZE];
//        }
//        if (d != null) {
//            for (int ele : d) {
//                data[now] = ele;
//                now++;
//            }
//        }
//    }
//
//    public void add(int d) {
//        if (MAX_SIZE != now) {
//            data[now] = d;
//            now++;
//        }
//    }
//
//        public void insert(int d, int index) {//insert of array need to move before
//        if(now >= index && MAX_SIZE > now && index >=0){
//            for(int i = now; i > index ;i--){
//                data[i] = data[i-1];//-1
//            }
//            data[index]=d;
//            now++;
//
//        }else{
//            System.out.println("Invalid index or array is full.");
//
//        }
//    }
//
//    public int find(int d) {
//        int count =0;
//        for(int i : data){
//            if(i == d){
//                return count;
//            }
//            count++;
//        }
//        return -1;
//    }
//
//    public int binarySearch(int d) {//
//        int left = 0;
//        int right =now;
//        int mid =( 0+(now-0))/2;
//        while(left <= right){
//            if(data[mid]==d){
//                return mid;
//            }
//            else if(data[mid] > d){
//                left = mid -1;
//            }else if(data[mid] < d){
//                right = mid +1;
//            }
//        }
//        return -1;
//    }
//
//    public void delete(int index) {//need delete 1
//        if(index <= now){
//            for(int i =0; i < now-1;i++){
//                if(i >= index){
//                    data[i] =data[i+1];
//                }
//            }
//            now--;
//        }else{
//            System.out.println("Error");
//        }
//    }
//
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//
//        for (int i = 0; i < this.data.length; ++i) {
//            sb.append(this.data[i]);
//            if (i < this.data.length - 1) {
//                sb.append(", ");
//            }
//        }
//
//        sb.append("]");
//        return sb.toString();
//    }
//}
