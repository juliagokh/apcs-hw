public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head = null;
    }

    public void add(String d){
	Node temp = new Node(d);
	//Works no matter what (even if the list is empty
	temp.setNext(head); //You have to do this first
	head = temp; // You have to do this second
    }
    /*
    public boolean hasNext(Node node){
	return (node.getNext() == null);
    }
    */
    
    public String toString(){
	String res = "{";
	Node tmp = new Node("");
	tmp = head;
	//I need to figure out how to keep this from crashing.
	while (tmp.getNext() != null){
	    res += tmp.getData() + ", ";
	    tmp = tmp.getNext();
	}
	res += "}";
	return res;
    }
    
}
