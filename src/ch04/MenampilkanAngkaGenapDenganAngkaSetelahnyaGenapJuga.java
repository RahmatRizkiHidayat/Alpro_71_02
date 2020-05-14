package ch04;
import java.util.Scanner;
public class MenampilkanAngkaGenapDenganAngkaSetelahnyaGenapJuga{
	int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int x = 0;
	int angkanew;
	public void cetak(){
		for (int y = 0; y < 12 ; y++ ) {	
			x=y+1;
			angkanew = angka[y]-angka[x];
			if (angkanew % 2 == 0) {
				System.out.print(angkanew+", ");
			}
		}
	}

}