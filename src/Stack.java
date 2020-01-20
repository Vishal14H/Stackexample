import java.net.SocketOption;
import java.util.Scanner;
public class Stack {
    int ar[];
    int top;
    Stack(){
        ar=new int[8];
        top=-1;
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty.");
        }
         else   {
            System.out.println("top element of stack" +ar[top]);

            }
        }



    void push(){
        if(top == 7){
            System.out.println("Stack is full.");
        }
        else{
            System.out.println("Enter Element :");
            Scanner sc = new Scanner(System.in);
            int element= sc.nextInt();
            top=top+1;
            ar[top]= element;
            System.out.println("Element is inserted.");
        }

    }
    void traverse(){
        if(top == -1){
            System.out.println("Stack is empty.");
        }
        else{
            for (int i = top; i>0;i--){
                System.out.println(ar[i]);
            }

        }

    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("Element Deleted: " +ar[top]);
            top = top -1;
        }

    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        while(true){
            System.out.println("press 1 to peek.");
            System.out.println("press 2 to push.");
            System.out.println("press 3 to traverse.");
            System.out.println("press 4 to pop.");
            System.out.println("press 5 to exit.");


            System.out.println("Enter your choice:");
            Scanner choice= new Scanner(System.in);
            int ch = choice.nextInt();
            switch (ch){
                case 1:
                    obj.peek();
                    break;

                case 2:
                    obj.push();
                    break;

                case 3:
                    obj.traverse();
                    break;

                case 4:
                    obj.pop();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong input.");
                    break;
            }
        }

    }

}
