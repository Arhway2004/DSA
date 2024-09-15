//package solutions.pack5_Postfix;
//import java.util.Stack;
//import java.util.StringTokenizer;
//import java.util.regex.Pattern;
//
//public class MyRPN {
//    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
//    public static boolean isNumeric(String strNum){
//        if(strNum == null)
//            return false;
//        return pattern.matcher(strNum).matches();
//    }
//    public static double computeRPN(String rpn){
//        Stack<Double> stack = new Stack<>();//build stack 1
//        StringTokenizer st = new StringTokenizer(rpn); //take only string
//        while(st.hasMoreTokens()){
//            String token =st.nextToken();//why ? because fist one is empty?
//            if(isNumeric(token)){
//                stack.push(Double.parseDouble(token));//number put here
//            }else{
//                double a = stack.pop();
//                double b = stack.pop();
//
//                switch (token){
//                    case "+":
//                        stack.push(a+b);
//                        break;
//                    case "-":
//                        stack.push(a-b);
//                        break;
//                    case "*":
//                        stack.push(a*b);
//                        break;
//                    case "/":
//                        stack.push(a/b);
//                        break;
//                    default:
//                        throw new IllegalArgumentException("Invalid operator: " + token);
//                }
//            }
//        }
//
//        return stack.pop();
//    }
//}
