import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;

class Main {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    
  }
}