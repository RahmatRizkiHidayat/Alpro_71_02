package ch04;
import java.util.Scanner;
public class MenampilkanJumlahAngkaSelisih{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int x = 0;
	int jumlah,jumlah1 = 0;
	
	public void cetak(){
		for (int y = 0; y < 12 ; y++ ) {	
			x=y+1;
			jumlah = angka[y] - angka[x];
			jumlah1=jumlah1+jumlah;
		}
		System.out.print("jumlah selisih adalah : "+jumlah1);
	}

}