package ch04;
import java.util.Scanner;
public class MenampilkanAngkaKelipatan3{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};


	public void cetak(){
		for (int x = 0; x < angka.length ; x++ ) {	
			
			if (angka[x]%3==0) {
				System.out.print(angka[x]+" , ");
			}
			
		}
	}

}