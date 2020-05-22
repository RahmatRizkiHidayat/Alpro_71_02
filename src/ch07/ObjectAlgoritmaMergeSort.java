package ch07;

public class ObjectAlgoritmaMergeSort{
	public static void main(String args[]){ 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 

		AlgoritmaMergeSort algoritma = new AlgoritmaMergeSort(); 
		System.out.println("Array Yang Dimasukan : "); 
		algoritma. printArray(arr); 

		algoritma.sort(arr, 0, arr.length-1); 
		System.out.println();
		System.out.println("Array Setelah Di Merge Sort : "); 
		algoritma.printArray(arr); 
	} 
}