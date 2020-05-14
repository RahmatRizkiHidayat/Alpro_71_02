package ch04;
import java.util.Scanner;
public class MenampilkanAngkaDenganSeluruhAngkaSebelumnya{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int sum = 0;
	int x = angka.length-2;
	int y = 0;

	public void cetak(){
		for (int num : angka) {	
			sum = sum + num ;	
		}
			System.out.print(" Adalah : ");
		for (int z = 0; z < angka.length ; z++ ) {	
			if (z>x) {
				System.out.print(angka[z]+"");
			}else{
				System.out.print(angka[z]+", ");
			}
			
		}
		System.out.print("\n\n Jumlah nya Sebagai Berikut : "+sum);
	}
	public void cetak2(){
		for (int i=0; i < angka.length; i++ ) {
			if (angka[i]<=10) {
				y=y+1;
				}	
		}
					int akhir = (angka.length*2)-y;
					System.out.println(" Jumlah angka Sebelumnya :"+akhir);					
	}

}