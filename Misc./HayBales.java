import java.util.*;
import java.io.*;

public class HayBales{
    
    String name;
    File file;
    Scanner in;

    public Haybales(String name){
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
	for ( x = 0; x < piles.length; x++){
	    piles[x] = in.nextInt();
	}
    }

    public int shift(){
	int counter = 0;
	int sum = 0;
	for (x = 0; x < piles.length; x++){
	    sum += piles[x];
	}
	int avg = sum / numBales;
	

	
