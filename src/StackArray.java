
public class StackArray {

    private  int[] stack;
    private  int top;

    public  StackArray(int size)
    {
        stack=new int[size];
        top=-1;


    }
    public  void pushNumber(int num)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return;

        }
        stack[++top]=num;


    }
    public  int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
                    return -1;
        }
        return  stack[top--];

    }
    public  boolean isEmpty()
    {
        return  top==-1;

    }
    public boolean isFull()
    {
        return  top==stack.length-1;

    }

    public  void printStack()
    {
        for (int i=top;i>0;i--)
        {
            System.out.println(stack[i]);


        }


    }



}
