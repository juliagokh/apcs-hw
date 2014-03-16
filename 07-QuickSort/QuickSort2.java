import java.util.*;
import java.io.*;

public class QuickSort2{

    public static Integer[] partition (Integer[] A, int L, int R){
	int pivotInd;
	int wall = L;
	pivotInd = L + (int)(Math.random()*(R - L + 1));
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
	A[R] = A[wall];
	A[wall] = pivotVal;
	return A;
    }

    public static Integer[] quickSort(Integer[] A) {
	if(A.length <= 1) {
	    return A;
	}
	else {
	    int L = 0;
	    int R = A.length - 1;
	    A = partition(A, L, R);
	    return A;
	}
    }
    
    public static void main(String[] args) {
	Integer[] A = {13, 28, 19, 134, 69, 72, 109, 218, 7, 18, 5, 1, 14, 6};
	Integer[] B = quickSort(A);
	for(int x = 0; x < B.length; x++) {
	    System.out.print(B[x] + ", ");
	}
    }
}
	
	
