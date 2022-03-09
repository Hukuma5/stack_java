public class stack {
    public static void main(String[] args) {
        MyStack<Integer> st = new MyStack<Integer>();
        st.push(2);
        st.push(5);
        int a = st.pop();
        st.printStack();
        st.pop();
        st.pop();
        st.printStack();
        st.read_top();
        System.out.print("Deleted element: ");
        System.out.println(a);
        Integer []ar = {2, 7, 9, 10};
        MyStack<Integer> st2 = new MyStack<Integer>(ar);
        st2.printStack();
        st2.pop();
        st2.printStack();
        st2.push(18);
        st2.printStack();
        int b = st2.read_top();
        System.out.print("Top: ");
        System.out.println(b);
        String []str = {"qwerty", "ytrewq"};
        MyStack<String> st3 = new MyStack<String>(str);
        st3.read_top();
        String deleted = st3.pop();
        System.out.print("Deleted element: ");
        System.out.println(deleted);
        st3.printStack();
        st3.push("wasd");
        st3.printStack();
    }
}

