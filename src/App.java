import java.util.Scanner;

class StackClass {
    private int[] stack;
    private int top;

    public StackClass(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if(top == stack.length-1)
            System.out.println("Stack is full");
        else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
            else {
            return stack[top--];
        }
    }
}

class PostFixEvaluate {
    static int evaluate(String exp){
        StackClass stack = new StackClass(5);
        for(int i = 0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == ' ')
                continue;
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^'){
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = 0;
                switch(ch){
                    case '+':
                        result = op2 + op1;
                        break;
                    case '-':
                        result = op2 - op1;
                        break;
                    case '*':
                        result = op2 * op1;
                        break;
                    case '/':
                        result = op2 / op1;
                        break;
                    case '^':
                        result = (int)Math.pow(op2, op1);
                        break;
                }
                stack.push(result);
            }
            else {
                stack.push(ch - '0');
            }
        }
        return stack.pop();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression: ");
        String exp = sc.nextLine();
        System.out.println("Result: " + PostFixEvaluate.evaluate(exp));
        sc.close();
    }
}
