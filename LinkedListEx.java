class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    public void insert(int d){
        Node node = new Node();
        node.data = d;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAt(int d, int index){
        Node node = new Node();
        node.data = d;
        node.next = null;
        if(index == 0){
            insertAtStart(d);
        }
        else{
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void insertAtStart(int d){
        Node node = new Node();
        node.data = d;
        node.next = head;
        head = node;
    }
    public void deleteAt(int index){
        Node n = head;
        for(int i=0; i<=index; i++){
            // if(index == i){
                
            // }
            n = n.next;
        }
    }
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);
    }
}

class LinkedListEx{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(50);
        list.insertAtStart(5);
        list.insertAtStart(2);
        list.insertAt(15, 3);
        list.insertAt(22, 5);
        list.insertAt(1, 0);
        // list.deleteAt(1);
        list.show();
    }
}