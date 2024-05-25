class Node{
    int data;
    Node next;
}
class Stack{
    Node top = null;
    boolean isEmpty(){
        return top == null;
    }
    void push(int d){
        Node node = new Node();
        node.data = d;
        node.next = top;
        top = node;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;     
        }
        top = top.next;
        return top.data;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        Node n = top;
        while(n.next != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data + " ");
        System.out.println();
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }
}
class StackLinkedList{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.display();
    }
}