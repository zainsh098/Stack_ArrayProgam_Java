import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Stack Size ");
        Scanner inputStackNumber=new Scanner(System.in);
        int stackSize= input.nextInt();

        System.out.println("Enter Stack Numbers :");
        StackArray stackArray=new StackArray(stackSize);




        for (int i=1;i<=stackSize;i++)
        {
            stackArray.pushNumber(inputStackNumber.nextInt());


        }
       int popNumbers= stackArray.pop();

        System.out.println("The Stack Numbers are:\n" );

        stackArray.printStack();


        System.out.println("The Pop Elements Are :");
        System.out.println(popNumbers);




    }
}