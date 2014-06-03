import java.util.*;
import java.io.*;

public class Ctiming{
    
    String name;
    File file;
    Scanner in;
    int res = 0;

    public Ctiming(String name){
	this.name = name;
	try{
	    file = new File(name);
	    in = new Scanner(file);
	}catch (Exception e){
	    System.out.println("File not found");
	}
    }

    public int time(){
	int d = in.nextInt();
	int h = in.nextInt();
	int m = in.nextInt();
	if (d < 11 || d == 11 && h < 11 || d == 11 && h == 11 && m < 11){
	    return -1;
	}
	int day = (d - 11) * 1440;
	int hour = Math.abs(h - 11) * 60;
	int min = Math.abs(m - 11);
	res = day + hour + min;
	return res;
    }

    public static void main(String[] args){
	PrintWriter out = null;
	try{
	    out = new PrintWriter(new BufferedWriter(new FileWriter("DIGIT.OUT")));
	} catch (Exception e){};
	
	Ctiming C = new Ctiming("ctiming.in");
        System.out.println(C.time());
    }

}
