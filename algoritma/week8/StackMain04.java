public class StackMain04 {
    public static void main(String[] args) {
        
        Stack04 stk = new Stack04(5);
        stk.push(15);
        stk.push(27);
        stk.push(13);
        stk.print();

        stk.push(11);
        stk.push(34);
        stk.pop();
        stk.peek();
        stk.print();
        
        stk.push(18);
        stk.push(40);
        stk.print();
    }
}