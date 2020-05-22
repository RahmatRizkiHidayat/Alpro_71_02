package ch07;

public class ObjectAlgoritmaCocktailShakerSort{
	public static void main(String[] args){
		System.out.println(" Program Algoritma Cocktail Shaker Sort! ");
		System.out.println();
		AlgoritmaCocktailShakerSort algoritma = new AlgoritmaCocktailShakerSort(); 
		int a[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		algoritma.cocktailSort(a); 
		System.out.print(" Urutan Array Setelah di CocktailShakerSort : "); 
		algoritma.printArray(a); 
	}

}