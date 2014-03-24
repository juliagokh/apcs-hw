public class LLDriver{
    public static void main(String[] args){
	MyLinkedList2 L = new MyLinkedList2();
	System.out.println(L);
	L.addAtEnd("Sully");
	System.out.println(L);
	L.addAtStart("Mike");
	System.out.println(L);
	L.addAtEnd("Randall");
	System.out.println(L);
	L.addAtEnd("Boo");
	System.out.println(L);
	System.out.println(L.get(2));
	System.out.println(L.find("Mike"));
	System.out.println(L.find("Julia"));
	System.out.println(L.length());
	System.out.println(L.toString());
	System.out.println(L.set(2, "Julia"));
	System.out.println(L.toString());
	L.add(2, "Hailey");
	System.out.println(L.toString());
	System.out.println(L.remove(3));
	System.out.println(L.toString());		       	     			   
    }
}
