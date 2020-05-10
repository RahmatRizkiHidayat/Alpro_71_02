package ch03;
import java.util.Scanner;

public class NilaiTertinggi2{
	int x,y,z;

	public int getNilaiX(){
		return x;
	}
	public int getNilaiY(){
		return y;
	}
	public int getNilaiZ(){
		return z;
	}
	public void cetak(){
		if (x>y) {
			System.out.println("Variabel X yaitu "+x+" Lebih Tinggi dari Variabel Y yaitu "+y);
		}if(x>z){
			System.out.println("Variabel X yaitu "+x+" Lebih Tinggi dari Variabel Z yaitu "+z);
		}if(y>x){
			System.out.println("Variabel Y yaitu "+y+" Lebih Tinggi dari Variabel X yaitu "+x);
		}if(y>z){
			System.out.println("Variabel Y yaitu "+y+" Lebih Tinggi dari Variabel Z yaitu "+z);
		}if(z>x){
			System.out.println("Variabel Z yaitu "+z+" Lebih Tinggi dari Variabel X yaitu "+x);
		}if(z>y){
			System.out.println("Variabel Z yaitu "+z+" Lebih Tinggi dari Variabel Y yaitu "+y);
		}
		if (x>y&&x>z) {
			System.out.println("Jadi Nilai Variabel Tertinggi adalah Variabel X yaitu "+x+" Lebih Tinggi dari Variabel Y yaitu "+y+" dan Variabel Z yaitu "+z);
		}else if(y>x&&y>z){
			System.out.println("Jadi Nilai Variabel Tertinggi adalah Variabel Y yaitu "+y+" Lebih Tinggi dari Variabel X yaitu "+x+" dan Variabel Z yaitu "+z);
		}else{
			System.out.println("Jadi Nilai Variabel Tertinggi adalah Variabel Z yaitu "+z+" Lebih Tinggi dari Variabel X yaitu "+x+" dan Variabel Y yaitu "+y);
		}
	}
}