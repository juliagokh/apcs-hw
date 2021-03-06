public class MyLinkedList{
    private Node head, temp, temp2;

    public MyLinkedList(){
	head = null;
    }

    public void add(String d){
	Node temp = new Node(d);
	//Works no matter what (even if the list is empty
	temp.setNext(head); //You have to do this first
	head = temp; // You have to do this second
    }
    
    public String toString(){
	//Works
	String res = "{";
	temp = head;
	while (temp != null){
	    res += temp.getData() + ", ";
	    temp = temp.getNext();
	}
	res += "}";
	return res;	       
    }
 

    public String get (int x){
	// returns the String @ location x.
	// Works
	temp = head;
	for (int pos = 0; pos < x; pos++){
	    temp = temp.getNext();
	}
	return temp.toString();
    }

    public int find (String s){
	// returns the location of the item with value s
	// or -1 if not found.
	// Works
	temp = head;
	int pos = 0;
        while (temp != null){
	    if (temp.getData().equals(s)){
		return pos;
	    }else{
		pos++;
		temp = temp.getNext();
	    }
	}
	return -1;
    }
    
    public int length(){
	//Works
	int counter = 0;
	temp = head;
	while (temp != null){
	    counter++;
	    temp = temp.getNext();
	}
	return counter;
    }
    
    public void add(int x, String s){
	//add s at a location x
	int pos = 0;
	temp = head;
	temp2 = temp.getNext();
	while (pos < x-1){
	    temp = temp.getNext();
	    temp2 = temp2.getNext();
	    pos++;
	}
	Node nuevo = new Node(s);
	nuevo.setNext(temp2);
	temp.setNext(nuevo);
    }

    public String set(int x, String s){
	//sets location x to String s
	//it's changing something but not the right thing
	//Works (as in doesn't crash) but doesn't work correctly
	temp = head;
	int pos = 0;
	String res = "";
	while (temp != null){
	    if (pos == x){
		res = temp.getData();
		temp.setData(s);
		return res;
	    }else{
		temp = temp.getNext();
		pos++;
	    }
	}
	return "";
    }

    public String remove (int x){
	//remove and return the String at x
	int pos = 0;
	temp = head;
	temp2 = temp.getNext();
	while (pos < x - 1){
	    temp = temp.getNext();
	    temp2 = temp2.getNext();
	    pos++;
	}
	String res = temp2.getData();
	temp.setNext(temp2.getNext());
	return res;
    }
	
}

    
