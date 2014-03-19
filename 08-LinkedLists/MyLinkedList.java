public class MyLinkedList{
    private Node head, temp;

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
	//adds at a location
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
		pos++;
	    }
	}
	return "";
    }

    
}
