class Stack{
    int stackSize = 5;
    int top = -1;
    int arr[];
    Stack(){
        arr = new int[stackSize];
    }
    int push(int ele){
        if(top == stackSize-1){
            System.out.println("Stack overflow!");
        }
        else{
            top = top + 1;
            arr[top] = ele;
            return arr[top];
        }
        return -1;
    }
    int pop(){
        if(top == -1){
            System.out.println("Stack underflow!");
        }
        else{
            return top = top - 1;
        }
        return arr[top+1];
    }
    int peak(){
        return arr[top];
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is empty!");
        }
        else{
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
class StackArray{
    public static void main(String args[]){
        Stack s = new Stack();
        s.display();
        s.pop();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.push(40);
        System.out.println(s.peak());
        s.push(50);
        s.display();
    }
}