import java.util.ArrayList;
import java.util.Arrays;

public class MyStack<T> {
    private ArrayList<T> arrayList;
    private int top;

    public MyStack() {
        this.arrayList = new ArrayList<>();
        this.top = -1;
    }

    public MyStack(T []arr){
        this.arrayList = new ArrayList<>();
        this.arrayList.addAll(Arrays.asList(arr));
        this.top = arr.length - 1;
    }

    public void push(T element){
        this.arrayList.add(element);
        this.top += 1;
    }

    public T pop(){
        if (this.top == -1){
            System.out.println("ERROR: Stack is empty");
            return null;
        } else {
            T deletedElemet = this.arrayList.remove(this.top);
            this.top -= 1;
            return deletedElemet;
        }
    }

    public T read_top(){
        if (this.top == -1){
            System.out.println("ERROR: Stack is empty");
            return null;
        } else{
            return this.arrayList.get(this.top);
        }
    }

    public void printStack(){
        if (this.top == -1){
            System.out.println("Stack is empty");
        } else{
            System.out.println(this.arrayList);
        }
    }
}
