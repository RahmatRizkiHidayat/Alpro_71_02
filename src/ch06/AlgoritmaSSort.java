package ch06;
public class AlgoritmaSSort{
	public void sort(int arr[]){ 
		int x = arr.length; 

		for (int y = 0; y < x-1; y++) { 
			int min_idx = y; 
			for (int z = y+1; z < x; z++) 
				if (arr[z] < arr[min_idx]) 
					min_idx = z; 

			int temp = arr[min_idx]; 
			arr[min_idx] = arr[y]; 
			arr[y] = temp; 
		} 
	} 
	public void printArray(int arr[]){ 
		int x = arr.length; 
		for (int y=0; y<x; ++y) 
			System.out.print(arr[y]+" "); 
		System.out.println(); 
	}
}