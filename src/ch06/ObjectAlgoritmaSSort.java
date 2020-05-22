package ch06;

public class ObjectAlgoritmaSSort{
	public static void main(String args[]) 
	{ 
		AlgoritmaSSort algoritma = new AlgoritmaSSort(); 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		algoritma.sort(arr); 
		System.out.println("Urutan Setelah Di SSort : "); 
		algoritma.printArray(arr); 
	}
}