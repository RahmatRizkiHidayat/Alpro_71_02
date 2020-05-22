package ch05;

public class ObjectAlgoritmaLongest2{
	public static void main(String args[]){ 
		int arr[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 }; 
		AlgoritmaLongest2 algoritma = new AlgoritmaLongest2();
			int n = arr.length; 
			System.out.println("Length Dari Longest : " + algoritma.lis( arr, n ) + "\n" ); 
	}
}