import java.util.* ;
import java.io.*;

public class MyLLIterator<E> implements Iterator<E>{
    private Node<E> currentNode;

    public MyLLIterator (Node<E> n){
	currentNode = n;
    }

    public boolean hasNext(){
	if (currentNode.getNext() == null){
	    return false;
	}else{
	    return true;
	}
    }

    public E next(){
	Node<E> temp = currentNode;
	currentNode = currentNode.getNext();
	return temp;
    }

    public void remove(){
    }

}
