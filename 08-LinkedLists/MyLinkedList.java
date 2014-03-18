public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head = null;
    }

    oublic void add(String d){
	Node temp = new Node(d);
	//Works no matter what (even if the list is empty
	temp.setNext(head); //You have to do this first
	head = temp; // You have to do this second
    }

    public String to String(){
	return ""+head;
    }
    
}
