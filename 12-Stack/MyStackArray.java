public class MyStackArray {
    private String[] stack;  
    private int i;
    
    public MyStackArray(){
        stack = new String[10];
	i = stack.length - 1;;
    }

    public void push(String s){
        if (stack[i] == null){
	    stack[i] = s;
	    return;
	}else if (i == 0){
	    makeBigger();
	}
	i --;
    }

    public void makeBigger(){
	String[] temp = new String[i+10];
	for (int x = 0; x < stack.length; x ++){
	    temp[x+10] = stack[x];
	}
	stack = temp;
	i = i + 10;
    }

    public String pop() {
	String s = stack[i];
	i++;
	return s;
    }

    public String peek() {
	return stack[i];
    }

    public boolean isEmpty() {
	return stack[stack.length - 1] == null;
    }

    public String toString() {
	String s = "";
	for (int x = i; x <stack.length; x++){
	    s += stack[x] + ", ";
	}
	return s;
    }

}
