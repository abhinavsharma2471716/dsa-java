package LinkedList;

class LL{

    Node head;

    private int size;

    LL(){
        size=0;
    }
    public class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
        }
        lastNode.next =newNode;
    }

    public void print(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode =currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head==null){
            return;
        }
        // Node currNode = head;
        //head =  currNode.next;
        size--;
        head = this.head.next;
    }

    public void removeLast(){
        if(head==null){
            return;
        }
        size--;
        Node currNode = head;
        Node secondNode = head.next;

        while(secondNode.next != null){
            secondNode = secondNode.next;
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public int getsize(){
        return size;
    }

    public void addInMiddle(int index, String data){
        if(index<0 || index > size){
            System.out.println("Invalid Index...");
            return;
        }
        Node newNode = new Node(data);
        if(head == null || index ==0){
            newNode.next =head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for( int i=1;i<size;i++){
            if(i==index){
                Node nextNode = currNode.next;
                currNode.next =  newNode;
                newNode.next = nextNode;
                break;
            }
            currNode =currNode.next;
        }
    }
    public static void main(String[] args) {
         LL list = new LL();
         list.addFirst("This");
         list.print();
         list.addLast("is");
         list.print();
         list.removeFirst();
         list.print();
        list.addFirst("This");
        list.print();
        list.removeLast();
        list.print();
        list.addLast("is");
        list.addLast("a");
        list.addLast("List");
        list.print();
        System.out.println(list.getsize());
        list.addInMiddle(2,"not");
        list.print();
        System.out.println(list.getsize());


    }

}

