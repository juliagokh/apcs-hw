import java.util.*;
import java.io.*;


public class QuickSort{

    public static int[] partition(int[] A, int L, int H) {
        int p = L + (int)(Math.random()*(H - L + 1));
	int t = A[H];
	A[H] = A[p];
	A[p] = t;
        int pos = L;
        for (int x = pos; x < H; x++) {
            if (A[x] < A[H]) {
		t = A[x];
		A[x] = A[pos];
		A[pos] = t;
                pos++;
            }
        }
	t = A[pos];
	A[pos] = A[H];
	A[H] = t;
	if(A.length <= 1) {
	    return A;
	}
	else {
	    int[] a = new int[p-L];
	    int[] b = new int[H-p];
	    for(int i = 0; i < a.length; i++) {
		a[i] = A[i];
	    }
	    for(int j = 0; j < b.length; j++) {
		b[j] = A[a.length+j];
	    }
	    a = partition(a, L, p-1);
	    b = partition(b, p+1, H);
	    int[] C = new int[A.length];
	    for(int i = 0; i < a.length; i++) {
		C[i] = a[i];
	    }
	    C[a.length] = a[p];
	    for(int j = 0; j < b.length; j++) {
		C[j+a.length] = b[j];
	    }
	    return C;
	}
    }

    public static int[] quickSort(int[] A) {
	if(A.length <= 1) {
	    return A;
	}
	else {
	    int[] C = new int[A.length];
	    int L = 0;
	    int H = A.length-1;
	    return partition(A, L, H);
	}
    }

    public static void main(String[] args) {
	int[] A = {13, 28, 19, 134, 69, 72, 109, 218, 7, 18, 5};
	int[] B = quickSort(A);
	for(int x = 0; x < B.length; x++) {
	    System.out.print(B[x] + ", ");
	}
    }

}
