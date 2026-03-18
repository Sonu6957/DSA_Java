package LinkedList.Basics;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public void insertAtBeginning(int val){
        Node node = new Node(val);
        if(this.size == 0){
            this.head = node;
            this.tail = node;
            size++;
            return;
        }
        node.next = this.head;
        head.previous = node;
        this.head = node;
        this.size++;
        
    }
    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(this.size ==0){
            insertAtBeginning(val);
            return;
        }
        Node temp = this.head;
        
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
        newNode.previous = temp;
        this.size++;

    }

    public class Node{
        int value;
        Node next;
        Node previous;

        public Node(int val){
            this.value = val;
            this.next = null;
            this.previous=null;
        }
    }
    public DLL(){
        this.size =0;
    }

}
