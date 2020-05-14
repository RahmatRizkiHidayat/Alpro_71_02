package ch04;
import java.util.Scanner;
public class MenampilkanSebuahAngka{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int angka;
	boolean found = false;
public void cetak(){

	for (int x = 0; x < array.length ; x++ ) {	
			
			System.out.print(array[x]+" . ");
			
		}
		

	}
public void cetak2(){
	for (int x = 0; x < array.length ; x++ ) {	
			
			if (array[x]==angka) {
				found = true;
				int y = x;
				System.out.print("Data Berada pada index ke-"+y);	
			}
		
			
		}
		if(found == false){
			System.out.print("Data Tidak Ditemukan");
		}
}
}
