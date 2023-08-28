class Stack {
    static final int max = 3;
    static int top = -1;
    int arr[] = new int[max];

    void Push(int x) {
        top++;
        if (top == max)
            throw new ArithmeticException("Overflow");
        else
            arr[top] = x;

    };

    void Pop() {
        try {
            int a = arr[top];
            top--;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class StackUsingException {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.Push(2);
        obj.Push(2);
        obj.Push(2);
        obj.Push(2);
        obj.Pop();
        obj.Pop();
        obj.Pop();
        obj.Pop();

    }
}
