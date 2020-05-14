package ch04;
import java.util.Scanner;
public class MenampilkanSelisihAngkaDenganAngkaSetelahnya{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int x = 0;
	public void cetak(){
		for (int y = 0; y < 12 ; y++ ) {	
			x=y+1;
			System.out.print("(");
			System.out.print(angka[y]-angka[x]+"),");
		}
	}

}