package ch06;

public class ObjectAlgoritmaISort{
	public static void main(String args[]){ 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 

		AlgoritmaISort algoritma = new AlgoritmaISort(); 
		algoritma.sort(arr); 

		algoritma.printArray(arr); 
	}
}