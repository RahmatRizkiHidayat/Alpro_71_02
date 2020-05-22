package ch07;

public class AlgoritmaMergeSort{
	public void merge(int arr[], int l, int m, int r){ 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		for (int x=0; x < n1; ++x) 
			L[x] = arr[l + x]; 
		for (int y=0; y < n2; ++y) 
			R[y] = arr[m + 1+ y]; 

		int x = 0, y = 0; 

		int k = l; 
		while (x < n1 && y < n2){ 
			if (L[x] <= R[y]){ 
				arr[k] = L[x]; 
				x++; 
			} 
			else{ 
				arr[k] = R[y]; 
				y++; 
			}k++; 
		} 
			
		while (x < n1){ 
			arr[k] = L[x]; 
			x++; 
			k++; 
		} 

		while (y < n2){ 
			arr[k] = R[y]; 
			y++; 
			k++; 
		} 
	} 

	public void sort(int arr[], int l, int r){ 
		if (l < r){ 
			int m = (l+r)/2; 
			sort(arr, l, m); 
			sort(arr , m+1, r); 
			merge(arr, l, m, r); 
		} 
	}
	public static void printArray(int arr[]) { 
		int n = arr.length; 
		for (int x=0; x < n; ++x) 
			System.out.print(arr[x] + " "); 
		System.out.println(); 
	}
}