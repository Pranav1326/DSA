class LinkedList{
    Node head;
    static class Node{
        int value;
        Node next;
        Node(int data){
            this.value = data;
            next = null;
        }
        public static void add(int data){
            
        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        list.head.next = second;
        second.next = third;

        while(list.head != null){
            System.out.print(list.head.value + " ");
            list.head = list.head.next;
        }
    }
}