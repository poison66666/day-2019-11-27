import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void put(int node){
        stack1.push(node);
    }

    public int pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("栈空");
        }
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
         solution.put(1);
         solution.put(2);
         solution.put(3);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());
    }
}
