import java.util.*;
import java.io.*;

public class question2{
    
    String name;
    File file;
    Scanner in;

    public question2(String name){
	this.name = name;
	try{
	    file = new File(name);
	    in = new Scanner(file);
	}catch (Exception e){
	    System.out.println("File not found");
	}
    }

    public void bales(){
	int numBales = in.nextInt();
	int[] piles = new int[numBales];
	for ( int x = 0; x < piles.length; x++){
	    piles[x] = in.nextInt();
	}
    }

    public int shift(){
	int counter = 0;
	int sum = 0;
	for (int x = 0; x < piles.length; x++){
	    sum += piles[x];
	}
	int avg = sum / numBales;
	for (int x = 0; x < piles.length; x++){
	    if (piles[x] > avg){
		counter = piles[x] - avg;
	    }
	}
	return counter;
    }

     public static void main(String[] args){
	PrintWriter out = null;
	try{
	    out = new PrintWriter(new BufferedWriter(new FileWriter("DIGIT.OUT")));
	} catch (Exception e){};
	
        question2 question = new question2("DIGIT.IN");
	question.bales();
	System.out.println(question.shift());

    }
	
}
