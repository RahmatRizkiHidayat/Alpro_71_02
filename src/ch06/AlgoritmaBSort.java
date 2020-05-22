package ch06;

public class AlgoritmaBSort{
	static void bubbleSort(int arr[], int n) 
	{ 
		int x, y, temp; 
		boolean swapped; 
		for (x = 0; x < n - 1; x++) 
		{ 
			swapped = false; 
			for (y = 0; y < n - x - 1; y++) 
			{ 
				if (arr[y] > arr[y + 1]){ 
					temp = arr[y]; 
					arr[y] = arr[y + 1]; 
					arr[y + 1] = temp; 
					swapped = true; 
				} 
			} 
			if (swapped == false) 
				break; 
		} 
	} 

	static void printArray(int arr[], int size){ 
		int x; 
		for (x = 0; x < size; x++) 
			System.out.print(arr[x] + " "); 
		System.out.println(); 
	} 

	public static void main(String args[]){ 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		int x = arr.length; 
		bubbleSort(arr, x); 
		System.out.println(" Urutan Setelah di BSort : "); 
		printArray(arr, x); 
	}
}