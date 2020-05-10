package ch03;
import java.util.Scanner;

public class NilaiTertinggi{
	int x,y;

	public int getVariabelX(){
		return x;
	}
	public int getVariabelY(){
		return y;
	}
	public void cetak(){
		if (x>y) {
			System.out.println("Nilai Variabel X yaitu "+x+" Lebih Tinggi dari Nilai Variabel Y yaitu "+y);
		}else{
			System.out.println("Nilai Variabel Y yaitu "+y+" Lebih Tinggi dari Nilai Variabel X yaitu "+x);
		}
	}	

}
