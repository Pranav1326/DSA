class Queue{
    int queSize = 5;
    int arr[];
    int front, rear;
    Queue(){
        front = -1;
        rear = -1;
        arr = new int[queSize];
    }
    void enque(int ele){
        if(rear == queSize-1){
            System.out.println("Queue if full!");
            return;
        }
        else if(front == -1 && rear == -1){
            front = front + 1;
            rear = rear + 1;
        }
        else{
            rear = rear + 1;
        }
        arr[rear] = ele;
    }
    void deque(){
        if(rear == -1){
            System.out.println("Queue if empty!");
            return;
        }
        else{
            for(int i=0; i<rear-1; i++){
                arr[i] = arr[i+1];
            }
            if(rear < queSize){
                arr[rear] = 0;
            }
            rear = rear - 1;
        }
    }
    void front(){
        if(front == -1){
            System.out.println("Queue if empty!");
        }
        else{
            System.out.println(arr[front]);
        }
    }
    void display(){
        if(front > rear){
            System.out.println("Queue if empty!");
        }
        for(int i=front; i<rear+1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
class QueueArray{
    public static void main(String args[]){
        Queue q = new Queue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);
        q.deque();
        q.enque(10);
        q.display();
        q.front();
    }
}