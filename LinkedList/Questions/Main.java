package LinkedList.Questions;

public class Main {
    public static void main(String[] args){
        SLL linkedList = new SLL();
        SLL linkedList2 = new SLL();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(4);
        linkedList2.insertAtEnd(1);
        linkedList2.insertAtEnd(4);
        linkedList2.insertAtEnd(5);
        linkedList.display();
        linkedList2.display();
        mergeSorted(linkedList, linkedList2);
        linkedList.display();

        
        
       
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

    public SLL mergeSorted(SLL L1,SLL L2){
        Node first = L1.head;
        Node second = L2.head;
        SLL Merged = new SLL();
        while(first!=null || second!=null){
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
        return Merged;
    }
    

}
