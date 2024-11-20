// Stack Class
public class Stack {
    private int arr[];
    private int size;
    private int index = 0;
    
    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Pushing an element on the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            arr[index] = element;
            index++;
        }
    }

    // Popping an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; 
        }
        return arr[--index];
    }

    // Checking whether the stack is empty
    public boolean isEmpty() {
        return index == 0;
    }

    // Checking whether the stack is full
    public boolean isFull() {
        return index == size;
    }

    // Getting the size of the stack
    public int size() {
        return index;
    }
}

// StackClient Class
public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        // Pushing elements onto the stack
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);
        
        // Printing the size of the stack after push operations
        System.out.println("1. Size of stack after push operations: " + stack.size());

        // Popping elements from the stack
        System.out.println("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        
        // Printing the size of the stack after pop operations
        System.out.println("\n3. Size of stack after pop operations: " + stack.size());
    }
}
