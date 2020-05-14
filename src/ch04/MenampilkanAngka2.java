package ch04;
import java.util.Scanner;
public class MenampilkanAngka2{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int[] angka2= {2,12,20,21,22,23,24,25,26,27,28,29,32,42,52,62,72,82,92,102};

	public void cetak(){
		for (int x = 0; x < angka.length ; x++ ) {	
			for (int y = 0; y < angka2.length; y++ ) {
				if (angka[x]==angka2[y]) {
					System.out.println(angka[x]);
				}	
			}
		}
	}
}