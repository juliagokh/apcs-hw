import java.util.*;
import java.io.*;

public class QuickSelect{

    public static int partition(int[] A, int low, int high){
	int part= low + new Random().nextInt(high - low + 1);
	int top = A[high];
	A[high] = A[part];
	A[part] = top;
        int pos = low;
        for (int x = pos; x < high; x++) {
            if (A[x] < A[high]) {
		top = A[x];
		A[x] = A[pos];
		A[pos] = top;
                pos++;
            }
        }
	top = A[pos];
	A[pos] = A[high];
	A[high] = top;
        return pos;
    }
    
    public static int quickSel(int[] A, int k, int low, int high){
	if (low >= high){
	    return A[low];
	}
	int p = partition(A, low, high);
	if (p == k) {
	    return A[k];
	}
        if (p < k) {
	    return quickSel(A, k, p+1, high);
	}
	else {
	    return quickSel(A, k, low, p-1);
	}
    }

    public static void main(String[] args) {
	int[] A = {13, 28, 19, 134, 69, 72, 109, 218, 7, 18, 5};
	System.out.println(quickSel(A, 7, 0, A.length -1));
    }

   
}
