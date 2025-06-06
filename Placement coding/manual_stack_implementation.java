import java.util.*;
class Main {
    static final int max=10;
    static int[] stack = new int[max];
    static int top = -1;
    
    static void push(int val){
        if(top>=max){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = val;
        System.out.println(val+"is pushed to the stack..");
        
    }

    static void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        System.out.println(stack[top--]+"is popped");
        
    }
    
    static void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("The recent item is"+stack[top]);
        
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        pop();
        peek();
    }
}
