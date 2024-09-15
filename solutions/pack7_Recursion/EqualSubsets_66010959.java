//package solutions.pack7_Recursion;
//import java.util.HashMap;
//import java.util.Map;
//
//public class EqualSubsets {
//
//    public static Boolean canPartition_Recur(int[] a){
//        if(a.length%2 !=0){
//            return false;
//        }
//        int sum =0;
//        for(int ele:a){
//            sum+=ele;
//        }
//        return canPartition_Recur_helper(0,a,sum/2);
//    }
//    public static Boolean canPartition_Recur_helper(int index, int[] a, int sum){
//        if(sum ==0){
//            return true;
//        }
//        if(index > a.length || sum < 0){
//            return false;
//        }
//        return canPartition_Recur_helper(index+1,a,sum - a[index]) ||canPartition_Recur_helper(index+1,a,sum);
//    }
//    public static Boolean canPartition_Memoiz(int[] a){
//        if(a.length % 2 != 0){
//            return false;
//        }
//        int sum = 0;
//        for(int ele: a){
//            sum+=ele;
//        }
//        Map<String, Boolean> memo =  new HashMap<>();
//        return canPartition_Memoiz_help(0,a, sum/2,memo);
//    }
//    public static Boolean canPartition_Memoiz_help(int index, int[] a ,int sum, Map<String,Boolean> memo){
//        if(sum == 0){
//            return true;
//        }if(a.length < index|| sum <0 ){
//            return false;
//        }
//        String key = index + "-" + sum;
//        if(memo.containsKey(key)){
//            return memo.get(key);
//        }
//        boolean result = canPartition_Memoiz_help(index + 1, a, sum, memo) || canPartition_Memoiz_help(index + 1, a, sum - a[index], memo);
//
//        memo.put(key,result);
//        return result;
//    }
//
//}