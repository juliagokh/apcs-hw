import java.util.*;
import java.io.*;

public class RPN{

    int a, b;

    public RPN(){
	MyStack stack = new MyStack();
    }

    //I had to look up the "Parse" command thing because I have never seen 
    //it before in my life. Gasp!

    public void calculator(String s){
	if (s != "+" && s != "-" && s != "/" && s != "*"){
	    stack.push(s);
	}else{
	    a = Integer.parseInt(stack.pop());
	    b = Integer.parseInt(stack.pop());
	    if (s.equals("+")){
		stack.push("" + (x+y));
	    }else if (s.equals("-")){
		stack.push("" + (x-y));
	    }else if (s.equals("*")){
		stack.push("" + (x*y));
	    }else if (s.equals("/")){
		stack.push("" + (x/y));
	    }
	}
    }

    public String clear(){
	while (!stack.isEmpty()){
	    stack.pop();
	}
	return "Memory Cleared";
    }

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String t = "";
	RPN R = new RPN();
	System.out.println("Calculator is on. Enter \"off\" when you would like to turn off the claculator.");
	while (!t.equals("off")){
	    t = in.next();
	    if (t.equals("clear")){
		R.clear();
	    }else{
		R.calculate(t);
		System.out.println("Memory (stack): " + R.t);
	    }
	}
    }
}
	    
		

    
