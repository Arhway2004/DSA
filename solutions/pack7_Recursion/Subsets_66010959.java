//package solutions.pack7_Recursion;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Subsets {
//    public static void printSubsetsRecursive(List<Integer> set){
//        List<Integer> currentSubset = new ArrayList<>();
//        printAllSubsets_Recurse_helper(set, 0, currentSubset);
//    }
//    public static void printAllSubsets_Recurse_helper(List<Integer> set,int index,List<Integer> currentSubset){
//        if(index == set.size()){
//            System.out.println(currentSubset);
//            return ;
//        }
//        currentSubset.add(set.get(index));
//        printAllSubsets_Recurse_helper(set , index+1,currentSubset);
//        currentSubset.remove(set.get(index));
//        printAllSubsets_Recurse_helper(set , index+1,currentSubset);
//    }
//}
