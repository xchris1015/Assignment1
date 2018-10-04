package io.chris.training;
import java.util.Stack;
public class Solution682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<ops.length;i++){
            switch (ops[i]){
                case "C" :
                    stack.pop();
                    break;
                case "D":
                    stack.push(2*stack.peek());
                    break;
                case "+" :
                    int temp = stack.pop();
                    int addValue = stack.peek()+temp;
                    stack.push(temp);
                    stack.push(addValue);
                    break;
                default :
                    stack.push (Integer.parseInt(ops[i]));
                    break;
            }
        }
        int sum = 0;
        while (stack.size() > 0) sum += stack.pop();
        return sum;
    }

    public static void main(String args[]){
        String[] myStringArray;
        myStringArray = new String[]{"5","-2","4","C","D","9","+","+"};
        Solution682 solution682 = new Solution682();
        System.out.println(solution682.calPoints(myStringArray));
    }
}


