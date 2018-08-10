package Stack;


import java.util.Stack;

public class MaxStack {
    Stack<Integer> s;
    Integer maxEle;

    // Constructor
    MaxStack() { s = new Stack<Integer>(); }

    // Prints minimum element of MyStack
    void getMax()
    {
        // Get the minimum number in the entire stack
        if (s.isEmpty())
            System.out.println("Stack is empty");

            // variable maxEle stores the minimum element
            // in the stack.
        else
            System.out.println("Maximum Element in the " +
                    " stack is: " + maxEle);
    }

    // prints top element of MyStack
    void peek()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = s.peek(); // Top element.

        System.out.print("Top Most Element is: ");

        // If t < maxEle means maxEle stores
        // value of t.
        if (t > maxEle)
            System.out.println(maxEle);
        else
            System.out.println(t);
    }

    // Removes the top element from MyStack
    void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t > maxEle)
        {
            System.out.println(maxEle);
            maxEle = t-maxEle ;
        }

        else
            System.out.println(t);
    }

    // Insert new number into MyStack
    void push(Integer x)
    {
        if (s.isEmpty())
        {
            maxEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        // If new number is less than original maxEle
        if (x > maxEle)
        {
            s.push(x + maxEle);
            maxEle = x;
        }

        else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }



    public static void main(String args[])
    {
        MaxStack s = new MaxStack();
        s.push(3);
        s.push(5);
        s.getMax();
        s.push(2);
        s.push(10);
        s.getMax();
        s.pop();
        s.getMax();
        s.pop();
        s.peek();
        System.out.println(s);

    }


}
