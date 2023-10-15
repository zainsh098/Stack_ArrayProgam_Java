import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Stack Size ");
        Scanner inputStackNumber=new Scanner(System.in);
        int stackSize= input.nextInt();

        System.out.println("Enter Stack Numbers :");
        StackArray stackArray=new StackArray(stackSize);




        for (int i=0;i<=stackSize;i++)
        {
            stackArray.pushNumber(inputStackNumber.nextInt());


        }


        stackArray.printStack();




    }
}