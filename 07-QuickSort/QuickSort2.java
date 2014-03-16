import java.util.*;
import java.io.*;
import java.util.Random;

public class QuickSort2{

    public static int partition (int[] A, int L, int R){
	int pivotInd;
	int wall = L;
	Random rand = new Random();
	pivotInd = rand.nextInt(L, R+1);
	int pivotVal = A[pivotInd];
	A[pivotInd] = A[R];
	A[R] = pivotVal;
	for (int x = L; x < R; x++){
	    int temp = 0;
	    if (A[x] < pivotVal){
		wall++;
		temp = A[wall - 1];
		A[wall - 1] = A[x];
		A[x] = temp;
	    }else if (A[x] > pivotVal){
		temp = A[wall + 1];
		A[wall + 1] = A[x];
		A[x] = temp;
	    }
	}
	A[wall] = pivotVal;
	
