package stack.and.queue;

public class PseudoQueue<T> {

    public Stack<T> stack1 = new Stack<T>();
    public Stack<T> stack2 = new Stack<>();

    public void enqueue(T value) {
         stack1.push(value);
    }

    public T dequeue() {
        T valueToReturn = null;
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            valueToReturn = stack2.pop();
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        return valueToReturn;
    }
}