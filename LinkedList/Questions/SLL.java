package LinkedList.Questions;
public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size = 0;
    }
    public int getSize(){
        return this.size;
    }

    public void insertAtEnd(int val){
        Node newNode =new Node(val);
        if(size==0){
            this.head = newNode;
            this.size++;
            return;
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        this.size++;
    }

    public void insertAtIndex(int val,int index){

        Node temp = this.head;
        for(int i=1;i<index;i++ ){
            temp=temp.next;
        }
        Node node = new Node(val);
        Node temp1 = temp.next;
        temp.next = node;
        node.next=temp1;
        size++;

    }
    public void removeAtIndex(int index){

        Node temp = this.head;
        for(int i=1;i<index;i++ ){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        size--;

    }
    public void deleteLast(){
        if(size ==1){
            this.head = null;
            this.tail = null;
            return;
        }

        Node temp = this.head;
        for(int i=1;i<this.size - 1;i++ ){
            temp=temp.next;
        }
        this.tail = temp;
        temp.next = null;
        size--;

    }
    
    public void insertAtBeginning(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(this.size == 0){
            this.tail = head;
        }
        this.size++;
    }

    public void display(){
        if(this.size == 0){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node Next){
            this.value = value;
            this.next = Next;
        }

    }

    public void removeDuplicateFromSLL(){
        Node temp = this.head;
        while(temp.next!=null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                this.size--;
                temp=temp.next;
            }
            else{
                temp=temp.next;
            }
        }
    }

}
