class Node{
    int data;
    Node next;
}
class Queue{
    Node front = null;
    Node rear = null;
    boolean isEmpty(){
        return front == null;
    }
    void enque(int d){
        Node node = new Node();
        node.data = d;
        node.next = null;
        if(rear == null){
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }
    int deque(){
        if(isEmpty()){
            System.out.println("Queue underflow!");
            return -1;
        }
        int d = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return d;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue underflow!");
            return -1;
        }
        return front.data;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue underflow!");
            return;
        }
        Node n = front;
        while(n.next != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data + " ");
        System.out.println();
    }
}
class QueueLinkedList{
    public static void main(String args[]){
        Queue q = new Queue();
        q.deque();
        q.peek();
        q.display();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.display();
        System.out.println(q.peek());
        q.deque();
        q.display();
    }
}