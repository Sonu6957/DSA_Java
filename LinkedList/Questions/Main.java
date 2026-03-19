package LinkedList.Questions;


public class Main {
    public static void main(String[] args){
        SLL linkedList = new SLL();
         linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.display();
        linkedList.removeDuplicateFromSLL();
        linkedList.display();

        
        
       
    }

}
