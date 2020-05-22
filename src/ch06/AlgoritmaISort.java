package ch06;

public class AlgoritmaISort{
	void sort(int arr[]){ 
		int x = arr.length; 
		for (int y = 1; y < x; ++y) { 
			int key = arr[y]; 
			int z = y - 1; 

			while (z >= 0 && arr[z] > key) { 
				arr[z + 1] = arr[z]; 
				z = z - 1; 
			} 
			arr[z + 1] = key; 
		} 
	} 
	public static void printArray(int arr[]){ 
		int x = arr.length; 
		System.out.print("Urutan Setelah di ISort : "); 		
		for (int y = 0; y < x; ++y) 
			System.out.print(arr[y] + ", "); 

		System.out.println(); 
	} 

}