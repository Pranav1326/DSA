class CircularQueue{
    int maxSize = 5;
    int front, rear;
    int arr[];
    CircularQueue(){
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }
    boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    void enque(int ele){
        if(isEmpty()){
            front = 0;
            rear = 0;
            arr[rear] = ele;
        }
        else{
            rear = (rear + 1)%maxSize;
            if(front == rear){
                System.out.println("Queue is full!");
                rear = (rear-1+maxSize)%maxSize;
            }
            else{
                arr[rear] = ele;
            }
        }
    }
    int deque(){
        int item = -1;
        if(!isEmpty()){
            item = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                rear = (rear+1)%maxSize;
            }
        }
        else{
            System.out.println("Queue is empty!");
        }
        return item;
    }
    int peak(){
        if(!isEmpty()){
            return arr[front];
        }
        else{
            System.out.println("Queue is empty!");
            return -1;
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        else if(rear >= front){
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for(int i=front; i<maxSize-1; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

class CircularQueueArray{
    public static void main(String args[]){
        CircularQueue q = new CircularQueue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);
        q.deque();
        q.enque(60);
        q.display();
    }
}