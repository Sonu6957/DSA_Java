package LinkedList.Basics;

public class CLL {
    private Node head;
    private int size;

    public class Node{
        int value;
        Node next;
        
        public Node(int val){
            this.value = val;
            this.next = null;
            
        }
    }
    public CLL(){
        this.size = 0;
        this.head=null;
       
    }
    public void display(){
        Node temp = this.head;
        do { 
            System.out.print(temp.value+"->");
            temp=temp.next;            
        } while (temp!=head);
        System.out.print("HEAD");
    }
    public void insertAtEnd(int val){
        
        Node newNode = new Node(val);
        if(size==0){
            this.head = newNode;
            head.next = newNode;
            this.size++;
            return;
        }
        Node temp = this.head;
        do { 
            temp=temp.next;            
        } while (temp.next!=head);
        temp.next = newNode;
        newNode.next = this.head;
        this.size++;
    }
}
