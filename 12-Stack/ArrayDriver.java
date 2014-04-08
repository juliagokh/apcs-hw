public class ArrayDriver {
    

    public static void main(String[] args){
	MyStackArray s = new MyStackArray();
	for (int i = 0; i<16; i++)
		s.push(""+i);
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.peek());

    }
}
