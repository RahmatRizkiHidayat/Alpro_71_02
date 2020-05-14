package ch04;
import java.util.Scanner;
public class MenampilkanJumlahAngka{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int sum = 0;
	int x = 0;
	
	

	public void cetak(){
		for (int num : angka) {	
			sum = sum + num ;	
		}
		//System.out.println(" Jumlah Data Angka :"+angka.length);
		System.out.println("\n Di Jumlahkan Menjadi : "+sum);

	}
	public void cetak2(){
		for (int y=0; y < angka.length; y++ ) {
			if (angka[y]<=10) {
				x=x+1;
				}	
		}
					int akhir = (angka.length*2)-x;
					System.out.println(" Jumlah angka :"+akhir);					
	}
}