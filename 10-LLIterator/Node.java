public class Node<E>{
    private E data;
    private Node next;
    
    public Node(E d){
	data = d;
	next = null;
    }
    
    public void setData(E d){
	data = d;
    }

    public String getData(){
	return data;
    }

    public void setNext(Node<E> n){
	next = n;
    }

    public Node<E> getNext(){
	return next;
    }

    public String toString(){
	String s ="";
	return s;
    }

    

}
