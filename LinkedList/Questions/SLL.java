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

    public static void displayList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("END"); 
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
// Remove Duplicates from Sorted List
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
// Merge two sorted Linked List
    public static Node mergeSorted(Node L1head,Node L2head){
        Node first = L1head;
        Node second = L2head;
        SLL Merged = new SLL();
        while(first!=null && second!=null){
            if(first.value == second.value){
                Merged.insertAtEnd(first.value);
                Merged.insertAtEnd(second.value);
                first=first.next;
                second = second.next;
            }
            else if(first.value < second.value){
                    Merged.insertAtEnd(first.value);
                    first = first.next;
            }
            else {
                Merged.insertAtEnd(second.value);
                    second = second.next;
            }
        }
        if(first!=null){
            while(first!=null){
                Merged.insertAtEnd(first.value);
                first = first.next;
            }
        }
        else if(second!=null){
            while(second!=null){
                Merged.insertAtEnd(second.value);
                second = second.next;
            }
        }
        return Merged.head;
    }
    //Detect Cycles
    public static boolean detectCycles(SLL LL){
        Node fast = LL.head;
        Node slow = LL.head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //Count the number of nodes in a cycle
     public static int lengthOfCycle(SLL LL){
        Node fast = LL.head;
        Node slow = LL.head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                int counter = 0;
                do { 
                    slow=slow.next;
                    counter++;
                } while (slow!=fast);
                return counter;
            }
        }
        return 0;
    }
    //Find where the cycle starts
    public static Node findCycleStartSpot(SLL LL){
        Node f = LL.head;
        Node s = LL.head;
        int length = lengthOfCycle(LL);
        //find start
        while(length>0){
            s = s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    public static void makeCycle(SLL LL){
        Node node = LL.head;
        int counter = 0;
        Node requiredNode = LL.head;
        while(node.next != null){
            if(counter==3){
               requiredNode = node;
            }
            node = node.next;
            counter++;
        }
        node.next = requiredNode;
        
    }
    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null ){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    //Reverse a linkedList
    public static Node reverseLL(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        while(curr!= null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next=next.next;
            }
        }
        head = prev;
        return prev;
    }
    //Reverse LinkedList in section with left and right index.
    public static Node reverseLinkedListInSection(Node head, int left, int right){
        if(head == null || head.next==null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        for(int i = 0;i<left;i++){
           prev = curr;
            curr = next;
            if(next!=null){
                next=next.next;
            } 
        }
        Node lastEnd = prev;
        
        for(int i = 0;i<(right-left)+1;i++){
            if(curr!= null){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next!=null){
                    next=next.next;
                }
            }   
        }
        if(lastEnd!=null){
        lastEnd.next.next = curr;
        lastEnd.next = prev;
        
        }
        return head;
        
    }

    //Sorting Linked List
    public static Node mergeSort(Node head){
        if(head==null || head.next==null ){
            return head;
        }
        Node mid = findMiddle(head);
        Node head2 = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(head2);
        return mergeSorted(left, right);        
        

    } 
    

    public static void main(String[] args){
        SLL linkedList = new SLL();
        SLL linkedList2 = new SLL();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(7);
        linkedList2.insertAtEnd(1);
        linkedList2.insertAtEnd(4);
        
       
        

        
        Node ans = findMiddle(linkedList.head);

        System.out.println(ans.value);

        
        
        
       
    }

}
