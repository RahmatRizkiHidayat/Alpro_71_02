package ch07;
public class AlgoritmaCocktailShakerSort{
	public void cocktailSort(int a[]){ 
		boolean swapped = true; 
		int start = 0; 
		int end = a.length; 

		while (swapped == true){ 
			swapped = false; 
			for (int x = start; x < end - 1; ++x){ 
				if (a[x] > a[x + 1]) { 
					int temp = a[x]; 
					a[x] = a[x + 1]; 
					a[x + 1] = temp; 
					swapped = true; 
				} 
			} 
			if (swapped == false) 
				break; 

			swapped = false; 

			end = end - 1; 

			for (int x = end - 1; x >= start; x--){ 
				if (a[x] > a[x + 1]) { 
					int temp = a[x]; 
					a[x] = a[x + 1]; 
					a[x + 1] = temp; 
					swapped = true; 
				} 
			} 
			start = start + 1; 
		} 
	} 

	public void printArray(int a[]){ 
		int y = a.length; 
		for (int x = 0; x < y ; x++) 
			System.out.print(a[x] + " "); 
		System.out.println(); 
	}	

}