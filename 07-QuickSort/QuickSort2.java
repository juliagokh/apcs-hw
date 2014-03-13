import java.util.*;
import java.io.*;
import java.util.Random;

public class QuickSort2{

    public static int partition (int[] A, int L, int R){
	int pivotInd;
	int wall;
	Random rand = new Random();
	pivotInd = rand.nextInt(L, R+1);
	int pivotVal = A[pivotInd];
	A[pivotInd] = A[R];
	A[R] = pivotVal;
	for (int x = L; x < R; x++){
